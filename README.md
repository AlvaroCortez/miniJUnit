# Mini JUnit

## Description
Представьте, что у нас нет библиотеки JUnit и напишите собственную библиотеку miniJUnit, 
которая бы состояла из аннотации @Test и запускала бы все public void методы c пустыми аргументами, 
аннотированные @Test. Предоставьте набор тестов для библиотеки.

## How to use Mini JUnit
Для начала проект, который вы собираетесь тестировать с помощью Mini JUnit 
нужно скомпилировать используя jar файл в папке libs\org.jugru.minijunit.jar 
в качестве библиотеки чтобы ваши тесты успешно скомпилировались.

Все тестовые методы нужно пометить аннотацией org.minijunit.annotation.Test.

Чтобы протестировать свои классы, вы можете запустить Mini JUnit через консоль.
Пример на Linux:
``` bash
$ java -cp 'path/to/minijunit/jar/file:path/to/your/classes' org.jugru.minijunit.MiniJUnitStarter test.package.ClassWithTests1 test.package.ClassWithTests2
```
К примеру для того чтобы протестировать Mini JUnit саму себя потребуется сделать вызов
``` bash
$ java -cp 'path/to/minijunit/project/libs/miniJUnit-1.0-SNAPSHOT.jar:path/to/minijunit/project/build/classes/java/test' org.jugru.minijunit.MiniJUnitStarter org.jugru.minijunit.TestRunnerTest org.jugru.minijunit.CommandLineArgsParserTest org.jugru.minijunit.validation.TestClassValidationTest
```
Так же можно использовать запуск из java кода:
``` java
class OtherClass() {
public static void main(String[] args) {
    new MiniJUnitStarter().runTests(singletonList(test.package.ClassWithTests1.class))
}
```
Главное чтобы тестируемый класс был в classpath'е библиотеки когда она запускается.

## Notes
Все мои личные замечания по своему проекту представлены в Notes.md
