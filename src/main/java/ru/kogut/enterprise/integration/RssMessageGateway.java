package ru.kogut.enterprise.integration;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;

@MessagingGateway(
        name = RssMessageGateway.GATEWAY,
        defaultRequestChannel = RssMessageGateway.CHANEL)
public interface RssMessageGateway {

    String CHANEL = "rssMessageChanel";
    String GATEWAY = "rssMessageGateway";

    @Gateway
    void fire(Message<RssMessage> message);
}
