package ru.nickoff.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private RapMusic rapMusic;

    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, RapMusic rapMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.rapMusic = rapMusic;
    }

    public void playMusic(MusicGenre genre) {
        Random random = new Random();

        int randomNumber = random.nextInt(3);

        if (genre == MusicGenre.CLASSICAL) {
            System.out.println(classicalMusic.getSong().get(randomNumber));
        } else if (genre == MusicGenre.ROCK) {
            System.out.println(rockMusic.getSong().get(randomNumber));
        } else {
            System.out.println(rapMusic.getSong().get(randomNumber));
        }
    }
}
