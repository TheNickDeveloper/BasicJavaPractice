package come.basicjavapractice;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PersonTest {
    private Person person = new Person(1, "Nick");

    @Test
    public void shouldReturnHelloWorld() {
        Assert.assertEquals("Hello World", person.helloWorld());
    }

    @Test
    public void shouldReturnHelloNick() {
        Assert.assertEquals("Hello Nick", person.hello("Nick"));
    }

    @Test
    public void shouldReturnNumberOfPersons() {

        ArrayList<Person> people = new ArrayList();

        for(int i = 0; i < 10; ++i) {
            Person p = new Person(i, String.valueOf(i));
            people.add(p);
        }

        Assert.assertEquals(10L, (long)people.size());
    }

    @Test
    public void shouldReturnSetterName() {
        person.setName("JC");
        Assert.assertEquals("JC", person.getName());
    }

    @Test
    public void shouldHaveNameFromEachPerson() {
        ArrayList<Person> people = new ArrayList();

        for(int i = 0; i < 10; ++i) {
            Person p = new Person(i, String.valueOf(i));
            people.add(p);
        }

        boolean isContainName = true;

        for (var person:people) {
            if (person.getName()==null){
                isContainName = false;
                break;
            }
        }

        Assert.assertEquals(true, isContainName);
    }

    @Test
    public void shouldPrintMsgAccordingLoggingLevel() {
        var status = Status.PENDING;
        Assert.assertEquals("PENDING", person.getStatus(status));
    }

}
