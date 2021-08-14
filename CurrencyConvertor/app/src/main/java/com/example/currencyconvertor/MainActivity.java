package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {
        Log.i("Info", "Convert starting" );
        EditText editText = findViewById(R.id.editText);
        TextView VNDtextView = findViewById(R.id.VNDtextView);
        String amountInUSD = editText.getText().toString();
        double amountInVNDDouble = Double.parseDouble(amountInUSD);
        double amountInVNDDoubles = amountInVNDDouble * 23000;
        String result = String.format("%.2f USD convert to %.2f VND", amountInVNDDouble, amountInVNDDoubles);
        VNDtextView.setText(result);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}