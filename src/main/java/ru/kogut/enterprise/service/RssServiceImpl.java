package ru.kogut.enterprise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kogut.enterprise.model.Rss;
import ru.kogut.enterprise.repository.RssRepository;

import java.util.Optional;

@Service
public class RssServiceImpl implements RssService {

    @Autowired
    private RssRepository rssRepository;

    @Override
    public void create(Rss rss) {
        if (rss == null) return;
        rssRepository.save(rss);
    }

    @Override
    public Rss findByID(String id) {
        if (id.isEmpty() || id == null) return null;
        Optional<Rss> rssOptional = rssRepository.findById(id);
        if (rssOptional.orElse(null) == null) return null;
        return rssOptional.get();
    }

    @Override
    public Iterable<Rss> findAll() {
        return rssRepository.findAll();
    }

    @Override
    public void update(Rss rss) {
        create(rss);
    }

    @Override
    public void delete(Rss rss) {
        if (rss == null) return;
        rssRepository.delete(rss);
    }
}
