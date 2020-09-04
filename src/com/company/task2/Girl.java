package com.company.task2;

public class Girl extends Human {
    private Hobby hobby;

    public Girl(String name, int age, double height, double weith, Hobby hobby) {
        super(name, age, height, weith);
        this.hobby = hobby;
    }
    public Hobby getHobby(){
        return hobby;
    }
}
