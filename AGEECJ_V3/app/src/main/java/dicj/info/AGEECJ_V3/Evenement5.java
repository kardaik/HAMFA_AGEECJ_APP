package dicj.info.AGEECJ_V3;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Evenement5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.evenement5);

        ColorDrawable color = new ColorDrawable(Color.parseColor("#CC0000"));
        getSupportActionBar().setBackgroundDrawable(color);

    }
}