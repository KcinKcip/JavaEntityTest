package model;

import javax.persistence.*;

@Entity
public class Topic {
    @Id
    @GeneratedValue
    private Long id;
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        category.getTopics().add(this);
        this.category = category;
    }
}
