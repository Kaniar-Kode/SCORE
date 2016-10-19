package com.kaniar_kode.score;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    String uri = "@drawable/drawable-hdpi/splashscreen-hdpi.png";  // where myresource (without the extension) is the file

    int imageResource = getResources().getIdentifier(uri, null, getPackageName());

    ImageView iv = (ImageView)findViewById(R.id.ss);
    Drawable res = getResources().getDrawable(imageResource);
    iv.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Thread timerThread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(2000);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                } finally
                {
                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
