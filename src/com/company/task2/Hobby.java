package com.company.task2;

public class Hobby {
    private String name;
    private int years;
    private  String description;
    public Hobby (String name,int years,String desription){
        this.name = name;
        this.years = years;
        this.description = desription;}
        public void info(){
            System.out.println("Hobby:"+name+
                    "years:"+ years +
                    "desription:" + description);


        }
    }
