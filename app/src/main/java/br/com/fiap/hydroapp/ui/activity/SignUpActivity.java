package br.com.fiap.hydroapp.ui.activity;


import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

import com.mobsandgeeks.saripaar.annotation.ConfirmPassword;
import com.mobsandgeeks.saripaar.annotation.Email;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Password;

import br.com.fiap.hydroapp.R;
import butterknife.BindView;

public class SignUpActivity extends BaseAppCompatActivity implements TextWatcher {




    @NotEmpty(messageResId = R.string.mandatory)
    @BindView(value = R.id.name)
    EditText name;

    @Email(messageResId = R.id.invalid_email, sequence = 2)
    @NotEmpty(messageResId = R.string.mandatory, sequence = 1)
    @BindView(value = R.id.email)
    EditText email;

    @NotEmpty(messageResId = R.string.mandatory, sequence = 1)
    @BindView(value = R.id.ddd)
    EditText ddd;

    @NotEmpty(messageResId = R.string.mandatory, sequence = 1)
    @BindView(value = R.id.phone)
    EditText phone;

    @Password(messageResId = R.string.invalid_password, sequence = 3)
    @NotEmpty(messageResId = R.string.mandatory, sequence = 1)
    @BindView(value = R.id.password)
    EditText password;

    @ConfirmPassword(messageResId = R.string.password_dont_match, sequence = 4)
    @NotEmpty(messageResId = R.string.mandatory, sequence = 1)
    @BindView(value = R.id.retype_password)
    EditText retypePassword;

    @BindView(R.id.activity_setup_my_schedule_save)
    Button saveButton;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}
