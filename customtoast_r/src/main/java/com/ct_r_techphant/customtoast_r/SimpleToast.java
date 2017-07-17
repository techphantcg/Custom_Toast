package com.ct_r_techphant.customtoast_r;

import android.content.Context;

/**
 * Created by Ranjan on 12-Jul-17.
 */

public class SimpleToast {

    private Context context;
    private static SimpleToast simpleToast = null;
    private static boolean isPropertySet = false;
    private static SimpleToastConstants constants;

    private SimpleToast(Context context) {
        this.context = context;
    }

    private SimpleToast() {
    }

    public static SimpleToast initialize(Context context) {
        constants = new SimpleToastConstants();
        if (simpleToast == null) {
            synchronized (context) {
                if (simpleToast == null) {
                    simpleToast = new SimpleToast(context);
                }
            }
        }
        return (SimpleToast) simpleToast;
    }

    /**
     * For custom Toast create an object of <b>SetProperties</b> class and set the values.
     *
     * @param properties object of <b>SetProperties</b> class
     */
    public SimpleToast setProperties(SetProperties properties) {
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

        return this;
    }

    /**
     * Set message for Toast
     */
    public SimpleToast setMessage(String message) {
        constants.MSG = message;
        return this;
    }

    /**
     * Set the duration of toast in milliseconds
     */
    public SimpleToast setDuration(Integer duration) {
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
     * @param animation use <b>AnimationUtils</b> class for animating like <b>AnimationUtils.ZOOMIN_ZOOMOUT</b>.
     */
    public SimpleToast setAnimation(Integer animation) {
        constants.CUSTOM_ANIMATION = animation;
        return this;
    }

    private void setLayout() {
        ShowDialog.show(BuildToast.build(context, constants), constants.DURATION);
    }
}
