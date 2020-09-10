package com.example.jntua_cek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.jntua_cek.ui.account.AccountFragment;
import com.example.jntua_cek.ui.account.AccountViewModel;

public class RegisterActivity extends AppCompatActivity {
EditText name,email,password,cpassword,phone,birth,roll;
Button register;
    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name=(EditText)findViewById(R.id.ed_name);
        roll=(EditText)findViewById(R.id.ed_roll);
        email=(EditText)findViewById(R.id.ed_email);
        password=(EditText)findViewById(R.id.ed_pass);
        cpassword=(EditText)findViewById(R.id.ed_cpass);
        phone=(EditText)findViewById(R.id.ed_phone);
        birth=(EditText)findViewById(R.id.ed_birth);
        register=(Button)findViewById(R.id.register_button);
        preferences=getSharedPreferences("apssdc",MODE_PRIVATE);

    }

    public void registerl(View view) {
        String uname=name.getText().toString();
        String pass=password.getText().toString();
        String cpass=cpassword.getText().toString();
        String em=email.getText().toString();
        String r=roll.getText().toString();
        String p=phone.getText().toString();
        String b=birth.getText().toString();
        SharedPreferences.Editor editor=preferences.edit();
        editor.putString("name",uname);
        editor.putString("roll no",r);
        editor.putString("phone",p);
        editor.putString("email",em);
        editor.putString("birth",b);
        Intent intent=new Intent(RegisterActivity.this,AccountFragment.class);
        startActivity(intent);
        if(uname.equals("")){
            Toast.makeText(this,"Please enter the name",Toast.LENGTH_SHORT).show();
        }else if(pass.equals("")){
            Toast.makeText(this,"Please enter the password",Toast.LENGTH_SHORT).show();
        }
        else if(cpass.equals("")){
            Toast.makeText(this,"Please enter the Confirm password",Toast.LENGTH_SHORT).show();
        }
        else if(r.equals("")){
            Toast.makeText(this,"Please enter the Roll Number(Username)",Toast.LENGTH_SHORT).show();
        }
        else if(em.equals("")){
            Toast.makeText(this,"Please enter the gmail",Toast.LENGTH_SHORT).show();
        }
        else if(p.equals("")){
            Toast.makeText(this,"Please enter the phonenumber",Toast.LENGTH_SHORT).show();
        }
        else if(b.equals("")){
            Toast.makeText(this,"Please enter the date of birth",Toast.LENGTH_SHORT).show();
        }
        else {
            if(cpass.equals(pass)){
            editor.putString("name", uname);
            editor.putString("password", pass);
            editor.putString("rollno",r);
            editor.apply();
            Toast.makeText(this, "User Register Sucessfully", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(RegisterActivity.this, Update.LoginActivity.class);
            startActivity(i);
            }
            else{
                Toast.makeText(this,"Please enter the Confirm password correctly",Toast.LENGTH_SHORT).show();

            }
        }
    }
}