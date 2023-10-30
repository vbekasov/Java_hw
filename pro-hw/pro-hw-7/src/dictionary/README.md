## Homework 7 | Task 3

### Table of contents

* [Dictionary generator](./methods/DictionaryFromCSV.java)
* [Dictionary in CSV](./resources)
* [Main file](./MainDictionary.java)

### Task

Создайте `программу-переводчик с английского языка`. Пользователь вводит слово
на английском языке, переводчик показывает перевод. Если переводчик
не обнаружил в словаре введённое слово, то он просит пользователя ввести перевод,
после чего сохраняет слово и его перевод в словарь. Программа продолжается,
пока пользователь не введёт `stopTranslate.`

### [Main](./MainDictionary.java)
Creates instance `dictionary` of class `DictionaryFromCSV`.
After that implements `startTranslate()` method.

### [Dictionary Class](./methods/DictionaryFromCSV.java)
This class contains `TreeMap<Character, TreeMap<String, String>>` storing the dictionary.
The key of this map is the first letters of words (A-Z, a-z). Then values are stored next TreeMap where: key - word, value - description.
The aim of this structure is to accelerate search (the dictionary contains 47172 unique words).

* `private final TreeMap<Character, TreeMap<String, String>> dictionary;` - dictionary.
* `public DictionaryFromCSV()` - constructor makes and fills `LinkedList<String>` with lines of CSV file storing dictionary using `readCSV()` method. Next constructor parses only word and definition from a single line and puts them into the dictionary TreeMap.
* `private static LinkedList<String> readCSV()` - method reads CSV file and returns LinkedList with strings of words, description, and other fields are useless for this project.
* `private static String[] parseLine(String line)` - parses string and extracts word and description.
* `private int addDefinition(String[] str)` - receives array of Strings[] (key, description).
  * First, the algorithm checks if there is a key of the first `Character` in the word. If the key does not exist, the method puts a new key and creates a new TreeMap with a word and description.
  * If the key exists, the method checks if there exists a word as a key in the sup-tree.
  * If a word does not exist in the sup-tree, the program puts the word and description as key and description.
  * If the word is already in the tree, the method stacks the second description to exist.

### [CSV Dictionary](./resources)
