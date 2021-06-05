/*
 *     Tanggal Pengerjaan : 5/6/2021
 *     Nim : 10118056
 *     Nama : Mirraz Ibrahim
 *     email : mirrazibrahim@gmail.com
 *     Copyright © 2021 Mirraz Ibrahim. All rights reserved.
 */

package com.mirrazdev.utspraktik_if2_10118056_mirrazibrahim;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class ViewDialog {
    public void showDialog(Activity activity, String msg){
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.activity_dialog);

        TextView text = (TextView) dialog.findViewById(R.id.isidialog);
        text.setText(msg);

        Button dialogButton = (Button) dialog.findViewById(R.id.ok);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();

    }
}
