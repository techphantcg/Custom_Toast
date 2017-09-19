package com.ct_r_techphant.customtoast_r;

import android.app.Dialog;
import android.content.Context;

/**
 * Created by Ranjan on 15-Jul-17.
 */

final class GetViewForShowing {

    private GetViewForShowing() {
    }

    static Dialog getDialog(Context context, SimpleToastConstants constants) {
        switch (constants.CUSTOM_ANIMATION) {
            case 0:
                return new Dialog(context);

            case 1:
                return new Dialog(context, R.style.LeftIn_LeftOut);

            case 2:
                return new Dialog(context, R.style.RightIn_RightOut);

            case 3:
                return new Dialog(context, R.style.RightIn_LeftOut);

            case 4:
                return new Dialog(context, R.style.LeftIn_RightOut);

            case 5:
                return new Dialog(context, R.style.SlideUp_SlideDown);

            case 6:
                return new Dialog(context, R.style.RotateIn_RotateOut);

            case 7:
                return new Dialog(context, R.style.ZoomIn_Zoomout);

            case 8:
                return new Dialog(context, R.style.UpTileIn_UpTileOut);

            case 9:
                return new Dialog(context, R.style.DownTileIn_DownTileOut);

            case 10:
                return new Dialog(context, R.style.Expand_Collapse);

            case 11:
                return new Dialog(context, R.style.PositionExpand_Right);

            case 12:
                return new Dialog(context, R.style.PositionExpand_Left);

            case 13:
                return new Dialog(context, R.style.PositionExpand_LeftIn_RightOut);

            case 14:
                return new Dialog(context, R.style.PositionExpand_RightIn_LeftOut);

            case 15:
                return new Dialog(context, R.style.SwipeLeftIn_SwipeLeftOut);

            case 16:
                return new Dialog(context, R.style.SwipeRightIn_SwipeRightOut);

            case 17:
                return new Dialog(context, R.style.SwipeLeftIn_SwipeRightOut);

            case 18:
                return new Dialog(context, R.style.SwipeRightIn_SwipeLeftOut);

            default:
                return new Dialog(context);

        }

    }
}
