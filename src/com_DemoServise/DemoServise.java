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

        Cat mashka = new Cat(5542.23);


    }
}
