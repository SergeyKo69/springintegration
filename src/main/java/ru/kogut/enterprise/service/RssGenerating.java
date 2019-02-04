package ru.kogut.enterprise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.kogut.enterprise.common.RandomString;
import ru.kogut.enterprise.integration.RssMessage;
import ru.kogut.enterprise.integration.RssMessageGateway;

import java.util.Date;

@Component
public class RssGenerating {

    private final int RATE = 5000;
    private final RandomString randomString = new RandomString();

    @Autowired
    private RssMessageGateway rssMessageGateway;

    @Scheduled(fixedDelay = RATE)
    public void generatingRss(){
        RssMessage message = new RssMessage();
        message.setTitle(randomString.nextString());
        message.setAuthor(randomString.nextString());
        message.setLink(randomString.nextString());
        message.setPubDate(new Date());
        rssMessageGateway.fire(MessageBuilder
                .withPayload(message)
                .build());

    }

}
