package com.company.task2;

public class Girl extends Human {
    private Hobby hobby;

    public Girl(String name, int age, double height, double weigth) {
        super(name, age, height, weigth);
        this.hobby = hobby;
    }
    public Hobby getHobby() {
        return hobby;
    }

        class Friend extends Human {
            private Hobby hobby;

            public Friend(String name, int age, double height, double weigth, Hobby hobby) {
                super(name, age, height, weigth);
                this.hobby = hobby;
            }

            public Hobby getHobby() {
                return hobby;
            }

        }
    }

