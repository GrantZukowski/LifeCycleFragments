package com.example.zukowskig.lifecyclefragments;

/**
 * Created by zukowskig on 6/2/2016.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * Created by zukowskig on 6/2/2016.
 */
public class HeadlinesFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.headlines_view, container, false);
    }
}