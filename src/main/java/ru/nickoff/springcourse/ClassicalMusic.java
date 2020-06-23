package ru.nickoff.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;



public class ClassicalMusic implements Music {


    public void doMyInit(){
        System.out.println("Doing my initialization");
    }


    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }



    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
