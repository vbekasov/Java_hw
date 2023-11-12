package study;

import study.methods.*;

public class StudyMain {
    public static void main(String[] args) {
        System.out.println("Works");
        Student[] studentsArr = new Student[6];

        studentsArr[0] = new Student<>("Q", new Biology(1));
        studentsArr[1] = new Student<>("W", new Chemistry(2));
        studentsArr[2] = new Student<>("E", new Physics(3));
        studentsArr[3] = new Student<>("R", new Mathematics(4));
        studentsArr[4] = new Student<>("T", new Literature(5));
        studentsArr[5] = new Student<>("Y", new Philology(6));

        for (Object it : studentsArr)
            System.out.println(it);
    }
}
