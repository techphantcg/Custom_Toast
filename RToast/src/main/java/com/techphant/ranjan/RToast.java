package com.techphant.ranjan;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

/**
 * Created by Ranjan on 12-Jul-17.
 */

public class RToast {

    private Context context;
    private static RToast rToast = null;
    private static boolean isPropertySet = false;
    private static SimpleToastConstants constants;

    private RToast(Context context) {
        this.context = context;
    }

    private RToast() {
    }

    public static RToast initialize(Context context) {
        constants = new SimpleToastConstants();
        if (rToast == null) {
            synchronized (context) {
                if (rToast == null) {
                    rToast = new RToast(context);
                }
            }
        }
        return (RToast) rToast;
    }

    /**
     * For custom Toast create an object of <b>SetProperties</b> class and set the values.
     *
     * @param properties object of <b>SetProperties</b> class
     */
    public RToast setProperties(SetProperties properties) {
        constants.TEXT_COLOR = properties.getTextColor();
        constants.MSG = properties.getTextMessage();
        constants.BACKGROUND_COLOR = properties.getBackgroundColor();
        constants.TEXT_SIZE = properties.getTextSize();
        constants.LEFT_PADDING = properties.getLeftPadding();
        constants.RIGHT_PADDING = properties.getRightPadding();
        constants.TOP_PADDING = properties.getTopPadding();
        constants.BOTTOM_PADDING = properties.getBottomPadding();
        constants.ROUNDED_CORNERS = properties.getRoundedCorners();
        constants.CORNER_RADIUS = properties.getCornerRadius();
        constants.CORNER_STROKE_SIZE = properties.getCornerStrokeSize();
        constants.STROKE_COLOR = properties.getStrokeColor();
        constants.GRAVITY = properties.getGravity();
        constants.X_OFFSET = properties.getX_offset();
        constants.Y_OFFSET = properties.getY_offset();
        constants.DURATION = properties.getDuration();
        constants.CUSTOM_ANIMATION = properties.getAnimation();
        constants.BITMAP_IMAGE = properties.getImageBackground();
        constants.IMAGE_OR_BACKGROUND = properties.getImageAsBackground();
        constants.TOAST_TYPEFACE = properties.getCustomFont();
        constants.TEXT_STYLE = properties.getTextStyle();
        return this;
    }

    /**
     * Set message for Toast
     */
    public RToast setMessage(String message) {
        constants.MSG = message;
        return this;
    }

    /**
     * Set the duration of toast in milliseconds
     */
    public RToast setDuration(Integer duration) {
        constants.DURATION = duration;
        return this;
    }

    /**
     * Necessary to show the toast
     */
    public void show() {
        setLayout();
    }

    /**
     * Use to set the animation while opening or closing the Toast.
     *
     * @param animation use <b>ToastAnimations</b> class for animating like <b>ToastAnimations.ZOOMIN_ZOOMOUT</b>.
     */
    public RToast setAnimation(Integer animation) {
        constants.CUSTOM_ANIMATION = animation;
        return this;
    }

    private void setLayout() {
        ShowDialog.show(BuildToast.build(context, constants), constants.DURATION);
    }

    /**Method to set custom font*/
    public RToast setCustomFont(Typeface typeface, Integer text_style) {
        constants.TOAST_TYPEFACE = typeface;
        constants.TEXT_STYLE = text_style;
        return this;
    }
}
