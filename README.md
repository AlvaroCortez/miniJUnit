Mini JUnit
======
##Description
Представьте, что у нас нету библиотеки JUnit и напишите собственную библиотеку miniJUnit, 
которая бы состояла из аннотации @Test и запускала бы все public void методы c пустыми аргументами, 
аннотированные @Test. Предоставьте набор тестов для библиотеки.
##How to use Mini JUnit
java -cp '/Users/denismaslakov/IdeaProjects/TestProjectForMiniJUnit/libs/miniJUnit-1.0-SNAPSHOT.jar:/Users/denismaslakov/IdeaProjects/TestProjectForMiniJUnit/build/classes/java/test' org.jugru.minijunit.MiniJUnitStarter meh.ExampleTest