# Task Three
№3
1. Напишите [класс Велосипед](./Bicycle.java)  с минимум пятью полями.
2. В программе создайте 3 разных велосипеда
   (например, шоссейный, горный, детский) и выведите каждый из них в консоль.
3. Создайте массив из этих велосипедов. С помощью `Arrays.toString()`
   превратите массив в строку и выведите в консоль. Запустите программу.
4. Вернитесь в объявление класса велосипед. Переопределите метод `toString`,
   чтобы он выводил полное описание велосипеда по его полям.
   Перейдите в код метода `Arrays.toString()` и посмотрите на его реализацию.
5. В какой момент автомобиль становится строкой внутри этого метода?
---
## Question 4
After overriding method `toString()` it started to return 
instance representation in JSON format.
---
## Question 5
In Java, all classes are nested from class Object and have overridden
method `toString()`. Class `Arrays` prepares String with `StringBuilder`
and fills it with array\`s elements. If it is an array of objects,
`MyObject.toString()` will be used. In this case primitive wrapper
classes should be preferred.

`ArrayList<>` can not use primitives, only wrapper classes.

---
## Implementation in [MainBicycle](./MainBicycle.java)
```
System.out.println("---Task Three---");

Bicycle bice1 = Bicycle.productBecycle(
      "Road", "Factory1", "Ivan",
      6, 213);
Bicycle bice2 = Bicycle.productBecycle(
      "Sport", "Factory2", "Piter",
      12, 321);
Bicycle bice3 = Bicycle.productBecycle(
       "Children", "Factory3", "John",
       3, 123);

System.out.println("Question 2:\n" +
       bice1 + "\n" +
       bice2 + "\n" + bice3 + "\n---------");

Bicycle[] biceArr = {bice1, bice2, bice3};
System.out.println("Question 3, 4:\n" + Arrays.toString(biceArr)
       + "\n---------");
```
