package uaslp.objetos.exams;

import java.util.List;

public class Student {
    private String Name;
    private int code;
    List<Integer> scores;
    private double average;

    public Student(String name, int code) {
        Name = name;
        this.code = code;
    }

    public String getName() {
        return Name;
    }

    public int getCode() {
        return code;
    }

    public void setScore(int index, int score) throws InvalidPartialException {
        if(index<1 || index>3){
            throw new InvalidPartialException();
        }
        scores.add(index,score);

    }

    public double getAverage() throws MissingScoreException{
        if(scores.get(1)==null || scores.get(2)==null ||  scores.get(3)==null){
            throw new MissingScoreException();
        }
        average = scores.get(1)+scores.get(2)+scores.get(3);
        return average/3;
    }

}
