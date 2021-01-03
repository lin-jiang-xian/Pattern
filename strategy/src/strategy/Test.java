package strategy;

public class Test {
    public static void main(String[] args) {
        Student t1 = new Student(100,99,88,91);
        Student t2 = new Student(99,100,89,93);
        Student t3 = new Student(95,100,99,91);
        Student t4 = new Student(89,92,92,90);
        Student t5 = new Student(93,96,85,96);
        Student t6 = new Student(99,98,90,94);
        Student[] students = new Student[]{t1,t2,t3,t4,t5,t6};
//        sort(students,new StudentChineseComparator());
        sort(students,new StudentMathComparator());
        for (Student student : students) {

            System.out.println(student);
        }
    }
    static void sort(Student[] students,Comparator comparator){
        for(int i = 0; i < students.length; ++i){
            for (int j = 1; j < students.length - i; ++j){
                if(comparator.compare(students[j - 1],students[j]) > 0){
                    swap(students,j - 1, j);
                }
            }
        }
    }

    private static void swap(Student[] students, int i, int j) {
        Student temp = students[i];
        students[i] = students[j];
        students[j] = temp;
    }
}
