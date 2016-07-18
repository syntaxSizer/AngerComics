package matrial.aka.angercomics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by geckozila on 18/07/16.
 */
public class Spalsh extends Activity {

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        Thread timerThread = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(Spalsh.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause () {
        // TODO Auto-generated method stub
        super.onPause();
        finish();


    }
}


