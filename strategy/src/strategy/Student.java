package strategy;

public class Student {

    public int chinese;
    public int math;
    public int english;
    public int other;

    public Student(int chinese, int math, int english, int other) {
        this.chinese = chinese;
        this.math = math;
        this.english = english;
        this.other = other;
    }

    @Override
    public String toString() {
        return "Student{" +
                "chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                ", other=" + other +
                '}';
    }
}
