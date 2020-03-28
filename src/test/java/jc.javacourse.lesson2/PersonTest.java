package jc.javacourse.lesson2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

  @Test
  public void shouldReturnHelloWorld() {
    Person jc = new Person();

    assertEquals("Hello World", jc.sayHelloToWorld());
  }

}