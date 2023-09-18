package br.edu.ifsp.dmo.exemplociclodevida;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "CICLO_DE_VIDA";
    private int mudancas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG, "Executando onCreate() ");
        registro();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "Executando onStart() ");
        registro();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "Executando onResume() ");
        registro();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "Executando onPause() ");
        registro();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "Executando onStop() ");
        registro();
    }

    @Override
    protected void onDestroy() {
        Log.v(TAG, "Executando onDestroy() ");
        registro();
        super.onDestroy();
    }

    private void registro(){
        mudancas += 1;
        Log.v(TAG, "Mudanças: " + mudancas);
    }


}