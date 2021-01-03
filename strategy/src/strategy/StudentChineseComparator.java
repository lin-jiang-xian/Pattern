package strategy;

public class StudentChineseComparator implements Comparator<Student>{

    @Override
    public int compare(Student t1, Student t2) {
        if(t1.chinese < t2.chinese) {
            return -1;
        }else if(t1.chinese > t2.chinese){
            return 1;
        }else{
            return 0;
        }
    }
}
