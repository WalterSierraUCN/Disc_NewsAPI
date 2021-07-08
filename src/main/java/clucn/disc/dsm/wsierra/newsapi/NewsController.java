/*
 * Copyright (c) 2021. Desarrollo de Soluciones Móviles.
 * Departamento de Ingeniería de Sistemas y Computación.
 * Facultad de Ingeniería y Geología.
 * Universidad Católica del Norte.
 *
 */

package clucn.disc.dsm.wsierra.newsapi;

import clucn.disc.dsm.wsierra.newsapi.exceptions.NewsNotFoundException;
import clucn.disc.dsm.wsierra.newsapi.model.News;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The News Controller.
 *
 * @author Walter Sierra-Vega
 */

@Slf4j
@RestController
public class NewsController {

    /**
     * The Repo of News.
     */

    private final NewsRepository newsRepository;

    /**
     * The Constructor.
     * @param newsRepository
     */
    public NewsController(NewsRepository newsRepository){
        this.newsRepository = newsRepository;
    }

    /**
     *
     * @return the list of news in the  backend.
     */
    @GetMapping("/v1/news")
    public List<News> all() {

        // Get all the news.
        return this.newsRepository.findAll();
    }

    /**
     *
     * @param id
     * @return the new
     */
    @GetMapping("/v1/news/{id}")
    public News one(@PathVariable final Long id) {
        return this.newsRepository.findById(id).
                orElseThrow(() -> new NewsNotFoundException("News not found. "));
    }
}
