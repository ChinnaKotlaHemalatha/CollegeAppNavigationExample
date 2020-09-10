package com.example.jntua_cek;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.jntua_cek.ui.main.UpdateFragment;

public class Update extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, UpdateFragment.newInstance())
                    .commitNow();
        }
    }

    public static class LoginActivity extends AppCompatActivity {
        Button login,register;
        EditText username,password;
        SharedPreferences preferences;
        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.loginlayout);
            login=(Button)findViewById(R.id.btnlogin);
            register=(Button)findViewById(R.id.btnregister);
            username=(EditText)findViewById(R.id.etusername);
            password=(EditText)findViewById(R.id.etpassword);
            preferences=getSharedPreferences("apssdc",MODE_PRIVATE);
            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String u_name=username.getText().toString();
                    String u_pass=password.getText().toString();
                    String reg_u_name=preferences.getString("rollno","");
                    String reg_u_pass=preferences.getString("password","");
                    if(u_name.equals(reg_u_name) && u_pass.equals(reg_u_pass)){
                        login_sel();
                    }else{
                        Toast.makeText(getApplicationContext(),"Password selected",Toast.LENGTH_SHORT).show();
                    }

                }
            });
        }

        private void login_sel() {
            Intent intent=new Intent(this, MainActivity.class);
            String user=username.getText().toString().toUpperCase();
            intent.putExtra("USERNAME",user);
            startActivity(intent);
            Toast.makeText(getApplicationContext(),"User login Sucessfully",Toast.LENGTH_SHORT).show();
        }

        public void register(View view) {
      Intent i=new Intent(LoginActivity.this,RegisterActivity.class);
      startActivity(i);
        }
    }
}