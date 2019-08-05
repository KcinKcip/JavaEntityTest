package model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private Long id;
    private String title;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "topic_id")
    private Set<Topic> topics = new HashSet<>();

    public Set<Topic> getTopics() {
        return this.topics;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
