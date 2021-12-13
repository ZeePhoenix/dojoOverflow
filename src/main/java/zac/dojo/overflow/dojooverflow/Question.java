package zac.dojo.overflow.dojooverflow;

import javax.persistence.Table;

@Table
@Entity(name="questions")
public class Question {
    private long id;
    private String name;
    private list<tags_questions> tags_Questions;
}
