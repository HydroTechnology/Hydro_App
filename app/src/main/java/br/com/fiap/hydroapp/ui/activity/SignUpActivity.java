package br.com.fiap.hydroapp.ui.activity;


import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.ConfirmPassword;
import com.mobsandgeeks.saripaar.annotation.Email;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Password;

import java.util.List;

import br.com.fiap.hydroapp.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class SignUpActivity extends BaseAppCompatActivity implements TextWatcher {




    @NotEmpty(messageResId = R.string.mandatory)
    @BindView(value = R.id.name)
    EditText name;

    @Email(messageResId = R.string.invalid_email, sequence = 2)
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
    private Validator validator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);




        init();
    }

    private void init(){

        ButterKnife.bind(this);
        setEvents();
        setValidator();

    }

    private void setValidator() {
        validator = new Validator(this);
        validator.setValidationListener(validatorRules());

    }

    private Validator.ValidationListener validatorRules() {
        return new Validator.ValidationListener() {
            @Override
            public void onValidationSucceeded() {

            }

            @Override
            public void onValidationFailed(List<ValidationError> errors) {
                for(ValidationError error : errors){

                    View view = error.getView();
                    String message = error.getCollatedErrorMessage(SignUpActivity.this);

                    //Display error messages;

                    if(view instanceof EditText){
                        ((EditText) view).setError(message);
                    }

                }

            }
        };

    }

    private void setEvents(){

        saveButton.setOnClickListener(onSaveClick());
        ddd.addTextChangedListener(this);
        phone.addTextChangedListener(this);
        password.addTextChangedListener(this);
        retypePassword.addTextChangedListener(this);
    }

    private View.OnClickListener onSaveClick() {

        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validator.validate();

                





            }
        };
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
