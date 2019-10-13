package com_Servise;

public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double eatenFood;
    public static final int NUMBER_EYES = 2;
    public static final double MIN_WEIGTH = 1000.0;
    public static final double MAX_WEIGTH = 9000.0;
    static int count;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = MIN_WEIGTH;
        maxWeight = MAX_WEIGTH;
        eatenFood = eatenFood;
    }

    public Cat (Double weight){
        this.weight = weight;
        originWeight = weight;
        minWeight = MIN_WEIGTH;
        maxWeight = MAX_WEIGTH;
        eatenFood = eatenFood;
    }
    public Cat copyCat(Cat cat){
        Cat cloneCat = new Cat();
        cloneCat.setWeight(cat.getWeight());
        return cloneCat;
    }

    public void setOriginWeight(double originWeight) {
        this.originWeight = originWeight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Cat.count = count;
    }

    public double getEatenFood() {
        return eatenFood;
    }

    public void setEatenFood(double amount) {
        eatenFood = eatenFood + amount;
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public double getOriginWeight() {
        return originWeight;
    }

    public double getMinWeight() {
        return minWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void goToilet(){
        weight = weight - 30;
        System.out.println("I pooped...");
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}