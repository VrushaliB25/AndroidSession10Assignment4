package example.com.actionbartabsexample;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by HPWorld on 6/7/2017.
 */

public class Tab1Fragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    // Inflate the layout for this fragment
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {

        //Returning the layout file after inflating
        return inflater.inflate(R.layout.tab1,container,false);
    }
}
