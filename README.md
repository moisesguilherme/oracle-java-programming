# Java Programming

Neste repositório coloco anotações e referências dos meus estudos da linguagem Java. Cada tópico está semperado por uma branch.

- 2-3-Abrstract-Class
- 2-4-Exceptions-Assertions
- 3-1-Generics
- 3-2-Collections-Part-1
- 3-3-Collections-Part-2
- 3-4-Sorting-and-Searching
- 4-1-String-Processing
- 4-2-Regular-Expressions
- 4-3-Recursion
- 5-1-Basics-of-IO
- 5-2-Input-and-output-fundamentals

# 5-2 Input and Output Fundamentals

```java
//Create path variables
Path p = Paths.get(”C:/JavaProgramming/gameData”);
Path p1 = Paths.get(”scores”);
Path p2 = Paths.get(”backup”);
Path p3 = Paths.get(”Highscores.txt”);

//create path for working directory
Path woD = p.resolve(p1);
//create path for the working file
Path woF = p.resolve(p1.resolve(p3));
//create pathfor backup directory
Path buD = p.resolve(p2);
//create path for the backup file
Path buF = p.resolve(p2.resolve(p3));

Files.exists(woF);

Files.notExists(buD);

Files.createDirectories(bUD);

Files.createFile(woF);

Files.copy(woF, buF, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
```
# Relativize()
Retorna um caminho relativo entre dois path no mesmo diretório.

# Input and Output Stream Basics

```java
[System.in](http://System.in) an InputStream

System.out a PrintStream

System.err a PrintStream
```