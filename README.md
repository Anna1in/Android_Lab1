Лабораторна робота №1
Виконала студентка 3 курсу, групи ІО-21, Любченко Анна.



![image](https://github.com/user-attachments/assets/ec2bd3b7-f000-4e46-863f-5368e6aac46a)

&nbsp;&nbsp;&nbsp; Відкриваючи програму ми бачимо екран, на якому зображено RadioButton, для обирання продукту та бренду. 

  
![image](https://github.com/user-attachments/assets/1a68e4d3-34d2-485c-b75d-cd19d0929dac)

&nbsp;&nbsp;&nbsp; Коли обираємо тільки один варіант і натискаємо кнопку "ОК", програма видає сповіщення, шо треба обрати 2 об'єкти.
У коді це знаходиться у методі : "buttonOk.setOnClickListener" , а саме -
    ```if (selectedCompanyId == -1 || selectedProductId == -1) {
                Toast.makeText(MainActivity.this, "Please select both a company and a product.", Toast.LENGTH_SHORT).show();
            } ```

  ![image](https://github.com/user-attachments/assets/55f89cfe-0cfa-419d-b0b7-303b5364bc23)
  
  &nbsp;&nbsp;&nbsp; Коли обираємо обидві групи RadioButton, обрані продукт та бренд відповідно висвічуються знизу.
  У коді це знаходиться у методі :"buttonOk.setOnClickListener" , а саме -
  
    else {
            RadioButton selectedCompany = findViewById(selectedCompanyId);
                RadioButton selectedProduct = findViewById(selectedProductId);
                String resultText = "Обрана компанія: " + selectedCompany.getText().toString() +
                        "\nОбраний продукт: " + selectedProduct.getText().toString();
                textViewResult.setText(resultText); 
                } 

При натисканні кнопки "Cancel", всі дані, які були у текстовому полі знизу прибираються, а також обрані RadioButton зникають. 
 У коді це знаходиться у методі :"buttonCancel.setOnClickListener" , а саме -

    buttonCancel.setOnClickListener(v -> {
            textViewResult.setText("");
            radioGroupCompany.clearCheck();
            radioGroupProduct.clearCheck();
        });

        
Висновок: Програма за варіантом 9, в якій є групи "Продукт" та "Бренд", обираючи які і натискаючи на кнопку "ОК"- вони виводяться у окреме поле. Також передбачено вивід повідомлення, коли обрано тільки бренд, або тільки продукт. Програма реалізована на Android Studio. На мові програмування Java. За допомогою Button, RadioButton, RadioGroup, Textview та відповідних методів для натискання кнопок. 

  
