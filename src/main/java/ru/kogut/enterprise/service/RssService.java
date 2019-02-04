package ru.kogut.enterprise.service;

import ru.kogut.enterprise.model.Rss;

public interface RssService {
    void create(Rss rss);
    Rss findByID(String id);
    Iterable<Rss> findAll();
    void update(Rss rss);
    void delete(Rss rss);
}
