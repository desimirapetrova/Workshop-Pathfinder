package bg.softuni.pathfinder.model.entities;

import bg.softuni.pathfinder.model.entities.enums.LevelEnum;
import jdk.jfr.Enabled;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "routes")
public class Route extends BaseEntity{
    @Column(columnDefinition = "TEXT")
    private String description;
    @Column(columnDefinition = "LONGTEXT")
    private String gpx_coordinates;
    @Enumerated(EnumType.STRING)
    private LevelEnum level;
    @Column(nullable = false,unique = true)
    private String name;
    private String video_url;
    @ManyToOne
    private User author;
    @ManyToMany
    private Set<Category> categories;

    public Route() {
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


    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
