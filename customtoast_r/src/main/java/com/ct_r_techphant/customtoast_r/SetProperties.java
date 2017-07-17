package com.ct_r_techphant.customtoast_r;

import android.graphics.Typeface;
import android.view.Gravity;

/**
 * Created by Ranjan on 12-Jul-17.
 */

public class SetProperties {

    private String textColor = "#ffffff";
    private String textMessage = "";
    private String backgroundColor = "716f6f";
    private Integer textSize = 14;
    private Integer leftPadding = 20;
    private Integer rightPadding = 20;
    private Integer topPadding = 20;
    private Integer bottomPadding = 20;
    private Integer leftMargin = 0;
    private Integer rightMargin = 0;
    private Integer topMargin = 0;
    private Integer bottomMargin = 0;
    private Boolean roundedCorners = true;
    private Integer cornerRadius = 50;
    private Integer cornerStrokeSize = 2;
    private String strokeColor = "#ffffff";
    private Integer duration = 2000;
    private Integer gravity = Gravity.BOTTOM;
    private Integer X_offset = 0;
    private Integer Y_offset = 100;
    private Integer animation = ToastAnimations.DEFAULT;
    private Integer imageBackground = 0;
    private Boolean imageAsBackground = false;
    private Typeface customFont = Typeface.DEFAULT;
    private Integer textStyle = Typeface.NORMAL;


    /**
     * Send color like <b>#000000</b>
     *
     * @param textColor sent 6 six digit hex code for text color
     */
    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    /**
     * @param textMessage Message to be shown in Toast
     */
    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    /**
     * Send color like <b>#000000</b>
     *
     * @param backgroundColor sent 6 six digit hex code for background color
     */
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    /**
     * @param textSize send int textsize for toast message
     */
    public void setTextSize(Integer textSize) {
        this.textSize = textSize;
    }

    /**
     * set Integer padding
     *
     * @param left   for left padding
     * @param right  for right padding
     * @param top    for top padding
     * @param bottom for bottom padding
     */
    public void setPadding(Integer left, Integer right, Integer top, Integer bottom) {
        this.leftPadding = left;
        this.rightPadding = right;
        this.topPadding = top;
        this.bottomPadding = bottom;
    }

    /**
     * set Integer margin
     *
     * @param left   for left margin
     * @param right  for right margin
     * @param top    for top margin
     * @param bottom for bottom margin
     */
    public void setMargin(Integer left, Integer right, Integer top, Integer bottom) {
        this.leftMargin = left;
        this.rightMargin = right;
        this.topMargin = top;
        this.bottomMargin = bottom;
    }

    public void setLeftPadding(Integer leftPadding) {
        this.leftPadding = leftPadding;
    }

    public void setRightPadding(Integer rightPadding) {
        this.rightPadding = rightPadding;
    }

    public void setTopPadding(Integer topPadding) {
        this.topPadding = topPadding;
    }

    public void setBottomPadding(Integer bottomPadding) {
        this.bottomPadding = bottomPadding;
    }

    public void setLeftMargin(Integer leftMargin) {
        this.leftMargin = leftMargin;
    }

    public void setRightMargin(Integer rightMargin) {
        this.rightMargin = rightMargin;
    }

    public void setTopMargin(Integer topMargin) {
        this.topMargin = topMargin;
    }

    public void setBottomMargin(Integer bottomMargin) {
        this.bottomMargin = bottomMargin;
    }

    /**
     * Decide weather to show rounded corners or not
     *
     * @param roundedCorners <b>true</b> to be shown and <b>false</b> for removing rounded corners
     */
    public void setRoundedCorners(Boolean roundedCorners) {
        this.roundedCorners = roundedCorners;
    }

    /**
     * Set corner radius of toast view, this will only work if <b>setRoundedCorners</b> is true
     *
     * @param cornerRadius integer corner radius
     */
    public void setCornerRadius(Integer cornerRadius) {
        this.cornerRadius = cornerRadius;
    }

    /**
     * Size of stroke in around toast
     *
     * @param cornerStrokeSize integer stroke size
     */
    public void setCornerStrokeSize(Integer cornerStrokeSize) {
        this.cornerStrokeSize = cornerStrokeSize;
    }

    /**
     * Set the color or corner stroke of toast
     *
     * @param strokeColor Hex String color code like <b>#000000</b>
     */
    public void setStrokeColor(String strokeColor) {
        this.strokeColor = strokeColor;
    }

    /**
     * Set the duration of your toast
     *
     * @param duration_in_millisecons send integer duration
     */
    public void setDuration(Integer duration_in_millisecons) {
        this.duration = duration_in_millisecons;
    }

    /**
     * Use to show your toast at a specific positon like <b>Gravity.TOP | Gravity.LEFT , Gravity.CENTER... etc</b>
     *
     * @param gravity use <b>Gravity</b> object to set gravity
     */
    public void setGravity(Integer gravity) {
        this.gravity = gravity;
    }

    /**
     * Use to show your toast at a specific positon with <b>X,Y Coordinates</b> like <b>Gravity.TOP | Gravity.LEFT ,
     * Gravity.CENTER... etc</b>
     *
     * @param gravity  use <b>Gravity</b> object to set gravity.
     * @param X_offset integer <b>X-Coordinate</b> position.
     * @param Y_offset integer <b>Y-Coordinate</b> position.
     */
    public void setGravity(Integer gravity, Integer X_offset, Integer Y_offset) {
        this.gravity = gravity;
        this.X_offset = X_offset;
        this.Y_offset = Y_offset;
    }

    /**
     * Use to set the animation while opening or closing the Toast.
     *
     * @param animation use <b>ToastAnimations</b> class for animating like <b>ToastAnimations.ZOOMIN_ZOOMOUT</b>.
     */
    public void setAnimation(Integer animation) {
        this.animation = animation;
    }

    /**
     * set a background image which is in drawable folder(<b>currently you cannot use images which are not in drawable</b>
     * and remember to set <b>setImageAsBackground</b> to <b>true</b>)
     *
     * @param imageBackground Drawable resource id
     */
    public void setImageBackground(Integer imageBackground) {
        this.imageBackground = imageBackground;
    }

    /**
     * Set true if you want to set Image as background of toast otherwise background class will be used
     *
     * @param imageAsBackground <b>true</b> to set image as background and <b>false</b> for not.
     */
    public void setImageAsBackground(Boolean imageAsBackground) {
        this.imageAsBackground = imageAsBackground;
    }

    public void setCustomFont(Typeface customFont, Integer textStyle) {
        this.customFont = customFont;
        this.textStyle = textStyle;
    }

    String getTextColor() {
        return textColor;
    }

    String getTextMessage() {
        return textMessage;
    }

    String getBackgroundColor() {
        return backgroundColor;
    }

    Integer getLeftPadding() {
        return leftPadding;
    }

    Integer getRightPadding() {
        return rightPadding;
    }

    Integer getTopPadding() {
        return topPadding;
    }

    Integer getBottomPadding() {
        return bottomPadding;
    }

    Integer getLeftMargin() {
        return leftMargin;
    }

    Integer getRightMargin() {
        return rightMargin;
    }

    Integer getTopMargin() {
        return topMargin;
    }

    Integer getBottomMargin() {
        return bottomMargin;
    }

    Boolean getRoundedCorners() {
        return roundedCorners;
    }

    Integer getCornerRadius() {
        return cornerRadius;
    }

    Integer getCornerStrokeSize() {
        return cornerStrokeSize;
    }

    Integer getTextSize() {
        return textSize;
    }

    String getStrokeColor() {
        return strokeColor;
    }

    Integer getDuration() {
        return duration;
    }

    Integer getGravity() {
        return gravity;
    }

    Integer getX_offset() {
        return X_offset;
    }

    Integer getY_offset() {
        return Y_offset;
    }

    Integer getAnimation() {
        return animation;
    }

    Integer getImageBackground() {
        return imageBackground;
    }

    Boolean getImageAsBackground() {
        return imageAsBackground;
    }

    Typeface getCustomFont() {
        return customFont;
    }

    Integer getTextStyle() {
        return textStyle;
    }
}
