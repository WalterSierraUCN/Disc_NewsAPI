/*
 * Copyright (c) 2021. Walter Sierra Vega
 */

package clucn.disc.dsm.wsierra.newsapi.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.ZonedDateTime;

@Builder // The builder pattern
@Getter // All the fields has getter
@NoArgsConstructor // Add empty constructor
@Entity // The JPÄ
public final class News {

    /*
     * Unique Id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /*
     *¨The title.
     * Restrictions:
     * - not null
     * - size > 2
     */
    private String title;
    /**
     * The Source
     */
    private String source;
    /**
     * The Author
     */
    private String author;
    /**
     * The Url
     */
    private String url;
    /**
     * The Url Image
     */
    private String ulrImage;
    /**
     * The description
     */
    private String description;
    /**
     * The content
     */
    private String content;
    /**
     * The Date of Publish.
     */
    private ZonedDateTime publishedAt;



    /** The Constructor.
     *
     * @param id
     * @param title
     * @param source
     * @param author
     * @param url
     * @param ulrImage
     * @param description
     * @param content
     * @param publishedAt
     */

    public News(final Long id, final String title, final String source, final String author, final String url, final String ulrImage, final String description, final String content, final ZonedDateTime publishedAt) {
        // FIXME: add the hash ( title + source + author)


        this.id=id;

        //Title replace
        this.title= (title != null && title.length() > 0) ? title: "No Title";


        // Source validation
        if(source==null){
            throw new IllegalArgumentException("Source was null");
        }

        if( source.length() <= 2){
            throw new IllegalArgumentException("Source size was <= 2 [" + source +"]");
        }
        this.source = source;
        //Author
        this.author = ( author !=null ) ? author:"No Author";


        this.url = url;
        this.ulrImage = ulrImage;
        this.description = description;
        this.content = content;

        //PublishedAt Validation
        if(publishedAt == null){
            throw new IllegalArgumentException("The PublishedAt needed!");
        }
        this.publishedAt = publishedAt;
    }
}
