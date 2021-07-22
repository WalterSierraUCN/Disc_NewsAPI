/*
 * Copyright (c) 2021. Desarrollo de Soluciones Móviles.
 * Departamento de Ingeniería de Sistemas y Computación.
 * Facultad de Ingeniería y Geología.
 * Universidad Católica del Norte.
 *
 */

package clucn.disc.dsm.wsierra.newsapi.model;

import com.github.slugify.Slugify;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

/**
 * The Source.
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Source {

    /**
     * The Slugify
     */
    private static final Slugify SLUGIFY = new Slugify();


    /**
     * The name
     */
    private String name;

    public String getId(){
        return SLUGIFY.slugify(this.name);
    }
}
