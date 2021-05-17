package uaslp.objetos.exams;

import java.util.List;

public class Group{
    private int capacity;
    private int Availability;
    List<Student> students;
    private double average;

    public Group(int capacity) {
        this.capacity = capacity;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getCapacity() {
        return capacity;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public int getAvailability() {
        return capacity-students.size();
    }

    public double getAverage() throws MissingScoreException {
        double GA = 0;
        for(int i=0; i<students.size(); i++)
        {
            GA=GA+students.get(i).getAverage();
        }
        return GA/students.size();
    }
}
