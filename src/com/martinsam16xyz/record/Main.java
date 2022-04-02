package com.martinsam16xyz.record;

public class Main {

    // https://openjdk.java.net/jeps/395

    public static void main(String[] args) {
        PersonDTO personDTO = new PersonDTO("Martin", "Saman", "12345678");
        System.out.println(personDTO);
    }
}
