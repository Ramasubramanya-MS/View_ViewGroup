package in.bnmit.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initViews();





    }

    private void initViews() {
        EditText email_et = findViewById(R.id.email_et);
        EditText pass_et = findViewById(R.id.password_et);
        CheckBox check_cb = findViewById(R.id.t_and_c_cb);
        Button login_btn = findViewById(R.id.login_bt);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(LoginActivity.this,"Login btn clicked",Toast.LENGTH_LONG).show();

            }
        });

        check_cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                Toast.makeText(LoginActivity.this,"checkbox "+b,Toast.LENGTH_LONG).show();

            }
        });
    }


}