package company;

import company.defaults.StuffRole;
import java.util.ArrayList;
import java.util.List;

class Department {
    int departmentId;
    String address;
    String title;
    Director director;
    List<Employee> employees;

    {
        employees = new ArrayList<>();
        director = null;
    }

    Department(int departmentId, String address, String title) {
        this.departmentId = departmentId;
        this.address = address;
        this.title = title;
    }


    int getId() {
        return departmentId;
    }

    void setId(int id) {
        this.departmentId = id;
    }

    String getAddress() {
        return address;
    }

    void setAddress(String address) {
        this.address = address;
    }

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    void addDirector(int id, String firstName, String lastName, int salary) {
        this.director = new Director( id, firstName, lastName, departmentId, salary);
    }

    void addEmployee(String firstName, String lastName, int salary, StuffRole role) {
        if (this.director == null)
            throw new RuntimeException("No Director set");

        int newId;
        if (employees.isEmpty())
            newId = departmentId * 1000+ 1;
        else
            newId = employees.get(employees.size() - 1).getId() + 1;

        Employee tmp = new Employee(newId, firstName, lastName, this.departmentId,
                salary, this.director.getId(), role);
        employees.add(tmp);
    }

    int getPersonalCount() {
        return employees.size() + 1;
    }

    void deleteEmployeeById(int id) {
        if (employees.isEmpty())
            return ;

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                employees.remove(i);
                return ;
            }
        }

        System.err.println("Employee was not found.");
    }

    @Override
    public String toString() {
        StringBuilder outStr = new StringBuilder();
        outStr.append("Department= {").
                append("departmentId=").append(departmentId).
                append(", address='").append(address).append('\'').
                append(", title='").append(title).append("'}").
                append("\nDirector= ");

        if (director == null) {
            outStr.append(" null| ");
        } else {
            outStr.append(director);
        }
        outStr.append("\nEmployees= ");

        if (employees.isEmpty()) {
            outStr.append("null\n");
        } else {
            for (Employee worker : employees)
                outStr.append("\n").append(worker.toString());
        }

        return outStr.toString();
    }
}
