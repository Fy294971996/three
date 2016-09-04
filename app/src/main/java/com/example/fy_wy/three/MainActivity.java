package com.example.fy_wy.three;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = (TextView) findViewById(R.id.textview);
        final TextView textView1=(TextView) findViewById(R.id.textView);
        final EditText editText=(EditText) findViewById(R.id.editText);
        Button button=(Button) findViewById(R.id.button);
        CheckBox xiao = (CheckBox) findViewById(R.id.xiaomi);
        CheckBox hua = (CheckBox) findViewById(R.id.huawei);
        CheckBox mei = (CheckBox) findViewById(R.id.meizu);
        CheckBox chui = (CheckBox) findViewById(R.id.chuizi);
        RadioButton radioButton=(RadioButton)findViewById(R.id.boy);
        hua.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textView.setText("华为");
                } else textView.setText("");
            }
        });
        xiao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textView.setText("小米");
                } else textView.setText("");
            }
        });
        mei.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textView.setText("魅族");
                } else textView.setText("");
            }
        });
        chui.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textView.setText("锤子");
                } else textView.setText("");
            }
        });
        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textView1.setText("男");
                } else textView1.setText("女");
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("你猜对了");
            }
        });


    }
}
