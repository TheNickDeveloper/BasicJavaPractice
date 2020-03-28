package come.basicjavapractice;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld(){
        Person nick = new Person();
        assertEquals("Hello World", nick.helloWorld());
    }

    @Test
    public void shouldReturnHelloNick(){
        Person person = new Person();
        assertEquals("Hello Nick", person.hello("Nick"));
    }

    @Test
    public void shouldReturnNumberOfPersons(){
        var p1 = new Person();
        var p2 = new Person();
        var p3 = new Person();
        assertEquals(3, p2.numberOfPersons());
    }

}
