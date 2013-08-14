package com.example.testjnitwo;

import tk.laomo.demo.jni.SquaredWrapper;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SquaredWrapper sw = new SquaredWrapper();
        int a = sw.squared(5);
        Log.i(TEXT_SERVICES_MANAGER_SERVICE, "==========================="+a);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
