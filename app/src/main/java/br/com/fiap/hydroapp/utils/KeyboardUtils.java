package br.com.fiap.hydroapp.utils;

import android.app.Activity;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

/**
 *
 * Created by valterjunior on 02/09/2019
 */
public class KeyboardUtils {

    public static void hideKeyboard(Activity activity, TextView textView) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(textView.getWindowToken(), 0);
    }



}

