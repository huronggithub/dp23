package com.hr.design_pattern.adapter;

/**
 * @auhor hurong
 * @Date 2020/3/18 0018 下午 22:27
 */
public class AdvancedMediaAdapter implements MediaPlayer{
    private AdvancedMediaPlayer advancedMediaPlayer;

    public AdvancedMediaAdapter(String type) {
        if(type.equalsIgnoreCase("vlc")){
            advancedMediaPlayer=new VlcPlayer();
        }else if(type.equalsIgnoreCase("mp4")){
            advancedMediaPlayer=new Mp4Player();
        }
    }

    @Override
    public void play(String type,String file) {
        if(type.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(file);
        }else if(type.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(file);
        }
    }
}
