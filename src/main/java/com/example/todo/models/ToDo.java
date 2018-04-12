package com.example.todo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Document(collection="todos")
@JsonIgnoreProperties(value= {"createdAt"}, allowGetters = true)
public class ToDo {
   @Id
    private String id;

   @NotBlank
    @Size(max=100)
    @org.springframework.data.mongodb.core.index.Indexed(unique=true)
    private String title;

   private Boolean completed = false;

   private Date createdAt = new Date();

    public ToDo() {
        super();
    }

    public ToDo(String id, @NotBlank @Size(max = 100) String title, Boolean completed, Date createdAt) {
        this.id = id;
        this.title = title;
        this.completed = completed;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
