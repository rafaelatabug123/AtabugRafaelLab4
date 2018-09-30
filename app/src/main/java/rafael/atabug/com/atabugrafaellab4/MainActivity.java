package rafael.atabug.com.atabugrafaellab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ith","onStart() has started!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ith","onRestart() has started!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ith","onDestroy() has destroyed your app!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ith"," onResume() has started!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ith"," onPause() has started!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ith"," onStop() has started!");
    }

    public void showToast(View v){
        Toast.makeText(this, "You have clicked the back button", Toast.LENGTH_SHORT).show();
    }

    public void showSnackBar(View v){
        Snackbar.make(v, "You have clicked the next button.", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }
}
