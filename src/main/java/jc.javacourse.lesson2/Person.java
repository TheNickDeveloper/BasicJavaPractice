package jc.javacourse.lesson2;

public class Person {
  private static int personCounter;

  public Person () {
    // Default constructor
    personCounter++;
  }

  public String sayHelloToWorld() {
    return "Hello World";
  }

  public String sayHelloTo(String name) { return "Hello " + name; }

  public static int counter() {
    return personCounter;
  }
}