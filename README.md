# Custom_Toast
This is a simple yet powerful toast libray with many features. You can download it and customize it as you want.

---------------------------------------------------------------------------------------------------------------------------------

If you donot want to do any customization with toast, then use the below line

        SimpleToast.initialize(this).setMessage("Normal Toast").show();
        
        
If you want simple toast with animation(Use ToastAnimation Class) and duration just use like below line

        SimpleToast.initialize(this).setMessage("Custom toast message is working fine")
                .setAnimation(ToastAnimations.DOWNTILEIN_DOWNTILEOUT)
                .setDuration(2000).show();
                
                
If you want custom toast make an object of SetProperties and set the properties for toast.

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
        SimpleToast.initialize(this).setProperties(simpleToast).show();
        
 
 <b>Features :-</b>  
  1. Use image or color as background.<br> 
  2. Set radis of corners for more elegant feeling.<br> 
  3. Choose Where to show the Toast in the screen with or without x,y coordinates.<br>
  4. Set custom font to toast with text style.<br>
  5. Choose enter and exit animations for toast.<br>
  6. Forget the boundries of duration of toast.<br> 
  7. Choose size of strokes with colors.<br> 
  8. Give a better view with padding and margin.<br> 
                
                
--------------------------------------------------------------------------------------------------------------------------------
