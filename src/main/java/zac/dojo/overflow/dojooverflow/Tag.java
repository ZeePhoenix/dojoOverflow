package zac.dojo.overflow.dojooverflow;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.ManyToOne;

@Entity
@Table(name="tags")
public class Tag {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String name;
    private Date createdAt;
    private Date updatedAt;
    private List<Tags_Questions> tags_Questions;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<Tags_Questions> getTags_Questions() {
        return this.tags_Questions;
    }

    public void setTags_Questions(List<Tags_Questions> tags_Questions) {
        this.tags_Questions = tags_Questions;
    }

}
