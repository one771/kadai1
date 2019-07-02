package com.example.kadai1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //アクティビティの起動に関するソース
        final TextView tv = (TextView)findViewById(R.id.textView2);
       //テキストの宣言 宣言文 tv

        tv.setVisibility(View.INVISIBLE);



        Button button = this.findViewById(R.id.button);
        // ボタンを取得　
        button.setOnClickListener(new View.OnClickListener() {
         // クリック時にメッセージを表示
            private int ct = 0;



            @Override
            public void onClick(View v) {

                ct++;

                if(ct == 15) {
                    //ボタンの実行回数
                    tv.setVisibility(View.VISIBLE);
                }
                else {
                    tv.setVisibility(View.INVISIBLE);
                }

                for(int c = 0; c < 20; c++ ) {

                }
            }
        });
    }

}
