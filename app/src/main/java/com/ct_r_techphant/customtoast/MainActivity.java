package com.ct_r_techphant.customtoast;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import com.ct_r_techphant.customtoast_r.ToastAnimations;
import com.ct_r_techphant.customtoast_r.SetProperties;
import com.ct_r_techphant.customtoast_r.RToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toast(View view) {

        //if you donot want to do any customization with toast, then use the below line

        RToast.initialize(this).setMessage("Normal Toast").show();
    }

    public void toast2(View view) {
        //if you want simple toast with animation(Use ToastAnimation Class) and duration just use like below line

        RToast.initialize(this).setMessage("Custom toast message is working fine")
                .setAnimation(ToastAnimations.DOWNTILEIN_DOWNTILEOUT)
                .setDuration(2000).show();

    }

    public void toast3(View view){
        //if you want to set custom font to toast, with text style use like below

        //create a typeface of your font and pass it
        Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/quicksand-regular.otf");

        RToast.initialize(this).setMessage("Toast with custom font")
                .setAnimation(ToastAnimations.POSITION_EXPAND_LEFTIN_RIGHTOUT)
                .setCustomFont(typeface,Typeface.ITALIC)
                .setDuration(3000)
                .show();
    }

    public void toast4(View view) {
        //If you want custom toast make an object of SetProperties and set the properties for toast.

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
        simpleToast.setCustomFont(Typeface.DEFAULT,Typeface.BOLD);
        simpleToast.setAnimation(ToastAnimations.ZOOMIN_ZOOMOUT);
        simpleToast.setGravity(Gravity.CENTER | Gravity.LEFT, 100, 0);
        simpleToast.setImageAsBackground(true);
        simpleToast.setImageBackground(R.drawable.one);
        simpleToast.setPadding(40, 40, 20, 20);

        //after you done with setting properties for custom toast
        //just call it, here below is an example of it.
        RToast.initialize(this).setProperties(simpleToast).show();
    }

    public void toast5(View view) {
        //If you want custom toast make an object of SetProperties and set the properties for toast.

        SetProperties simpleToast = new SetProperties();
        simpleToast.setTextColor("#c10d37");
        simpleToast.setTextMessage("Border toast");
        simpleToast.setBackgroundColor("#fff707");
        simpleToast.setTextSize(20);
        simpleToast.setRoundedCorners(true);
        simpleToast.setCornerRadius(50);
        simpleToast.setCornerStrokeSize(5);
        simpleToast.setStrokeColor("#1ab498");
        simpleToast.setDuration(3000);
        simpleToast.setCustomFont(Typeface.DEFAULT,Typeface.BOLD);
        simpleToast.setAnimation(ToastAnimations.SWIPE_LEFTIN_SWIPE_LEFTOUT);
        simpleToast.setGravity(Gravity.CENTER, 0, 0);
        simpleToast.setImageAsBackground(false);
        simpleToast.setImageBackground(R.drawable.one);
        simpleToast.setPadding(40, 40, 20, 20);

        //after you done with setting properties for custom toast
        //just call it, here below is an example of it.
        RToast.initialize(this).setProperties(simpleToast).show();
    }

    public void toast6(View view) {
        //If you want custom toast make an object of SetProperties and set the properties for toast.

        SetProperties simpleToast = new SetProperties();
        simpleToast.setTextColor("#c10d37");
        simpleToast.setTextMessage("Border toast");
        simpleToast.setBackgroundColor("#fff707");
        simpleToast.setTextSize(20);
        simpleToast.setRoundedCorners(false);
        simpleToast.setCornerRadius(50);
        simpleToast.setCornerStrokeSize(5);
        simpleToast.setStrokeColor("#1ab498");
        simpleToast.setDuration(3000);
        simpleToast.setCustomFont(Typeface.DEFAULT,Typeface.BOLD);
        simpleToast.setAnimation(ToastAnimations.SWIPE_LEFTIN_SWIPE_LEFTOUT);
        simpleToast.setGravity(Gravity.CENTER, 0, 100);
        simpleToast.setImageAsBackground(false);
        simpleToast.setImageBackground(R.drawable.one);
        simpleToast.setPadding(40, 40, 20, 20);

        //after you done with setting properties for custom toast
        //just call it, here below is an example of it.
        RToast.initialize(this).setProperties(simpleToast).show();
    }
}
