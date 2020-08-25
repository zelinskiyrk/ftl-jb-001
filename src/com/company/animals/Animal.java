package com.company.animals;

class Animal {
    protected String name;
    protected Integer weight;
    protected Integer currentPosition = 0;
    protected Boolean canFly = false;

    public Animal(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
        this.canFly = true;
    }

    public Animal() {
        this.canFly = true;
    }

    public void voice() {
        System.out.println("Voice!");
    }

    protected void runForward(Integer length){
        this.currentPosition += length;
    }
}
