//import company.Department;
import company.Organization;
import company.defaults.StuffRole;
import utils.UtilsStrings;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("---Tas One---\n");

        System.out.println(UtilsStrings.generateWord(100));
        System.out.println(UtilsStrings.generateNumeric(100));
        System.out.println(Arrays.toString(UtilsStrings.splitByFirst("QWE!RTY!UIO")));
        System.out.println(Arrays.toString(UtilsStrings.splitByFirst("QWEotRTYoUIO")));
        System.out.println(Arrays.toString(UtilsStrings.splitByFirst("Люди! Я люблю Java! Ура!")));
        System.out.println(UtilsStrings.isNumeric("123456"));
        System.out.println(UtilsStrings.isNumeric("01234"));
        System.out.println(UtilsStrings.isNumeric("123!2343"));


        System.out.println("\n---Task Two---\n");

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
