package ru.kogut.enterprise.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import ru.kogut.enterprise.model.Rss;
import ru.kogut.enterprise.service.RssServiceImpl;

@MessageEndpoint
public class RssMessageListener {

    @Autowired
    private RssServiceImpl rssService;

    @ServiceActivator(inputChannel = RssMessageGateway.CHANEL)
    public void handler(final RssMessage rssMessage){
        if (rssMessage == null) return;
        Rss rss = new Rss();
        rss.setTitle(rssMessage.getTitle());
        rss.setAuthor(rssMessage.getAuthor());
        rss.setLink(rssMessage.getLink());
        rss.setPubDate(rssMessage.getPubDate());
        rssService.create(rss);
    }
}
