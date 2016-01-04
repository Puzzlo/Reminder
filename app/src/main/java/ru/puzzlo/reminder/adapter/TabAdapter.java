package ru.puzzlo.reminder.adapter;

import android.app.Fragment;
//import android.support.v4.app.Fragment;
import android.app.FragmentManager;
//import android.support.v4.app.FragmentManager;
import android.support.v13.app.FragmentStatePagerAdapter;

import ru.puzzlo.reminder.fragment.CurrentTaskFragment;
import ru.puzzlo.reminder.fragment.DoneTaskFragment;

/**
 * Created by esskov on 09.12.2015.
 */
public class TabAdapter extends FragmentStatePagerAdapter {

    private int numberOfTabs;

    public TabAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                return new CurrentTaskFragment();
            case 1:
                return new DoneTaskFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
