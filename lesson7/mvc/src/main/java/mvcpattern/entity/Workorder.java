package mvcpattern.entity;

import javax.persistence.*;

@Entity
@Table(name = "workorder")
public class Workorder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "creationdate")
    private String creationDate;

    @Column(name = "author")
    private String author;

    @Column(name = "description")
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Workorder() {
    }

    public Workorder(String creationDate, String author, String description) {
        this.creationDate = creationDate;
        this.author = author;
        this.description = description;
    }
}
