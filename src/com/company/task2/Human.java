package com.company.task2;

public class Human {
    private String name;
    private int age;
    private double height;
    private double weight;

    private Human(String name,int age,double height,double weith) {

        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    private void say() {
            System.out.println(
                    "Name:"+ name + "\n" +
            "Age: +age+" +

                            "Height:"+height +
            "Weight: "+ weight
            );
    }
}

