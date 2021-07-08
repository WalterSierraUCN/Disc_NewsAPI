/*
 * Copyright (c) 2021. Desarrollo de Soluciones Móviles.
 * Departamento de Ingeniería de Sistemas y Computación.
 * Facultad de Ingeniería y Geología.
 * Universidad Católica del Norte.
 *
 */

package clucn.disc.dsm.wsierra.newsapi.exceptions;

/**
 * News not found: 404 error
 * @author Walter Sierra-Vega
 */
public class NewsNotFoundException extends RuntimeException {

    /**
     * The constructor.
     *
     * @param message to use.
     */
    public NewsNotFoundException(String message) {
        super(message);
    }

}
