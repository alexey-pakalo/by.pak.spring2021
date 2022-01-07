package by.pak.spring2021;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusicList();
        ClassicalMusic classicalMusic = context.getBean("musicClassicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
        context.close();
    }
}
