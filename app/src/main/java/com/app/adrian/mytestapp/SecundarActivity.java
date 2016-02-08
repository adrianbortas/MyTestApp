package com.app.adrian.mytestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class SecundarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundar);
        final EditText etNume = (EditText)findViewById(R.id.etNume);
        Button btn = (Button) findViewById(R.id.btnOk);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("TAG", etNume.getText().toString());
            }
        });

        final Switch mingea = (Switch) findViewById(R.id.switch2);
        mingea.setChecked(true);
        mingea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecundarActivity.this, "is "+mingea.isChecked(),Toast.LENGTH_SHORT).show();
            }
        });



    }
}
