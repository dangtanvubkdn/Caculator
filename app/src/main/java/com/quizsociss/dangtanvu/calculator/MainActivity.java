package com.quizsociss.dangtanvu.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtso;
    private TextView txtkq;
    private Button btnso0, btnso1, btnso2, btnso3, btnso4, btnso5, btnso6, btnso7, btnso8, btnso9;
    private Button btnCong, btnTru, btnNhan, btnChia;
    private Button btnCham, btnBang, btnAC, btnC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWitget();
        setEventClickViews();
    }
    public void initWitget()
    {
        edtso= (EditText) findViewById(R.id.edt_nhap);
        txtkq= (TextView) findViewById(R.id.txt_kq);

        btnso0= (Button) findViewById(R.id.btn_so0);
        btnso1= (Button) findViewById(R.id.btn_so1);
        btnso2= (Button) findViewById(R.id.btn_so2);
        btnso3= (Button) findViewById(R.id.btn_so3);
        btnso4= (Button) findViewById(R.id.btn_so4);
        btnso5= (Button) findViewById(R.id.btn_so5);
        btnso6= (Button) findViewById(R.id.btn_so6);
        btnso7= (Button) findViewById(R.id.btn_so7);
        btnso8= (Button) findViewById(R.id.btn_so8);
        btnso9= (Button) findViewById(R.id.btn_so9);

        btnCong=(Button) findViewById(R.id.btn_cong);
        btnTru =(Button) findViewById(R.id.btn_tru);
        btnNhan=(Button) findViewById(R.id.btn_nhan);
        btnChia=(Button) findViewById(R.id.btn_chia);

        btnCham=(Button) findViewById(R.id.btn_cham);
        btnBang=(Button) findViewById(R.id.btn_bang);
        btnAC=(Button) findViewById(R.id.btn_ac);
        btnC=(Button) findViewById(R.id.btn_c);
    }
    public void setEventClickViews()
    {
        btnso0.setOnClickListener(this);
        btnso1.setOnClickListener(this);
        btnso2.setOnClickListener(this);
        btnso3.setOnClickListener(this);
        btnso4.setOnClickListener(this);
        btnso5.setOnClickListener(this);
        btnso6.setOnClickListener(this);
        btnso7.setOnClickListener(this);
        btnso8.setOnClickListener(this);
        btnso9.setOnClickListener(this);

        btnCong.setOnClickListener(this);
        btnTru.setOnClickListener(this);
        btnNhan.setOnClickListener(this);
        btnChia.setOnClickListener(this);
        btnCham.setOnClickListener(this);
        btnBang.setOnClickListener(this);
        btnAC.setOnClickListener(this);
        btnC.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btn_so0:
                edtso.append("0");
                break;
            case R.id.btn_so1:
                edtso.append("1");
                break;
            case R.id.btn_so2:
                edtso.append("2");
                break;
            case R.id.btn_so3:
                edtso.append("3");
                break;
            case R.id.btn_so4:
                edtso.append("4");
                break;
            case R.id.btn_so5:
                edtso.append("5");
                break;
            case R.id.btn_so6:
                edtso.append("6");
                break;
            case R.id.btn_so7:
                edtso.append("7");
                break;
            case R.id.btn_so8:
                edtso.append("8");
                break;
            case R.id.btn_so9:
                edtso.append("9");
                break;
            case R.id.btn_cong:
                edtso.append("+");
                break;
            case R.id.btn_tru:
                edtso.append("-");
                break;
            case R.id.btn_nhan:
                edtso.append("*");
                break;
            case R.id.btn_chia:
                edtso.append("/");
                break;
            case R.id.btn_cham:
                edtso.append(".");
                break;
            case R.id.btn_bang:

                break;
            case R.id.btn_ac:
                edtso.setText("");
                break;
            case R.id.btn_c:
                BaseInputConnection textFieldInputConnection = new BaseInputConnection(edtso,true);
                textFieldInputConnection.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL));
                break;
        }
    }

}
