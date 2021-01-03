package strategy;

public class StudentMathComparator implements Comparator<Student>{

    @Override
    public int compare(Student t1, Student t2) {
        if(t1.math < t2.math) return -1;
        else if(t1.math > t2.math) return 1;
        return 0;
    }
}
