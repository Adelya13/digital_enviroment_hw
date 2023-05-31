package task1.entity;

import java.util.ArrayList;

public class Module {
    private String name;

    private ArrayList<ValueQuestion> valueQuestions;

    private Double mark = 0.0;
    private Boolean done = false;

    public Module(String name, ArrayList<ValueQuestion> valueQuestions) {
        this.name = name;
        this.valueQuestions = valueQuestions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ValueQuestion> getValueQuestions() {
        return valueQuestions;
    }

    public void setValueQuestions(ArrayList<ValueQuestion> valueQuestions) {
        this.valueQuestions = valueQuestions;
    }



    public Double getMark() {

        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Module{" +
                "name='" + name + '\'' +
                ", valueQuestions=" + valueQuestions +
                ", mark=" + mark +
                ", done=" + done +
                '}';
    }
}
