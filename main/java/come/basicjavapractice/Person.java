package come.basicjavapractice;

public class Person {

    private String personName;
    private static int personCounter = 0;

    public Person(){
        personCounter ++;
        //Empty on purpose - default constructor
    }

    public Person(String personName){
        this.personName = personName;
    }

    public String name(){
        return personName;
    }

    public String helloWorld() {
        return "Hello World";
    }


    public String hello(String name) {
        return "Hello " + name;
    }

    public static int numberOfPersons() {
        return personCounter;
    }
}
