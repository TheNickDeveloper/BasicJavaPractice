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

  @Test
  public void shouldReturnTotalLoopTimesAfterThreeTypesOfLoop() {
    int totalLoopTimes = 0;
    int forLoopTimes = 5;
    int whileLoopTimes = 4;
    int doWhileLoopTimes = 3;

    for (int i = 0; i<forLoopTimes; i++) {
      Person clonePerson = new Person();
    }
    totalLoopTimes += forLoopTimes;
    assertEquals(totalLoopTimes, Person.counter());

    int j = 0;
    while (j<whileLoopTimes) {
      Person clonePerson = new Person();
      j++;
    }
    totalLoopTimes += whileLoopTimes;
    assertEquals(totalLoopTimes, Person.counter());

    int k=1;
    do {
      Person clonePerson = new Person();
      k++;
    } while (k<=doWhileLoopTimes);
    totalLoopTimes += doWhileLoopTimes;
    assertEquals(totalLoopTimes, Person.counter());
  }

}