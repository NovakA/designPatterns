/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.Adapter;

/**
 *
 * @author Adam
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equals("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equals("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }
    
    @Override
    public void play(String audioType, String filename) {
        if (audioType.equals("vlc")) {
            advancedMediaPlayer.playVlc(filename);
        } else if (audioType.equals("mp4")) {
            advancedMediaPlayer.playMp4(filename);
        }
    }

}
