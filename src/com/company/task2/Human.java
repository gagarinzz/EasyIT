package com.company.task2;

private class Human {
    public String name;
    public int age;
    public double height;
    public double weight;

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

