# Algorithms | Homework - 4

---
## Table of content
* [Main](./src/main/java/algorithms/Main.java)
* [A* Path Finder Class](./src/main/java/algorithms/path/PathFinder.java)
* [Util Class](./src/main/java/algorithms/util/ReadGrid.java)
## Tasks

* уровень сложности: Решить задачу одним из методов
динамического программирования:<br><br>
Самый дешёвый путь
В каждой клетке прямоугольной таблицы N*M записано некоторое число.
Изначально игрок находится в левой верхней клетке.
За один ход ему разрешается перемещаться в соседнюю клетку
либо вправо, либо вниз
(влево и вверх перемещаться запрещено). При проходе через
клетку игрок платит определенную сумму, значение которой
записано в этой клетке.
Требуется найти минимальную стоимость пути, отдав которую
игрок может попасть в правый нижний угол.<br><br>
* Входные данные:
int[][] costs = new int[][]{<br>
  * {0, 1, 4, 4},<br>
    {4, 1, 1, 1},<br>
    {4, 4, 4, 1},<br>
    {4, 4, 4, 0}};<br>

Результат: minCost(costs) = 5

## Solution
Algorithm gives minimal cost of movements.
* `cutPath();` - fills all possible roads with `0`.
* `printRoads()` - prints all possible roads. !!! Under construction !!!
