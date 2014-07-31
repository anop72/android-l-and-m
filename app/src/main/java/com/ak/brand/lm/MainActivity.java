package com.ak.brand.lm;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.ak.brand.lm.fragment.Tab1Fragment;
import com.ak.brand.lm.fragment.Tab2Fragment;
import com.ak.brand.lm.fragment.Tab3Fragment;
import com.ak.brand.lm.fragment.Tab4Fragment;
import com.ak.brand.lm.fragment.Tab5Fragment;


public class MainActivity extends FragmentActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            setFragment1();
        }

        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setFragment1() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container, new Tab1Fragment());
        ft.commit();
    }

    private void setFragment2() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container, new Tab2Fragment());
        ft.commit();
    }

    private void setFragment3() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container, new Tab3Fragment());
        ft.commit();
    }

    private void setFragment4() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container, new Tab4Fragment());
        ft.commit();
    }

    private void setFragment5() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container, new Tab5Fragment());
        ft.commit();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button1) {
            setFragment1();
        }else if (view.getId() == R.id.button2) {
            setFragment2();
        }else if (view.getId() == R.id.button3) {
            setFragment3();
        }else if (view.getId() == R.id.button4) {
            setFragment4();
        }else if (view.getId() == R.id.button5) {
            setFragment5();
        }
    }
}
