package com.example.calculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    TextInputEditText firstNo;
    TextInputEditText secondNo;
    TextView result;
    Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = findViewById(R.id.spOperation);
        firstNo = findViewById(R.id.firstNo);
        secondNo = findViewById(R.id.secondNo);
        result = findViewById(R.id.result);

      String opr[]={"Select Operator","+","-","*","/"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.custom_spinner_item,opr);
        sp.setAdapter(adapter);

        Button btnCal = findViewById(R.id.calculate);
        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sp.getSelectedItem().equals("Select Operator")) {


                }
                else if(sp.getSelectedItem().equals("+")){
                    int input1 = Integer.parseInt(firstNo.getText().toString());
                    int input2 = Integer.parseInt(secondNo.getText().toString());
                    int res = input1 + input2;
                    result.setText(String.valueOf("Result:"+"  "+res));
                    Toast.makeText(MainActivity.this, "Result:"+"  "+res, Toast.LENGTH_SHORT).show();

                } else if (sp.getSelectedItem().equals("-")) {
                    int input1 = Integer.parseInt(firstNo.getText().toString());
                    int input2 = Integer.parseInt(secondNo.getText().toString());
                    int res = input1 - input2;
                    result.setText(String.valueOf("Result:"+"  "+res));
                    Toast.makeText(MainActivity.this, "Result:"+"  "+res, Toast.LENGTH_SHORT).show();
                }
                else if (sp.getSelectedItem().equals("*")) {
                    int input1 = Integer.parseInt(firstNo.getText().toString());
                    int input2 = Integer.parseInt(secondNo.getText().toString());
                    int res = input1 * input2;
                    result.setText(String.valueOf("Result:"+"  "+res));
                    Toast.makeText(MainActivity.this, "Result:"+"  "+res, Toast.LENGTH_SHORT).show();

                } else if (sp.getSelectedItem().equals("/")) {
                    double input1 = Double.parseDouble(firstNo.getText().toString());
                    double input2 = Double.parseDouble(secondNo.getText().toString());
                    double res = input1 / input2;
                    result.setText(String.valueOf("Result:"+"  "+res));
                    Toast.makeText(MainActivity.this, "Result:"+"  "+res, Toast.LENGTH_SHORT).show();

                }

            }
        });

    }
}