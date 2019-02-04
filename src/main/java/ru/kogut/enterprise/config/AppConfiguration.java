package ru.kogut.enterprise.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.MessageChannel;

@EnableAutoConfiguration
@EnableIntegration
@IntegrationComponentScan("ru.kogut.enterprise.integration")
public class AppConfiguration {

    @Bean
    public MessageChannel RssMessageChanel() {return new DirectChannel();}

}
