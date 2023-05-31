package task1.entity;

import task1.entity.Question;

public class ValueQuestion {

    private Question question;

    private Double mark = 0.0;

    public ValueQuestion(Question question, Double mark) {
        this.question = question;
        this.mark = mark;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "ValueQuestion{" +
                "question=" + question +
                ", mark=" + mark +
                '}';
    }
}
