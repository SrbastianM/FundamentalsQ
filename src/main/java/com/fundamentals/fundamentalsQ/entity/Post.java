package com.fundamentals.fundamentalsQ.entity;

import javax.persistence.*;

@Entity
@Table (name = "post")
public class Post {
    @Id
    @Column(name = "id_post", nullable = false, unique = true)
    private Long id;

    @Column(name = "description", length = 255)
    private String description;

    @ManyToOne()
    private User user;

    public Post(){

    }

    public Post(String description, User user) {
        this.description = description;
        this.user = user;
    }

    //GETTERS AND SETTERS

    public String getDescripcion() {
        return description;
    }

    public void setDescripcion(String descripcion) {
        this.description = descripcion;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", user=" + user +
                '}';
    }
}
