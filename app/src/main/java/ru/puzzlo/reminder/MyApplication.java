package ru.puzzlo.reminder;

import android.app.Application;

/**
 * Created by andrey on 20.01.2016.
 */
public class MyApplication extends Application{

    private static boolean activityVisible;

    public static boolean isActivityvisible() {
        return activityVisible;
    }

    public static void activityResumed() {
        activityVisible = true;
    }

    public static void activityPaused() {
        activityVisible = false;
    }

}
