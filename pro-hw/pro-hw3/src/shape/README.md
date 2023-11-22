# Task One & Two
## Table of contents
* [Tasks](#tasks)
* [Implementation](./MainShape.java)
* [Methods](./methods)
    * [Base Shape](./methods/Shape.java)
    * [Rectangle](./methods/Rectangle.java)
    * [Circle](./methods/Circle.java)
    * [Triangle](./methods/Triangle.java)
    * [Cube](./methods/Cube.java)
    * [IPrintable](./methods/IPrintable.java)
    * [UtilJsonParser](./methods/UtilJsonParser.java)
    * [ErrorShape](./methods/ErrorShape.java)
    * [Enum: ShapesList](./methods/ShapesList.java)

## Tasks
2. Необходимо написать консольное приложение с объектно-ориентированной
архитектурой, выводящее характеристики заданной пользователем 
геометрической фигуры. Пользователь вводит имя фигуры и её 
параметры одной строкой. Результатом работы приложения являются 
вычисленные характеристики. Парсинг введённой пользователем строки
выполните в отдельном утилитарном классе. 
(таблицу входных и выходных данных см. в презентации)


3. Доделайте задание №2. Создайте интерфейс `IPrintable`, 
который будет содержать метод `print().` Каждая фигура должна 
наследовать этот интерфейс. Реализацию метода можно сделать в 
виде вывода фигуры в консоль символами `⧠, ◍, ⊿,` либо текстом 
или графически (нарисовать символами). При выводе данных о 
фигуре также вызовите метод print. Создайте массив `IPrintable` 
из нескольких фигур и в цикле вызовите метод print у каждой фигуры.

| Shape         | Input                       | Output                                                                                                            |
|---------------|:----------------------------|:------------------------------------------------------------------------------------------------------------------|
| Круг          | Радиус                      | Название, Площадь, Периметр, Радиус, Диаметр                                                                      |
| Прямоугольник | Длины сторон (два значения) | Название, Площадь, Периметр, Длина диагонали, Длина (размер длинной стороны), Ширина (размер короткой стороны)    |   
| Треугольник   | Длины сторон (три значения) | Название, Площадь, Периметр, Длина стороны и противолежащий угол для каждой из трех сторон                        |
| Своя фигура   | (придумайте свой вариант)   | Параметры Вашей геометрической фигуры Название, Площадь, Периметр, и другие параметры Вашей геометрической фигуры |
| Cube          | Side                        | Name, Area, Value, Diagonal, Side                                                                                 |

## Classes

* `Shape` - base class. Other shape classes are inherited from this class.
* `UtilJsonParser` - util class required for task two. This class
 parses pseudo JSON input. Syntax :
  * expression starts with `{`
  * field\`s names and values are closed in `'`, 
  and separated with `,`. All names and
  values are strings.
  * format : `{'field':'value','field':'value'}`
  * arrays are closed in `[]`, and keep values string format.
  * format : `{'field':'value','field':['v1','v2']}`
  * in case it is pseudo JSON method grubs only first
  and second value.
* `IPrintable` - interface class.
  * method `print()` is overridden in implementing class.
  * static method `shapeFactory(String uInput)` generates instances
are able be placed into the array of `IPrintable`.  
* `Circel, Cude, Rectangle, Triangle` - classes inherited from 
`Shape` class, and implements `IPrintable` interface.

## [Implementation](./MainShape.java)
```
public static void main(String[] args) {
        IPrintable[] shapesArr = {
                IPrintable.shapeFactory("rrrrr"),
                IPrintable.shapeFactory(""),
                IPrintable.shapeFactory("{'name':'wrong','r':'3'}"),
                IPrintable.shapeFactory(
                        "{'name':'circle','r':'3'}"),
                IPrintable.shapeFactory(
                        "{'name':'rectangle','sides':['2','3']}"),
                IPrintable.shapeFactory(
                        "{'name':'circle','radius':'5'}"),
                IPrintable.shapeFactory(
                        "{'name':'triangle','sides':['3','4','5']}"),
                IPrintable.shapeFactory(
                        "{'name':'triangle','sides':['5','3','40']}"),
                IPrintable.shapeFactory(
                        "{'name':'cube','sides':'3'}")
        };

        for (IPrintable i : shapesArr)
            i.print();
    }
```
---
<b>Output</b>
```
Error input
Error input
Error input
Name: CIRCLE, Area: 28.274334, Perimeter: 18.849556, Radius: 3, Diameter: 6
Name: RECTANGLE, Area: 6, Perimeter: 10, Diagonal 3.605551, Long side 3, Short side 2
Name: CIRCLE, Area: 78.539816, Perimeter: 31.415927, Radius: 5, Diameter: 10
Name: TRIANGLE, Area: 6.000000, Perimeter: 12, Side vs angle: 3 36.869898, 4 53.130102, 5 90.000000
Error Triangle!
Name: CUBE, Area: 54.000000, Value: 27.000000, Diagonal 5.196152, Side 3
```