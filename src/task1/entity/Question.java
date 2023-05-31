package task1.entity;

import java.util.ArrayList;

public class Question {

    private int id;

    private String name;

    private ArrayList<Answer> answers;



    private Integer rightAnswer;

//    private Module module;

    public Question(int id, String name, ArrayList<Answer> answers, Integer rightAnswer) {
        this.id = id;
//        this.module = module;
        this.name = name;
        this.answers = answers;
        this.rightAnswer = rightAnswer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<Answer> answers) {
        this.answers = answers;
    }

    public Integer getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(Integer rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", answers=" + answers +
                ", rightAnswer=" + rightAnswer +
                '}';
    }
}
