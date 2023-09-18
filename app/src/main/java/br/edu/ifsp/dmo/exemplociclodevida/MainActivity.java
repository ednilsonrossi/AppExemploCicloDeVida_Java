package br.edu.ifsp.dmo.exemplociclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "CICLO_DE_VIDA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG, "Executando onCreate() ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "Executando onStart() ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "Executando onResume() ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "Executando onPause() ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "Executando onStop() ");
    }

    @Override
    protected void onDestroy() {
        Log.v(TAG, "Executando onDestroy() ");
        super.onDestroy();
    }
}