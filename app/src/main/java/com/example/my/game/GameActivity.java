package com.example.my.game;

import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import com.example.my.R;

public class GameActivity extends AppCompatActivity {
    EditText editText;
    TextView betNotify,result,playerNum,systemNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
Button keyboard = findViewById(R.id.keyboard);
        editText = findViewById(R.id.ediText);
        betNotify = findViewById(R.id.betNotify);
        result = findViewById(R.id.result);
        playerNum = findViewById(R.id.playernum);
        systemNum = findViewById(R.id.systemnum);

//        InputConnection inputConnection = editText.onCreateInputConnection(new EditorInfo());
//        keyboard.setInputConnection(inputConnection);
//        keyboard.setVisibility(View.VISIBLE):
        String player = editText.getText().toString();
        keyboard.setOnClickListener(v -> {

                counter(5000);

        });
//
    }


    public void counter(int time){

        new CountDownTimer(time,1000){
            @Override
            public void onTick(long l) {
                betNotify.setText("Bet in "+l/1000+" seconds");
            }

            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onFinish() {
//                getPlayerNumber();
                compareResults();
                editText.getText().clear();
                playerNum.setText(String.valueOf(getPlayerNumber()));
                systemNum.setText(String.valueOf(generateNum()));
                start();
            }

        }.start();
    }
    public Integer getPlayerNumber() {
            String num = editText.getText().toString();
            int num2=0;
            if (TextUtils.isEmpty(num)){
                return num2;
            }else
            {
                num2=Integer.parseInt(num);
            }
        String num1 = "9";
        return num2;

    }
    public Integer generateNum(){
//(int) (Math.random() * 10
        return 9;
    }
    public void compareResults(){
        if (getPlayerNumber() == generateNum()){
            result.setText(R.string.won);
            }

    }

}