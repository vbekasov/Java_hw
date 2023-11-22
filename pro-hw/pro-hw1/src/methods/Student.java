/* Задание 2.
Создайте класс Студент, имеющий поля имя, фамилия и номер группы.
1 Напишите минимум 2 конструктора для класса Студент.
2 Реализуйте геттеры и сеттеры для класса Студент.
В сеттере сделайте проверку, что номер группы положительный.
 В противном случае бросьте исключение throw new RuntimeException(“Номер группы должен быть положительным”);

3 Создайте метод «перейти в следующую группу».
При вызове метода студент переводится в следующую по номеру группу (чтобы не сдавать экзамены  ).
4 Создайте в программе объект студента.
5 Добавьте клонирующий конструктор к классу Студент. В программе склонируйте созданный ранее объект.
 Проверьте с помощью ==, что объекты имеют разные ссылки в памяти.
  Затем измените одно из полей оригинального студента. Изменилось ли то же поле у клона?
*/
package methods;

public class Student {
    protected String    firstName;
    protected String    lastName;
    protected int       groupId;

    {
        firstName   = "NoFirs";
        lastName    = "NoLast";
        groupId     = 0;
    }

    public Student() {
        System.out.println("Default student created");
    }

    public Student(String firstName, String lastName){
        this.firstName  = firstName;
        this.lastName   = lastName;
    }

    public Student(String firstName, String lastName, int groupId) {
        this(firstName, lastName);
        this.groupId = groupId;
    }

    public Student(Student original) {
        this(
                original.firstName,
                original.lastName,
                original.groupId
        );
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroupId(int groupId) {
        if (groupId < 1){
            throw new RuntimeException("Group ID should be positive.");
        }
        this.groupId = groupId;
    }

    public void increaseGroup(){
        this.groupId++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", groupId=" + groupId +
                '}';
    }
}
