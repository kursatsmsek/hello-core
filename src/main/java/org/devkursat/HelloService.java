package org.devkursat;

public class HelloService {

    public String sayHello(String name) {
        if (name == null || name.isBlank()) {
            name = "world";
        }
        return "Hello, " + name;
    }
}
