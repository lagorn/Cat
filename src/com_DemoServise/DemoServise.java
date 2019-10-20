package com_DemoServise;
import com_Servise.*;


public class DemoServise {
    public void execute(){
        Cat myrzik = new Cat();
        Cat myrka = new Cat();
        Cat knopka = new Cat();
        Cat marka = new Cat();
        Cat pipka = new Cat();
        MortalManipulation test_subject = new MortalManipulation();
        test_subject.overeatingCat(myrzik);
        test_subject.pullCat(myrzik);

        System.out.println("Клонирование кошки.");

        Cat mashka = new Cat(5542.23);
        System.out.println("Вес первой кошки " +  mashka.getWeight());
        Cat clonCat = mashka.copyCat(mashka);
        System.out.println("Вес второй кошки " + clonCat.getWeight());

        System.out.println(myrka.getWeight());
        myrka.feed(100.);
        System.out.println(myrka.getEatenFood());
        System.out.println(myrka.getWeight());
        myrka.feed(200.);
        System.out.println(myrka.getEatenFood());
        System.out.println(myrka.getWeight());
        myrka.setColorCat(Color.Olive);
        System.out.println(myrka.getColorCat());
    }
}
