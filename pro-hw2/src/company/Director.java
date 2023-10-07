package company;

import company.defaults.StuffRole;

class Director extends Person{
    StuffRole role;

    Director(int id, String firstName, String lastName, int departmentID, int salary) {
        super(id, firstName, lastName, departmentID, salary);
        this.role = StuffRole.DIRECTOR;
    }

    StuffRole getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Director {id=" + getId() +
               ", firstName= " + getFirstName() +
               ", lastName= " + getLastName() +
               ", role= " + getRole() +
               ", salary= " + getSalary() +
               ", department= " + getDepartmentID() +
               ", workedHours= " + getWorkedHours() + '}';
    }
}
