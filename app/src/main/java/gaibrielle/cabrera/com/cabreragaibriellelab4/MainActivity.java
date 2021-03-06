package gaibrielle.cabrera.com.cabreragaibriellelab4;

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
        Log.d("4ITH","onCreate() was successfully executed.");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("4ITH","onStart() was successfully executed.");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("4ITH","onResume() was successfully executed.");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("4ITH","onPause() was successfully executed.");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("4ITH","onRestart() was successfully executed.");
    }
    
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("4ITH","onStop() was successfully executed.");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("4ITH","onDestroy() was successfully executed.");
    }

    public void displayToast(View t){
        Toast.makeText(this, "Go back to previous landmark.", Toast.LENGTH_LONG).show();
    }

    public void displaySnackbar(View s){
        Snackbar.make(s, "Advance to next landmark.", Snackbar.LENGTH_LONG).show();
    }
}
