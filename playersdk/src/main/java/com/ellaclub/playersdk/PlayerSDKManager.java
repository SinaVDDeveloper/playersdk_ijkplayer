package com.ellaclub.playersdk;

import android.content.Context;
import android.support.annotation.NonNull;

import com.ellaclub.playersdk.utils.DefaultLogger;
import com.ellaclub.playersdk.utils.ILogger;

public final class PlayerSDKManager {
    private static class PlayerSDKManagerINSTANCE {
        private static PlayerSDKManager instance = new PlayerSDKManager();
    }

    public static PlayerSDKManager getInstance() {
        return PlayerSDKManagerINSTANCE.instance;
    }

    private Context mContext;
    private boolean isDebug = false;
    private ILogger logger;
    private VideoController mController;

    public void init(@NonNull Context context, boolean isDebug) {
        if (context != null) {
            mContext = context.getApplicationContext();
        }

        this.isDebug = isDebug;
    }

    public boolean getIsDebug() {
        return this.isDebug;
    }

    public void setLogger(ILogger logger) {
        this.logger = logger;
    }

    public void getLogger() {
        if (logger == null) {
            logger = new DefaultLogger();
        }
    }

    public void start() {
    }

    public void stop() {

    }

    public void resume() {

    }

    public void pause() {

    }

    public void destroy() {

    }

}
