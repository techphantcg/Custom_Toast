package com.ct_r_techphant.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import com.ct_r_techphant.customtoast_r.AnimationUtils;
import com.ct_r_techphant.customtoast_r.SetProperties;
import com.ct_r_techphant.customtoast_r.SimpleToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toast(View view) {

        //if you donot want to do any customization with toast
        //just use like below line
        SimpleToast.initialize(this).setMessage("Normal Toast").show();
    }

    public void toast2(View view) {
        //if you want simple toast with animation and duration
        //just use like below line
        SimpleToast.initialize(this).setMessage("Custom toast message is working fine")
                .setAnimation(AnimationUtils.DOWNTILEIN_DOWNTILEOUT)
                .setDuration(2000).show();
    }

    public void toast3(View view) {
        //for custom toast make an object of SetProperties and set the properties for toast.

        SetProperties simpleToast = new SetProperties();
        simpleToast.setTextColor("#000000");
        simpleToast.setTextMessage("Simple Toast");
        simpleToast.setBackgroundColor("#C62828");
        simpleToast.setTextSize(40);
        simpleToast.setRoundedCorners(true);
        simpleToast.setCornerRadius(50);
        simpleToast.setCornerStrokeSize(5);
        simpleToast.setStrokeColor("#000000");
        simpleToast.setDuration(3500);
        simpleToast.setAnimation(AnimationUtils.ZOOMIN_ZOOMOUT);
        simpleToast.setGravity(Gravity.CENTER | Gravity.LEFT, 100, 0);
        simpleToast.setImageAsBackground(true);
        simpleToast.setImageBackground(R.drawable.one);
        simpleToast.setPadding(40, 40, 20, 20);

        //after you done with setting properties for custom toast
        //just call it, here below is an example of it.
        SimpleToast.initialize(this).setProperties(simpleToast).show();
    }
}
