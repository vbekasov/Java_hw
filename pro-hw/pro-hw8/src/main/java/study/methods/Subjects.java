package study.methods;

public class Subjects {
    final String    subjectName;
    final String    department;
    int             weeklyHours;

    Subjects(String subjectName, String department, int weeklyHours) {
        this.subjectName = subjectName;
        this.department = department;
        this.weeklyHours = weeklyHours;
    }

    public int getWeeklyHours() {
        return weeklyHours;
    }

    public void setWeeklyHours(int weeklyHours) {
        this.weeklyHours = weeklyHours;
    }

    public String getSubjectName() {
        return subjectName;
    }

    @Override
    public String toString() {
        return "Subjects{" + '\'' +
                "department" + department + '\'' +
                "className='" + subjectName + '\'' +
                ", weeklyHours=" + weeklyHours +
                '}';
    }
}
