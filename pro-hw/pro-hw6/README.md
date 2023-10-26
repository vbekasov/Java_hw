# Homework 6

---
## Table of Contents 
* [FullName](./src/namesTree)
* [Collections](./src/hwcollections/MainCollect.java)
* [Iterator](./src/iterators/MainIterator.java)
---
## Tasks
1. Создайте класс [FullName](./src/namesTree/names/FullName.java)
полного имени человека `(firstName, lastName)`. Создайте 
[TreeSet](./src/namesTree/MainNames.java) с
экземплярами этого класса. При создании TreeSet передайте в него 
[компаратор](./src/namesTree/names/FullNameCompare.java),
который сравнивает экземпляры по полю `firstName`. Выведите множество в консоль.
<br><br>
2. Создайте [коллекцию](./src/iterators/MainIterator.java)
 `(List или Set)`, добавьте несколько элементов.
Организовать цикл `while` по коллекции с помощью итератора.
Организовать цикл `for` (не путать с foreach!) по коллекции с помощью итератора.
<br><br>
3. Создайте [итератор](./src/iterators/MainIterator.java) по массиву целых чисел,
который будет выводить элементы в порядке их убывания.
Исходный массив не должен при этом измениться.