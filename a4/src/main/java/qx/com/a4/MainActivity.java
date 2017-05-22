package qx.com.a4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int i = view.getId();
        if (i == R.id.button2) {
            startActivity(new Intent(MainActivity.this, qx.com.a2.MainActivity.class));

        } else if (i == R.id.button3) {
            startActivity(new Intent(MainActivity.this, qx.com.a3.MainActivity.class));

        } else if (i == R.id.button4) {//               startActivity(new Intent(MainActivity.this,MainActivity.class));

        }
    }
}
