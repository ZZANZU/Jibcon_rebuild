package com.tistory.dayglo.jibcon_re;

import android.app.Application;

import com.tsengvn.typekit.Typekit;

/**
 * Created by user on 2017-08-06.
 */

public class GlobalApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // for font change
        Typekit.getInstance()
                .addBold(Typekit.createFromAsset(this, "fonts/NanumSquareExtraBold.ttf"))
                .addNormal(Typekit.createFromAsset(this, "fonts/NanumSquareRegular.ttf"))
                .addCustom1(Typekit.createFromAsset(this, "fonts/NanumSquareLight.ttf"));
    }
}
