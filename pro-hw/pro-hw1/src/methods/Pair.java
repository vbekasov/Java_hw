/* Задание 3.
Создайте класс для хранения пары строк (Pair). В классе создайте приватные поля first и second.
 Создайте геттеры для этих полей. Создайте блок инициализации,
  в котором выведите в консоль значение полей first и second, а затем присвойте полю first значение “one”,
   а полю second значение «two».
Создайте конструктор по умолчанию (без входных параметров).
 Внутри конструктора выведите в консоль значение полей first и second.
Создайте конструктор, который принимает параметры first и second и обновляет значения соответствующих полей.
 Внутри конструктора выведите в консоль значение полей first и second.
 В программе создайте объект Pair двумя разными конструкторами. */

package methods;

public class Pair {
    private String  first;
    private String  second;

    {
        System.out.printf("%s|%s\n", first, second);
        first   = "one";
        second  = "two";
    }

    public Pair() {
        System.out.printf("%s|%s\n", first, second);
    }

    public Pair(String first, String second) {
        this.first  = first;
        this.second = second;
        System.out.printf("%s|%s\n", first, second);
    }
}
