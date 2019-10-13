package com_Servise;

public class MortalManipulation {
    public void overeatingCat (Cat cat){
        System.out.println("===========================================================");
        System.out.println("Начинаем кормить кота вискас");

        for (double i = cat.getWeight() ; i < cat.getMaxWeight(); i = i + 100) {
            cat.feed(100.0);
            cat.setEatenFood(100.0);
            System.out.println(cat.getWeight());
        }
        System.out.println("Наш кот " + cat.getStatus());
        System.out.println("Наш кот съел " + cat.getEatenFood());
    }
    public void pullCat (Cat cat){
        System.out.println("===========================================================");
        System.out.println("Начинаем дергать кота за хвост");

        for (double i = cat.getWeight(); i > cat.getMinWeight(); --i) {
            cat.meow();
            System.out.println(cat.getWeight());
        }
        System.out.println("Наш кот " + cat.getStatus());
    }
}
