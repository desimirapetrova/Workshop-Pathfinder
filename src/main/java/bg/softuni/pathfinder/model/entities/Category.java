package bg.softuni.pathfinder.model.entities;

import bg.softuni.pathfinder.model.entities.enums.RouteLevelEnum;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "categories")
public class Category extends BaseEntity{
    @Column(columnDefinition = "TEXT")
    private String description;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false,unique = true)
    private RouteLevelEnum name;

    public Category() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RouteLevelEnum getName() {
        return name;
    }

    public void setName(RouteLevelEnum name) {
        this.name = name;
    }


}
