package com.ellaclub.playersdk;


import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import com.ellaclub.playersdk.core.VideoFrameLayout;

public class VideoView extends VideoFrameLayout {
    private Context mContext;

    public VideoView(@NonNull Context context) {
        super(context);
        init(context, null, 0);
    }

    public VideoView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public VideoView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    private void init(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        mContext = context;
        TypedArray typedArr = context.obtainStyledAttributes(attrs,
                R.styleable.VDVideoView);

    }
}
