package org.example;

import com.google.gson.Gson;
public class App
{
    public static void main( String[] args )
    {
        User user=new User("Oleksandr","Rogozkin");
        System.out.println(new Gson().toJson(user));
    }
}
