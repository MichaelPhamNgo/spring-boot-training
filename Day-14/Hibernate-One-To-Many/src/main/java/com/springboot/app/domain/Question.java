package domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "question")
    private String question;
    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private Set<Choice> choices = new HashSet<>();

    public Question() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Set<Choice> getChoices() {
        return choices;
    }

    public void setChoices(Set<Choice> choices) {
        this.choices = choices;
    }

    public void addChoice(Choice choice) {
        this.choices.add(choice);
        choice.setQuestion(this);
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", choices=" + choices +
                '}';
    }
}
