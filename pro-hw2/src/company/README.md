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
  ID of previous employee.