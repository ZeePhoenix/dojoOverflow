package zac.dojo.overflow.dojooverflow;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.ManyToOne;

import java.util.Date;

@Entity
@Table(name="tags_questions")
public class Tags_Questions {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="question_id")
    private Question question;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="tag_id")
    private Tag tag;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Question getQuestion() {
        return this.question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Tag getTag() {
        return this.tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

}
