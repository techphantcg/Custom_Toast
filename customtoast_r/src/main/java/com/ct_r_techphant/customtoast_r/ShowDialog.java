package com.ct_r_techphant.customtoast_r;

import android.app.Dialog;
import android.os.Handler;

/**
 * Created by Ranjan on 14-Jul-17.
 */

final class ShowDialog {

    private ShowDialog() {}

    static void show(final Dialog dialog, final Integer duration){

        dialog.show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                dialog.dismiss();
            }
        }, duration);
    }
}
