package com.hr.design_pattern.adapter;

/**
 * @auhor hurong
 * @Date 2020/3/18 0018 下午 22:31
 */
public class Main {

    public static void main(String[] args) {
        AudioPlayer audioPlayer=new AudioPlayer();
        audioPlayer.play("mp3","麻雀.mp3");
        audioPlayer.play("mp4","java设计模式.mp4");
        audioPlayer.play("vlc","丑八怪.vlc");
        audioPlayer.play("avi","速度与激情.avi");
    }
}
