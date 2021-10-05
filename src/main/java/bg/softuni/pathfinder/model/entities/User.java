package bg.softuni.pathfinder.model.entities;

import bg.softuni.pathfinder.model.entities.BaseEntity;
import bg.softuni.pathfinder.model.entities.Role;
import bg.softuni.pathfinder.model.entities.enums.LevelEnum;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User extends BaseEntity {
    @Column(unique =true,nullable = false)
    private String username;
    private int age;
    @Column(nullable = false,name = "full_name")
    private String fullName;
    @Column(nullable = false)
    private String password;
    private String email;
    @ManyToMany
    private Set<Role> roles;
    @Enumerated(EnumType.STRING)
    private LevelEnum level;


    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }
}
