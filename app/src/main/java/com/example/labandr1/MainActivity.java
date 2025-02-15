package com.example.labandr1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroupCompany, radioGroupProduct;
    private Button buttonOk, buttonCancel;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ініціалізація об'єктів
        radioGroupCompany = findViewById(R.id.radioGroupCompany);
        radioGroupProduct = findViewById(R.id.radioGroupProduct);
        buttonOk = findViewById(R.id.button);
        buttonCancel = findViewById(R.id.button2);
        textViewResult = findViewById(R.id.textView3);

        //Дія, яку виконує кнопка "ОК"
        buttonOk.setOnClickListener(v -> {
            int selectedCompanyId = radioGroupCompany.getCheckedRadioButtonId();
            int selectedProductId = radioGroupProduct.getCheckedRadioButtonId();

            if (selectedCompanyId == -1 || selectedProductId == -1) {
                Toast.makeText(MainActivity.this, "Please select both a company and a product.", Toast.LENGTH_SHORT).show();
            } else {
                RadioButton selectedCompany = findViewById(selectedCompanyId);
                RadioButton selectedProduct = findViewById(selectedProductId);
                String resultText = "Обрана компанія: " + selectedCompany.getText().toString() +
                        "\nОбраний продукт: " + selectedProduct.getText().toString();
                textViewResult.setText(resultText);
            }
        });


        //Дія, яку виконує кнопка "Cancel"
        buttonCancel.setOnClickListener(v -> {
            textViewResult.setText("");
            radioGroupCompany.clearCheck();
            radioGroupProduct.clearCheck();
        });

    }
}
