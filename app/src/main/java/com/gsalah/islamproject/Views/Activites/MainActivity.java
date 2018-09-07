package com.gsalah.islamproject.Views.Activites;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gsalah.islamproject.R;
import com.gsalah.islamproject.Utils.BaseActivity;
import com.gsalah.islamproject.Views.Fragments.BlankFragment1;
import com.gsalah.islamproject.Views.Fragments.BlankFragment2;
import com.gsalah.islamproject.Views.Fragments.BlankFragment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewPager);
        TabLayout tabLayout = findViewById(R.id.tabLayout);

        List<Fragment> fragments = new ArrayList<>(Arrays.asList(
                new BlankFragment1(),
                new BlankFragment2(),
                new BlankFragment3()
        ));

        setupViewPagetNTabLayout(fragments,viewPager,tabLayout);
    }
}
