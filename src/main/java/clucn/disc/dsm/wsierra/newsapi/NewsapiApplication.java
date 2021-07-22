/*
 * Copyright (c) 2021. Desarrollo de Soluciones Móviles.
 * Departamento de Ingeniería de Sistemas y Computación.
 * Facultad de Ingeniería y Geología.
 * Universidad Católica del Norte.
 *
 */

package clucn.disc.dsm.wsierra.newsapi;

import clucn.disc.dsm.wsierra.newsapi.model.News;
import clucn.disc.dsm.wsierra.newsapi.model.Source;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.ZonedDateTime;

/**
 * The NewsAPI Application.
 * @author Walter Sierra-Vega.
 */
@SpringBootApplication
public class NewsapiApplication {


    /**
     * The News Repo to initialize the database.
     */
    @Autowired
    private NewsRepository newsRepository;

    /**
     * The starting point.
     *
     * @param args to use.
     */
    public static void main(final String[] args) {

        SpringApplication.run(NewsapiApplication.class, args);
    }

    /**
     * Initialize the db
     * @return
     */
    @Bean
    protected InitializingBean initializingDatabase(){
        return () ->{
            newsRepository.save(News.builder()
                    .title("Uff")
                    .description(" Ulala")
                    .content(" Esto es una prueba de contenido")
                    .author(" Author test")
                    .publishedAt(ZonedDateTime.now())
                    .source(new Source("Universidad antofagasta"))
                    .url("https://www.soychile.cl/Santiago/Sociedad/2021/07/08/713356/convencion-presos-del-estallido.aspx")
                    .ulrImage("https://img.soy-chile.cl/Fotos/2021/07/08/file_20210708091834.jpg")
                    .build()
            );
            newsRepository.save(News.builder()
                    .title("Ufa")
                    .description(" descripcion test")
                    .content(" contenido de prueba")
                    .author(" test de autor")
                    .publishedAt(ZonedDateTime.now())
                    .source(new Source("Universidad catolica del Norte"))
                    .url("https://www.soychile.cl/Santiago/Sociedad/2021/07/08/713415/convencion-presos-del-estallido-zuniga.aspx")
                    .ulrImage("https://img.soy-chile.cl/Fotos/2021/07/08/file_20210708120310.jpg")
                    .build()
            );
          };

    }
}
