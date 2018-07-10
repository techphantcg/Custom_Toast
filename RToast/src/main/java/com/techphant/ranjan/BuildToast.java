package com.techphant.ranjan;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.techphant.ranjan.R;

/**
 * Created by Ranjan on 15-Jul-17.
 */

final class BuildToast {


    static Dialog build(Context context, SimpleToastConstants constants) {
        Dialog dialog = GetViewForShowing.getDialog(context, constants);
        TextView textView = new TextView(context);
        textView.setGravity(Gravity.CENTER);
        textView.setText(constants.MSG);
        textView.setTextColor(Color.parseColor(constants.TEXT_COLOR));
        textView.setTextSize(constants.TEXT_SIZE);
        textView.setPadding(constants.LEFT_PADDING,
                constants.TOP_PADDING,
                constants.RIGHT_PADDING,
                constants.BOTTOM_PADDING);
        textView.setTypeface(constants.TOAST_TYPEFACE, constants.TEXT_STYLE);

        if (constants.IMAGE_OR_BACKGROUND) {
            if (!constants.BITMAP_IMAGE.equals("") || constants.BITMAP_IMAGE.equals(null)) {
                textView.setBackgroundResource(constants.BITMAP_IMAGE);

                if (constants.ROUNDED_CORNERS) {
                    Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), constants.BITMAP_IMAGE);
                    Bitmap data = getRoundedCornerBitmap(bitmap, constants.CORNER_RADIUS);
                    textView.setBackground(new BitmapDrawable(context.getResources(), data));
                }
            } else {
                textView.setBackgroundResource(R.drawable.simple_background);
                setBackgroundProperties(textView, constants);
            }
        } else {
            textView.setBackgroundResource(R.drawable.simple_background);
            setBackgroundProperties(textView, constants);
        }

        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(textView);
        try {
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        } catch (Exception e) {
            e.printStackTrace();
        }
        dialog.getWindow().setGravity(constants.GRAVITY);
        dialog.getWindow().getDecorView().setBackgroundResource(android.R.color.transparent);
        dialog.getWindow().setDimAmount(0.0f);
        dialog.setCancelable(false);
        WindowManager.LayoutParams layoutParams = dialog.getWindow().getAttributes();
        layoutParams.gravity = constants.GRAVITY;
        layoutParams.x = constants.X_OFFSET;
        layoutParams.y = constants.Y_OFFSET;
        dialog.getWindow().setAttributes(layoutParams);

        return dialog;
    }

    private static void setBackgroundProperties(TextView textView, SimpleToastConstants constants) {
        if (constants.ROUNDED_CORNERS)
            ((GradientDrawable) textView.getBackground()).setCornerRadius(constants.CORNER_RADIUS);
        else
            ((GradientDrawable) textView.getBackground()).setCornerRadius(0);
        ((GradientDrawable) textView.getBackground()).setColor(Color.parseColor(constants.BACKGROUND_COLOR));
        ((GradientDrawable) textView.getBackground()).setStroke(constants.CORNER_STROKE_SIZE,
                Color.parseColor(constants.STROKE_COLOR));
    }

    private static Bitmap getRoundedCornerBitmap(Bitmap bitmap, int roundPixelSize) {
        Bitmap output = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(output);
        final Paint paint = new Paint();
        final Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        final RectF rectF = new RectF(rect);
        final float roundPx = roundPixelSize;
        paint.setAntiAlias(true);
        canvas.drawRoundRect(rectF, roundPx, roundPx, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return output;
    }
}
