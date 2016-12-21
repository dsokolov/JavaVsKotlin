package me.ilich.javavskotlin;

import java.util.LinkedList;
import java.util.Stack;

public class JavaUser {

    private String name;
    private String age;

    public LinkedList<Integer> l1;
    public Stack<Integer> l2;

    public JavaUser(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}
