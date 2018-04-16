package com.kayosystem.honki.chapter02.curry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    String name;
    String[] people= {"さとみ","すず","ブルゾン","誰か"};
    String[] food= {"カレー","みそ汁","チャーハン","エビチリ"};
    TextView nameTextView;
    TextView foodTextView;
    TextView verbTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTextView = (TextView) findViewById(R.id.nameTxetView);
        foodTextView = (TextView) findViewById(R.id.foodTextView);
        verbTextView = (TextView) findViewById(R.id.verbTextView);
    }

    public void serveFood(View v) {
        Random randomName = new Random();
        int index = randomName.nextInt(4);
        String name = people[index];
        nameTextView.setText(name + "さんに");

        Random randomFood = new Random();
        foodTextView.setText(food[randomFood.nextInt(4)] + "を");

        Random random = new Random();
        if (random.nextInt(100) < 50) {
            verbTextView.setText("よそえました！");
        } else {
            verbTextView.setText("よそえませんでした！");
        }
    }
}
