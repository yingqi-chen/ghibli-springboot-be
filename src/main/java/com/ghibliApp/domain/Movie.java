package com.ghibliApp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "movie")
public class Movie {

    @Id private String id;

    private String title;

    private String origin_title;

    private String description;

    private String director;

    private String producer;

    @Field("release_date")
    private String releaseYear;

    @Field("rt_score")
    private String rtScore;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Movie(String id, String title, String origin_title, String description, String director, String producer, String releaseYear, String rtScore) {
        this.id = id;
        this.title = title;
        this.origin_title = origin_title;
        this.description = description;
        this.director = director;
        this.producer = producer;
        this.releaseYear = releaseYear;
        this.rtScore = rtScore;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrigin_title() {
        return origin_title;
    }

    public void setOrigin_title(String origin_title) {
        this.origin_title = origin_title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getRtScore() {
        return rtScore;
    }

    public void setRtScore(String rtScore) {
        this.rtScore = rtScore;
    }
}