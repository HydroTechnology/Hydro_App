package br.com.fiap.hydroapp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import br.com.fiap.hydroapp.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class BeforeLoginActivity extends BaseAppCompatActivity {

    @BindView(R.id.activity_before_button_sig_in_up)
    Button registrerButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before_login);
        init();

    }

    private void init(){

        ButterKnife.bind(this);
        setEvents();
    }


    private void setEvents(){

        registrerButton.setOnClickListener(onSaveClick());
    }

    private View.OnClickListener onSaveClick() {

        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                signIn();

            }
        };
    }

    private void signIn(){
        Intent intent = new Intent(BeforeLoginActivity.this, SignUpActivity.class);
        startActivity(intent);
    }


}
