# Task 2
№2
1. Создайте классы `Сотрудник, Директор, Департамент и Организация`.
   Создайте необходимые поля в каждом классе.
2. Какие виды отношений будут между указанными классами?
---
## Table of Contents
* [StuffRole](./defaults/StuffRole.java) - enum with workers roles.
* [Person](./Person.java) - package-private class. Parent of 
`Employee` and `Director` classes.
* [Employee](./Employee.java) - package-private class. 
Child of `Person` class. Represents employee.
* [Director](./Director.java) - package-private class.
  Child of `Person` class. Represents director of department.
* [Department](./Department.java) - package-private class.
Represents department of organisation. Contains one `Director`,
and  `ArrayList<Employee>`.
* [Organization](./Organization.java) - public class. Represents
 organization. Contains `ArrayList<Department>`.
* [MainCompany](./MainCompany.java) - implementation.
---
## [Organization](./Organization.java)
Methods :
* `public Organization(String title, String registrationCode, String hqAddress)` -
constructor. Sets fields and adds department `Head Queter`
with `ID`=1.
* `public void addDirectorByDepartmentId(int id, String firstName, String lastName, int salary)` -
adds director to department by ID. Sets `directorId=departmentId*100 + 1`
, if the first director in department. Next directors gain ID by increasing
ID of previous director.
* `public void addEmployeeByDepartmentId(int id, String firstName, String lastName, int salary, StuffRole role)` -
adds employee to department by ID. Sets `employeeId=departmentID*1000 + 1`
, if the first employee in department. Next employee gain ID by increasing
ID of previous employee. Employee can not be added before the first director.
* More support methods you can find [here.](./Organization.java)
---
## Implementation in [MainCompany](./MainCompany.java)
```
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
```