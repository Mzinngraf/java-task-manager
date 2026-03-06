package com.taskmanager.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tasks")

public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id ;
    @Column(name = "title")
    private String title ;
    @Column(name = "description")
    private String description ;

    public void setId(Integer id){
        this.id = id;

    }

    public Integer getId() {
        return id;
    }
    public void setTitle(String title){
        this.title = title;

    }

    public String getTitle() {
        return title;
    }
    public void setDescription(String description){
        this.description = description;

    }

    public String getDescription() {
        return description;
    }
}
