package example.com.actionbartabsexample;

import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
/**
 * Created by HPWorld on 6/7/2017.
 */

public class MyPagerAdapter extends FragmentStatePagerAdapter {
    //integer to count number of tabs
    int tabCount;

    //Constructor to the class

    MyPagerAdapter(FragmentManager manager) {
        super(manager);
    }
    public MyPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount= tabCount;
    }

    //Overriding method getItem
    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        if(position == 0)
        {
            Tab1Fragment tab1 = new Tab1Fragment();
            return tab1;
        }
        else
        {
            Tab2Fragment tab2 = new Tab2Fragment();
            return tab2;
        }
    }

    //Overriden method getCount to get the number of tabs
    @Override
    public int getCount() {
        return tabCount;
    }
}

