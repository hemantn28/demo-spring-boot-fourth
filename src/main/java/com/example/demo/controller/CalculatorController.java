package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    //add
    @RequestMapping("/add")
    public int addition(){
        int a=6;
        int b=3;
        int c=a+b;
        return c;
    }

    @RequestMapping("/plus")
    public String addition1(){
        int a=9;
        int b=9;
        int c=a+b;
        return "Addition is "+c;
    }

    @RequestMapping("/subtract")
    public int subtraction(){
        int a=36;
        int b=24;
        int c=a-b;
        return c;

    }

    @RequestMapping("/minus")
    public String subtraction2(){
        int a=27;
        int b=12;
        int c=a-b;

        return "subtraction is: "+c;

    }

    @RequestMapping("/multiplication")
    public int multiply(){
        int a=3;
        int b=5;
        int c=a*b;
        return c;
    }

    @RequestMapping("/multiply")
    public String into(){
        int a=3;
        int b=6;
        int c=a*b;
        return "multiplication is: "+c;
    }

    @RequestMapping("/division")
    public int divide(){
        int a=27;
        int b=3;
        int c=a/b;
        return c;
    }

    @RequestMapping("/divide")
    public String divide2(){
        int a=30;
        int b=3;
        int c=a/b;

        return "Division is: "+c;
    }

}
