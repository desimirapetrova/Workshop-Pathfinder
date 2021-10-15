package bg.softuni.pathfinder.model.service;

import bg.softuni.pathfinder.model.entities.Category;
import bg.softuni.pathfinder.model.entities.Picture;
import bg.softuni.pathfinder.model.entities.User;
import bg.softuni.pathfinder.model.entities.enums.LevelEnum;

import javax.persistence.*;
import java.util.Set;

public class RoureServiceModel {
    private Long id;
    private String description;
    private String gpx_coordinates;
    private LevelEnum level;
    private String name;
    private String video_url;
    private User author;
    private Set<Picture> pictures;
    private Set<Category> categories;

    public RoureServiceModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGpx_coordinates() {
        return gpx_coordinates;
    }

    public void setGpx_coordinates(String gpx_coordinates) {
        this.gpx_coordinates = gpx_coordinates;
    }

    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Set<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(Set<Picture> pictures) {
        this.pictures = pictures;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
