import java.util.ArrayList;

public class Student {

    //id should be a long number used to represent a "unique user" in our application.
    private long id;
    //name is a String that holds the name of the student.
    private String name;
    //grades is an ArrayList that contains a list of Integer numbers.
    private ArrayList<Integer> grades;

    public Student() {
        this.grades = new ArrayList<>();
    }


    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public Student(long id, String name, ArrayList<Integer> grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    public long getId() {
        return id;
    }

    public Student setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public Student setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
        return this;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        this.grades.add(grade);
    }


    // returns the average of the students grades
    public double getGradeAverage(){

        double total = 0;

        for(double grade : grades) {
            total += grade;
        }

        double average = total / grades.size();

        return average;
    }
}
