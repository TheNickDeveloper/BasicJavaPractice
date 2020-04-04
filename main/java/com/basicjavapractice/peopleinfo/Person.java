package com.basicjavapractice.peopleinfo;

public class Person {

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String helloWorld() {
        return "Hello World";
    }

    public String hello(String name) {
        return "Hello " + name;
    }

    public String getStatus(Status status){
        var result = "null";

        switch (status){
            case PENDING:
                result = status.PENDING.name();
                break;
            case PROCESS:
                result = status.PROCESS.name();
                break;
            case PROGRESS:
                result = status.PROGRESS.name();
                break;
        }
        return result;
    }

}
