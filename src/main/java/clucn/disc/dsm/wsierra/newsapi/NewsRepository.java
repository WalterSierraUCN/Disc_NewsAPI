/*
 * Copyright (c) 2021. Desarrollo de Soluciones Móviles.
 * Departamento de Ingeniería de Sistemas y Computación.
 * Facultad de Ingeniería y Geología.
 * Universidad Católica del Norte.
 *
 */

package clucn.disc.dsm.wsierra.newsapi;

import clucn.disc.dsm.wsierra.newsapi.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The News Repository.
 *
 * @author Walter Sierra-Vega
 */
@Repository
public interface NewsRepository extends JpaRepository<News, Long> {

}
