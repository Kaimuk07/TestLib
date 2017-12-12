package com.example.libmuk;

/**
 * Created by kanthimp on 12/12/2560.
 */

public class MainEx {

    public static String  Say(){
        return "Hello";
    }
    public static void sayHello(String name) {
        System.out.println("Hello" + name);
    }

    public  static void Hi(int m,int n){
        System.out.println(m+n);
        System.out.println(m*n);
    }
    public static int Math(){

        return (int) Math.ceil(Math.random() * 100); //Random
    }


}
