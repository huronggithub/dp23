package com.hr.design_pattern.adapter;

/**
 * @auhor hurong
 * @Date 2020/3/18 0018 下午 22:22
 */
public class AudioPlayer implements MediaPlayer {

    private AdvancedMediaAdapter advancedMediaAdapter;

    @Override
    public void play(String type,String file) {
        if(type.equalsIgnoreCase("mp3")){
            System.out.println("playing mp3 file :"+file);
        }else if(type.equalsIgnoreCase("mp4") || type.equalsIgnoreCase("vlc")) {
            advancedMediaAdapter=new AdvancedMediaAdapter(type);
            advancedMediaAdapter.play(type,file);
        }else {
            System.out.println("file "+file+" not supported ");
        }
    }
}
