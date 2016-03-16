package com.wangsy.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText ed_number;
    private EditText ed_password;
    private CheckBox cbx;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);



       
        ed_number=(EditText)findViewById(R.id.qqnumber);
        ed_password= (EditText) findViewById(R.id.qqpassword);
        cbx= (CheckBox) findViewById(R.id.remember);
    }
    public void login(View v){
        String number=ed_number.getText().toString().trim();
        String password=ed_password.getText().toString().trim();
        Boolean isChecked=cbx.isChecked();
        if(TextUtils.isEmpty(number)||TextUtils.isEmpty(password)){
            Toast.makeText(this,"qingshuruzhanghaomima",Toast.LENGTH_LONG).show();
        }
        if(isChecked){
            Toast.makeText(this,"已选择保存",Toast.LENGTH_LONG).show();

        }else{
            Toast.makeText(this,"未选择保存",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
