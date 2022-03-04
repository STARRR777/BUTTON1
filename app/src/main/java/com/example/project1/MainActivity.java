package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void rbclick(View view) {
        cnt=(TextView)findViewById(R.id.textView); //cnt - обьект "надпись"
        CharSequence zz = cnt.getText(); // получем содержимое обьекта
        int pz= Integer.valueOf(zz.toString()); // преобразовываем в число
        pz++; // прибавляем 1
        cnt.setText(Integer.toString(pz)); // преобразовываем в строку и возвращаем в обьект "надпись"
    }


    public void lbclick(View view) {
        cnt = (TextView) findViewById(R.id.textView); //cnt - обьект "надпись"
        CharSequence zz = cnt.getText(); // получем содержимое обьекта
        int pz = Integer.valueOf(zz.toString()); // преобразовываем в число
        pz--; // убавляем 1
        cnt.setText(Integer.toString(pz)); // преобразовываем в строку и возвращаем в обьект "надпись"
    }
}