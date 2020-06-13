package ru.nickoff.springcourse;

public class RapMusic implements Music{

    public RapMusic() {}

    public static RapMusic getRapMusic(){
        return new RapMusic();
    }


    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "U Can't Touch This";
    }
}
