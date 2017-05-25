package com.example.zeeshan.actiontab;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ActionBar.TabListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.mipmap.ic_launcher);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setNavigationMode(actionBar.NAVIGATION_MODE_TABS);
        actionBar.addTab(actionBar.newTab().setText("AUDIO").setIcon(R.drawable.ic_audio).setTabListener(this));
        actionBar.addTab(actionBar.newTab().setText("VIDEO").setIcon(R.drawable.ic_video).setTabListener(this));
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        int currentTab = tab.getPosition();
        switch (currentTab){
            case 0:
                setContentView(R.layout.fragment_tab__audio);
                Log.e("Tab SelsetNavigationModeected", tab.getText() + " is Selected");
                Toast.makeText(getApplicationContext(), tab.getText()+" selected", Toast.LENGTH_SHORT).show();
                return;
            case 1:
                setContentView(R.layout.fragment_tab__video);
                Log.e("Tab Selected", tab.getText() + " is Selected");
                Toast.makeText(getApplicationContext(), tab.getText()+" selected", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        Log.e("Tab unselected", tab.getText()+" is UnSelected");

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
        Log.e("Tab reselected", tab.getText()+" is reSelected");
        //Toast.makeText(this, tab.getText()+ " is Selected", Toast.LENGTH_SHORT).show();

    }
}