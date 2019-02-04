package ru.kogut.enterprise.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kogut.enterprise.model.Rss;

@Repository
public interface RssRepository extends CrudRepository<Rss, String> {
}
