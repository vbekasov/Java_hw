package company;

import company.defaults.StuffRole;

import java.util.ArrayList;

public class Organization {
    private String title;
    private String registrationCode;
    private String hqAddress;
    private final ArrayList<Department> departments;

    public Organization(String title, String registrationCode, String hqAddress) {
        this.title = title;
        this.registrationCode = registrationCode;
        this.hqAddress = hqAddress;

        this.departments = new ArrayList<>();
        this.departments.add(new Department(1, hqAddress, "HQ_" + title));
    }

    public void addDepartment(String address, String title) {
        this.departments.add(new Department(
                departments.get(departments.size()-1).getId() + 1 ,
                address, title));
    }

    public void deleteDepartmentById(int id) {
        if (id == 0) {
            System.err.println("HQ can not be deleted.");
            return ;
        }

        for (int i = 0; i < departments.size(); i++) {
            if (departments.get(i).getId() == id) {
                departments.remove(i);
                return ;
            }
        }

        System.err.println("delete Department do not exist.");
    }

    public void addDirectorByDepartmentId(int id, String firstName, String lastName, int salary) {
        for (Department i: departments) {
            if (i.getId() == id) {
                int newId;
                if (i.director != null)
                    newId = i.director.getId() + 1;
                else
                    newId = id * 100 + 1;

                i.addDirector(newId, firstName,lastName, salary);
                if (!i.employees.isEmpty()) {
                    for (int j = 0; j < i.employees.size(); j++)
                        i.employees.get(j).setDirectorId(newId);
                }
                return ;
            }
        }

        System.err.println("Department not found");
    }

    public void addEmployeeByDepartmentId(int id, String firstName, String lastName, int salary, StuffRole role) {
        for (int i = 0; i < departments.size(); i++) {
            if (departments.get(i).getId() == id) {
                departments.get(i).addEmployee(firstName, lastName, salary, role);
                return ;
            }
        }

        System.err.println("Department not found");
    }

    public void deleteEmployeeById(int departmentId, int employeeId) {
        for (Department i: departments) {
            if (i.getId() == departmentId) {
                i.deleteEmployeeById(employeeId);
                return ;
            }
        }

        System.err.println("delete Emp Department do not exist.");
    }

    public String getDepartmentById(int id) {
        for (Department i: departments) {
            if (i.getId() == id)
                return  i.toString();
        }

        System.err.println("get Department do not exist.");
        return null;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRegistrationCode() {
        return registrationCode;
    }

    public void setRegistrationCode(String registrationCode) {
        this.registrationCode = registrationCode;
    }

    public String getHqAddress() {
        return hqAddress;
    }

    public void setHqAddress(String hqAddress) {
        this.hqAddress = hqAddress;
    }

    @Override
    public String toString() {
        StringBuilder outStr = new StringBuilder();

        outStr.append("Organization{ ").
                        append("title= ").append(title).
                        append("| registrationCode= ").append(registrationCode).
                        append("| hqAddress= ").append(hqAddress).append("}");

        for (Department i: departments) {
            outStr.append("\n-------------------------------------------------\n");
            outStr.append("Departments: ").append(i.toString());
        }

        return outStr.toString();
    }
}
