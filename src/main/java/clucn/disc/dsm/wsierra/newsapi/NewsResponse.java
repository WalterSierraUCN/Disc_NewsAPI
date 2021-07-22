/*
 * Copyright (c) 2021. Desarrollo de Soluciones Móviles.
 * Departamento de Ingeniería de Sistemas y Computación.
 * Facultad de Ingeniería y Geología.
 * Universidad Católica del Norte.
 *
 */

package clucn.disc.dsm.wsierra.newsapi;

import clucn.disc.dsm.wsierra.newsapi.model.News;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

/**
 * @author Walter Sierra-Vega
 */
@Builder
@Getter
public class NewsResponse {

    /**
     * The Status
     */
    private final String status;

    /**
     * The result size
     */
    private final int totalResults;

    /**
     * The News (articles)
     */
    private final List<News> articles;

}
