package com.hr.design_pattern.adapter;

/**
 * @auhor hurong
 * @Date 2020/3/18 0018 下午 22:21
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String file) {

    }

    @Override
    public void playMp4(String file) {
        System.out.println("playing mp4 file: "+file);
    }
}
