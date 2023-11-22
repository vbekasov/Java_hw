# Task One

1. Создайте программу, использующую перечисление с полями.
   По введённому пользователем названию месяца (на английском языке) программа выводит среднюю температуру месяца и
   к какому сезону года месяц относится `(зима, весна, лето, осень).`

## Table of contents
* [Enums class](./Months.java)
* [Main function](./MainMonths.java)

## [Month class](./Months.java)
* `public enum Months` - contains 12 constant months with temperature and season.
* `private enum Seasons` - contains 4 constant seasons.
* `private int temperature;`
* `private Seasons season;`
* `Months(int temperature, Seasons season)` - constructor.
* `public static void print(String month)` - method returns season and month
temperature based on input month.

## [Implementation](./MainMonths.java)
```
System.out.print("Enter month : ");
Months.print((new Scanner(System.in)).nextLine());
```
