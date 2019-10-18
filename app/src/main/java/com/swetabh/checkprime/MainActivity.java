package com.swetabh.checkprime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("primecheck-lib");
    }

    public native boolean  primeCheckJNI(int num);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView checkPrimeText= findViewById(R.id.tv_prime);
        final EditText primeNumEdt= findViewById(R.id.ed_prime_num);
        Button checkPrime= findViewById(R.id.btn_check_prime);
        checkPrime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean status =primeCheckJNI(Integer.parseInt(primeNumEdt.getText().toString()));
                checkPrimeText.setText("Entered number is " + (status? "" : "not ") + "prime");
            }
        });
    }
}
