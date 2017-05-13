package id.ac.aik.studio.androidkejar1.mainview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import id.ac.aik.studio.androidkejar1.R;

public class HomeActivity extends AppCompatActivity {

    private TextView mTextUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mTextUsername = (TextView) findViewById(R.id.txt_username);

        Intent mIntent = getIntent();
        String username = mIntent.getStringExtra("username");
        mTextUsername.setText(username);

    }
}
