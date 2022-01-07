package by.pak.spring2021;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private Music music;
    private String name;
    private int volume;

    //IoC
    public MusicPlayer (Music music){
        this.music =music;
    }

    //empty constructor for spring
    public MusicPlayer(){}

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setName(String name){
        this.name =name;
    }

    public String getName(){
        return name;
    }

    public void setVolume(int volume){
        this.volume=volume;
    }

    public int getVolume(){
        return volume;
    }

    public void setMusic(Music music){
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }

    public void playMusicList(){
        for(Music music:musicList){
            System.out.println("Alredy palyed: " +music.getSong());
        }

    }

}
