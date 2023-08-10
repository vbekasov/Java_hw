# Vitalijs Bekasovs Home Work
[Task.](https://docs.google.com/document/d/1tNd3ZqW_u6aR2UR8X0d4Zi7ymYZZfn_ZlCQmSLKfGU4/edit)

## Part One

In [OneMissing](./src/main/java/methods/OneMissing.java) class you can find:
* `public OneMissing()` - default constructor, setting array size to 5 elements.
* `public OneMissing(int total)` - constructor, setting array size to `int total`.
* `public void printArray()` - prints randomized array.
* `public int[] getArr()` - returns array.
* `public int getMissing()` - returns excluded element during the array generation.

In [Main](./src/main/java/Main.java) you can find function finding excluded number, and prints expected number.
```
    private static void checkPartOne() {
        OneMissing testObj = new OneMissing(30);
        testObj.printArray();
        int miss = testObj.getMissing();
        int tmpArr[] = testObj.getArr();
        boolean checkArr[] = new boolean[tmpArr.length + 2];
        int i = -1;

        for (int b : tmpArr)
            checkArr[b-1] = true;
            
           i = -1;
           while (checkArr[++i] == true) {}
           i++;
        System.out.println("Expected : " + miss + " | Actual : " + i);
    }
```
You can [find](./src/test/java/methods/TestUnit1.java) JUnit test.

## Part Two

In [SQLParser](./src/main/java/methods/SQLParser.java) class you can find:
* `public SQLParser(ArrayList<Object> input)` - constructor receives <i>ArrayList</i> with instructions.
* `public void setQuery (ArrayList<Object> input)` - receives <i>ArrayList</i> with instructions.
* `public void printQuery ()` - prints received instructions.
* `public StringBuilder parseSQL()` - returns SQL query in <i>StringBuilder</i> object. If all instructions were <i>null</i> method returns `SELECT * FROM cars WHERE;`
