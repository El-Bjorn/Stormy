package org.bjorn.stormy;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by bjorn on 3/22/16.
 */
public class AlertDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(R.string.error_title).setMessage(R.string.ahh_message).setPositiveButton(R.string.ok_message,null);
        AlertDialog dialog = builder.create();

        return dialog;
    }
}
