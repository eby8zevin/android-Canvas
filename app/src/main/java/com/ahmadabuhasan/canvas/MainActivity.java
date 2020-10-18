package com.ahmadabuhasan.canvas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    @SuppressLint("WrongConstant")
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.ori_create) { //1
            startActivity(new Intent(this, CreateOriActivity.class));
            Toast.makeText(MainActivity.this, "ORIGINAL Create Canvas objects", 1000).show();
        } else if (item.getItemId() == R.id.ori_draw) { //2
            startActivity(new Intent(this, DrawOriActivity.class));
            Toast.makeText(MainActivity.this, "ORIGINAL Draw on Canvas objects", 1000).show();
        } else if (item.getItemId() == R.id.ori_clipping) { //3
            startActivity(new Intent(this, ClippingOriActivity.class));
            Toast.makeText(MainActivity.this, "ORIGINAL Apply clipping to Canvas objects", 1000).show();
        } else if (item.getItemId() == R.id.ori_surface) { //4
            startActivity(new Intent(this, SurfaceOriActivity.class));
            Toast.makeText(MainActivity.this, "ORIGINAL SurfaceView objects", 1000).show();
        }
        return true;
    }
}