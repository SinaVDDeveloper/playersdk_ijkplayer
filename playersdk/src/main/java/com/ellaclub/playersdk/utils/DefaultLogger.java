package com.ellaclub.playersdk.utils;

import android.support.annotation.NonNull;
import android.util.Log;

import com.ellaclub.playersdk.PlayerSDKManager;

public class DefaultLogger implements ILogger {
    @Override
    public void i(@NonNull String msg) {
        if (PlayerSDKManager.getInstance().getIsDebug()) {
            Log.i(PlayerSDKContants.TAG, msg);
        }
    }

    @Override
    public void d(@NonNull String msg) {
        if (PlayerSDKManager.getInstance().getIsDebug()) {
            Log.e(PlayerSDKContants.TAG, msg);
        }
    }

    @Override
    public void w(@NonNull String msg) {
        if (PlayerSDKManager.getInstance().getIsDebug()) {
            Log.w(PlayerSDKContants.TAG, msg);
        }
    }

    @Override
    public void e(@NonNull String msg) {
        if (PlayerSDKManager.getInstance().getIsDebug()) {
            Log.e(PlayerSDKContants.TAG, msg);
        }
    }
}
