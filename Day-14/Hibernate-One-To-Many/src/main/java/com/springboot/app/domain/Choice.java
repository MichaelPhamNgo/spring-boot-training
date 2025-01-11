package domain;

//import javax.persistence.*;


import javax.persistence.*;

@Entity
@Table(name = "choice")
public class Choice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "choice")
    private String choice;
    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    public Choice() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Choice{" +
                "id=" + id +
                ", choice='" + choice + '\'' +
                '}';
    }
}
