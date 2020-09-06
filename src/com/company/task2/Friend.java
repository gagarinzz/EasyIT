package com.company.task2;

public class Friend extends Human {
        private Hobby hobby;

        Friend(String name, int age, double height, double weigth, Hobby hobby) {
            super(name, age, height, weigth);
            this.hobby = hobby;
        }

        public Hobby getHobby() {
            return hobby;
        }

    }

