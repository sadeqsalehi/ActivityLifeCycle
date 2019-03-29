package ir.sadeqsalehi.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(View view) {
        // Intent for navigate to : activity , settings , sms , call , browser
        //getApplicationContext() = MainActivity.this
        Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
        startActivity(intent);
    }
}
