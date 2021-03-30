package fr.esiea.ex4A.hello;

public class HelloData {

    public final String type = "hello";
    public final String name;
    public final String completeSentence;

    public HelloData(String name) {
        this.name = name;
        this.completeSentence = type + " " + name + "!";
    }
}
