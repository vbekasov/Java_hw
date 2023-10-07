# [Task One](./src/utils/UtilsStrings.java)
1 уровень сложности:<br>
№1<br>
Создайте утилитарный класс, который будет хранить полезные методы работы со строками.
В нём будет один приватный конструктор по умолчанию, а также только статические методы:
1. `generateWord` – генерирует строку заданной длины, состоящую только из букв английского алфавита<br>
2. `generateNumeric` – генерирует строку заданной длины, состоящую из цифр<br>
3. `splitByFirst` – находит в строке первый символ, который не является буквой или цифрой и разделяет строку на части,
   используя найденный символ в качестве разделителя.
   Например, `splitByFirst(“Я люблю Java!”)` вернёт массив строк `[“Я”, “люблю”, “Java!”]`,
   а `splitByFirst(“Люди! Я люблю Java! Ура!”)` вернёт массив строк `[“Люди”, “ Я люблю Java”, “ Ура”, “”]`<br>
4. `isNumeric` – проверяет, состоит ли данная строка только из цифр
   (может быть распознана как целое неотрицательное число)<br>
* Используйте все методы в коде метода [main](./src/Main.java).
---
## Implementation in [Main](./../Main.java)
```
System.out.println("---Tas One---\n");

System.out.println(UtilsStrings.generateWord(100));
System.out.println(UtilsStrings.generateNumeric(100));
System.out.println(Arrays.toString(UtilsStrings.splitByFirst("QWE!RTY!UIO")));
System.out.println(Arrays.toString(UtilsStrings.splitByFirst("QWEotRTYoUIO")));
System.out.println(Arrays.toString(UtilsStrings.splitByFirst("Люди! Я люблю Java! Ура!")));
System.out.println(UtilsStrings.isNumeric("123456"));
System.out.println(UtilsStrings.isNumeric("01234"));
System.out.println(UtilsStrings.isNumeric("123!2343"));
```