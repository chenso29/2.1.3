package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;


    private Timer timer;

    @Autowired
    public AnimalsCage(/*Хотел прописать Qualifier, но почему-то компилятор ругается*/Timer timer) {
        this.timer = timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }


    public Timer getTimer() {
        return timer;
    }
}