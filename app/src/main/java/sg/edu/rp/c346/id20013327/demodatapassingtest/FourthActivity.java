package sg.edu.rp.c346.id20013327.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    //Step 1
    TextView tvDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvDouble = findViewById(R.id.tvDouble);
        Intent intentReceived = getIntent();
        Double value =  intentReceived.getDoubleExtra("value", 99.99);
        tvDouble.setText("Double value received is: " + value);
    }
}