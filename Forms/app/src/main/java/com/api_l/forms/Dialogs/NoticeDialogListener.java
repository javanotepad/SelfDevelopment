package com.api_l.forms.Dialogs;

import android.app.DialogFragment;

/**
 * Created by ahmed on 3/5/18.
 */

public interface NoticeDialogListener {
    public void onDialogPositiveClick(DialogFragment dialog);
    public void onDialogNegativeClick(DialogFragment dialog);
    public void GoalSelected(String value);
}
