package zhagnbinbin.com.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showToastPopularMovie(View view){
        Toast.makeText(getApplicationContext(), "Popular Movie Message", Toast.LENGTH_SHORT).show();
    }
    public void showToastStockHawk(View view){
        Toast.makeText(getApplicationContext(), "Stock Hawk Message", Toast.LENGTH_SHORT).show();
    }
    public void showToastBuildItBigger(View view){
        Toast.makeText(getApplicationContext(), "Build It Bigger Message", Toast.LENGTH_SHORT).show();
    }
    public void showToastMakeYourAppMaterial(View view){
        Toast.makeText(getApplicationContext(), "Make Your App Material Message", Toast.LENGTH_SHORT).show();
    }
    public void showToastNewUbiquitous(View view){
        Toast.makeText(getApplicationContext(), "New Ubiquitous Message", Toast.LENGTH_SHORT).show();
    }
    public void showToastCapstone(View view){
        Toast.makeText(getApplicationContext(), "capstone Message", Toast.LENGTH_SHORT).show();
    }

}
