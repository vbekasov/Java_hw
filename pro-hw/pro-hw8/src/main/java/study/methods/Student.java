package study.methods;

public class Student <T> extends Subjects{
    private String  name;


    public Student(String name, Subjects subjects) {
        super(subjects.getSubjectName(), subjects.department, subjects.getWeeklyHours());
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                "department=" + department + '\'' +
                "subjects=" + this.subjectName + '\'' +
                "hours=" + this.weeklyHours + '\'' +
                '}';
    }
}
