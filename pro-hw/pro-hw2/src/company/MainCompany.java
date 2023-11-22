package company;

import company.defaults.StuffRole;

public class MainCompany {
    public static void main(String[] args) {
        System.out.println("\n---Task Two: Company---\n");

        Organization org = new Organization("MyComp", "ABC123QWE", "Street 98");
        org.addDepartment("Road 345", "Outbound");

        org.addDirectorByDepartmentId(1, "John", "Smith", 1234);
        org.addDirectorByDepartmentId(2, "Big", "Boss", 4321);

        org.addEmployeeByDepartmentId(1, "First", "Last",123, StuffRole.TEMPORARY_STUFF);
        org.addEmployeeByDepartmentId(2, "Ivan", "Ivanov",123, StuffRole.MANAGER);
        org.addEmployeeByDepartmentId(2, "Qwer", "Ttre",123, StuffRole.WORKER);

        System.out.println(org);

        System.out.println("\n====New Director, Fired Employee | 2nd department====\n");
        org.addDirectorByDepartmentId(2, "New", "Leader", 9876);
        org.deleteEmployeeById(2, 2002);
        System.out.println(org.getDepartmentById(2));
    }
}
