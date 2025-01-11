package com.springboot.app.domain;

public class QuestionStringOnly {
    private String question;

    public QuestionStringOnly(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "QuestionStringOnly{" +
                "question='" + question + '\'' +
                '}';
    }
}
