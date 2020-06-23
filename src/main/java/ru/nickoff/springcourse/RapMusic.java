package ru.nickoff.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class RapMusic implements Music{

    private List<String> songs = new ArrayList<>();

    {
        songs.add("Life is good");
        songs.add("Fuck the police");
        songs.add("Changes");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
