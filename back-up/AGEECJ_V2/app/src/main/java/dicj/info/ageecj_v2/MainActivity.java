package dicj.info.ageecj_v2;

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

    public void layoutOnClick(View view){
        Intent intent = new Intent(MainActivity.this, Evenement1.class);
        startActivity(intent);
    }

    public void layout2OnClick(View view){
        Intent intent = new Intent(MainActivity.this, Evenement2.class);
        startActivity(intent);
    }

    public void layout3OnClick(View view){
        Intent intent = new Intent(MainActivity.this, Evenement3.class);
        startActivity(intent);
    }

    public void layout4OnClick(View view){
        Intent intent = new Intent(MainActivity.this, Evenement4.class);
        startActivity(intent);
    }

    public void layout5OnClick(View view){
        Intent intent = new Intent(MainActivity.this, Evenement5.class);
        startActivity(intent);
    }

    public void layout6OnClick(View view){
        Intent intent = new Intent(MainActivity.this, Evenement6.class);
        startActivity(intent);
    }

    public void layout7OnClick(View view){
        Intent intent = new Intent(MainActivity.this, Evenement7.class);
        startActivity(intent);
    }
}
