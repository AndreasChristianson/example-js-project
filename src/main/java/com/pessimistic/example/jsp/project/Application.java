package com.pessimistic.example.jsp.project;



import java.util.ArrayList;
import java.util.List;

public class Application{
    public static final List<Todo> todos = new ArrayList<>();

    static {
        todos.add( new Todo(123,"This is a todo!"));
    }
}