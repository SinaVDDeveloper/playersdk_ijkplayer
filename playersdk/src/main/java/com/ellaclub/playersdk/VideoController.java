package com.ellaclub.playersdk;

import tv.danmaku.ijk.media.player.IMediaPlayer;

public class VideoController {
    private IMediaPlayer mediaPlayer;

    public void setMediaPlayer(IMediaPlayer player) {
        this.mediaPlayer = player;
    }

    public IMediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }
}
