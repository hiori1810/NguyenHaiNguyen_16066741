package com.example.student.nhn_cau1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtTaikhoan,edtMatkhau;
    CheckBox cbLuuthongtin;
    Button btnDangnhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTaikhoan=(EditText)findViewById(R.id.edtTaikhoan);
        edtMatkhau=(EditText)findViewById(R.id.edtMatkhau);
        cbLuuthongtin=(CheckBox)findViewById(R.id.cbLuuthongtin);
        btnDangnhap=(Button)findViewById(R.id.btnDangnhap);
        btnDangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cbLuuthongtin.isChecked()){
                    Toast toast=Toast.makeText(MainActivity.this,"Chào mừng bạn đã đăng nhập hệ thống. Thông tin của bạn đã được lưu.",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else{
                    Toast toast2=Toast.makeText(MainActivity.this,"Chào mừng bạn đã đăng nhập hệ thống. Thông tin của bạn không được lưu.",Toast.LENGTH_SHORT);
                    toast2.show();
                }

            }
        });
    }
}
