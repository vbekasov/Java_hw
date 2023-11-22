package company;

class Person {
    int     id;
    String  firstName;
    String  lastName;
    int     departmentID;
    int     salary;
    int     workedHours;

    Person(int id, String firstName, String lastName, int departmentID, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentID = departmentID;
        this.salary = salary;
    }

    int getId() {
        return id;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    int getDepartmentID() {
        return departmentID;
    }

    int getSalary() {
        return salary;
    }

    int getWorkedHours() {
        return workedHours;
    }

    @Override
    public String toString() {
        return "Person {" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", departmentID=" + departmentID +
                ", salary=" + salary +
                '}';
    }
}
