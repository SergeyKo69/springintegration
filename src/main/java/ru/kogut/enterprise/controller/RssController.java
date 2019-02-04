package ru.kogut.enterprise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kogut.enterprise.integration.RssMessageGateway;
import ru.kogut.enterprise.model.Rss;
import ru.kogut.enterprise.service.RssServiceImpl;

@RestController
public class RssController {

    @Autowired
    private RssServiceImpl rssService;

    @Autowired
    private RssMessageGateway rssMessageGateway;

    @GetMapping(value = "/rss", produces = "application/json")
    public Iterable<Rss> getRss(){
        return rssService.findAll();
    }

}
