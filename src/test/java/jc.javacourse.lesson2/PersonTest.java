package jc.javacourse.lesson2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

  @Test
  public void shouldReturnHelloWorld() {
    Person jc = new Person();

    assertEquals("Hello World", jc.sayHelloToWorld());
  }

  @Test
  public void shouldReturnHelloNick() {
    Person jc = new Person();

    String personName = "Nick";

    assertEquals("Hello " + personName, jc.sayHelloTo(personName));
  }

  @Test
  public void shouldReturnTwoAfterInstanceTwoPeople() {
    Person jc = new Person();
    Person nick = new Person();
    Person john = new Person();

    assertEquals(3, Person.counter());
  }

}