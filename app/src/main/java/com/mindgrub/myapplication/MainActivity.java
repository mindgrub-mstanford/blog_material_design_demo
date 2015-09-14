package com.mindgrub.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

   @OnClick(R.id.floatingTextButton)
   protected void clickedFloatingTextButton(View view)
   {
       Intent intent = new Intent(this, FloatingTextActivity.class);
       startActivity(intent);
   }

    @OnClick(R.id.toolbarButton)
    protected void clickedToolbarButton(View view)
    {
        Intent intent = new Intent(this, CollapsingToolbarActivity.class);
        startActivity(intent);
    }
}
