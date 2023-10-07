package company;

import company.defaults.StuffRole;

class Employee extends Person{
    int directorId;
    StuffRole role;

    Employee(int id, String firstName, String lastName, int departmentID, int salary, int directorId, StuffRole role) {
        super(id, firstName, lastName, departmentID, salary);
        this.directorId = directorId;
        this.role = role;
    }

    int getDirectorId() {
        return directorId;
    }

    void setDirectorId(int directorId) {
        this.directorId = directorId;
    }

    StuffRole getRole() {
        return role;
    }

    void printEmployee() {
        System.out.println(
                "ID: " + getId() +
                        "| Department ID: " + getDepartmentID() +
                        "| First name: " + getFirstName() +
                        "| Last name: " + getLastName() +
                        "| Role: " + getRole() +
                        "| Salary: " + getSalary() +
                        "| Worked Hours ID: " + getWorkedHours() +
                        "| Director ID: " + getDirectorId()
        );
    }

    @Override
    public String toString() {
        return "Employee {id=" + getId() +
                ", firstName= " + getFirstName() +
                ", lastName= " + getLastName() +
                ", role= " + getRole() +
                ", salary= " + getSalary() +
                ", department= " + getDepartmentID() +
                ", workedHours= " + getWorkedHours() +
                ", directorId= " + getDirectorId() + "}";
    }
}
