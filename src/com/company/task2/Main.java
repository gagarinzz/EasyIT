package com.company.task2;

public class Main {
    public static void main(String[] args) {
        Hobby hobby = new Hobby ("football", 2,
                "The game where players kick the ball");
        Human girl = new Girl("Nastya", 19,170,65);
        hobby = new Hobby("football", 4,
                "The game where players kick the ball");
        Human friend = new Friend("Vova", 18,180,75, hobby);
    }
}














