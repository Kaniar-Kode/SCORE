package com.kaniar_kode.score;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class Score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        android.app.ActionBar actionBar = getActionBar();
        if(actionBar != null){
            actionBar.setTitle(getResources().getString(R.string.app_name));
            actionBar.setDisplayHomeAsUpEnabled(true);
//            actionBar.setIcon(R.drawable.app_icon);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home: this.finish();
                                    return true;

            default: return super.onOptionsItemSelected(item);
        }
    }
}
