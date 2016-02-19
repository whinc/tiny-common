package com.whinc.tiny_common;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/**
 * ${END}
 * <p/>
 * <p>Created by whinc on 2016/2/19.
 * Email:xiaohui_hubei@163.com</p>
 */
public class DimensionUtils {

    public static float dp2px(Context context, float dp) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, getDisplayMetrics(context));
    }

    public static float px2dp(Context context, float px) {
        return px / getDisplayMetrics(context).density;
    }

    public static float sp2px(Context context, float sp) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, sp, getDisplayMetrics(context));
    }

    public static float px2sp(Context context, float px) {
        return px / getDisplayMetrics(context).scaledDensity;
    }

    public static int dp2px(Context context, int dp) {
        return (int) dp2px(context, (float)dp);
    }

    public static int px2dp(Context context, int px) {
        return (int) px2dp(context, (float) px);
    }

    public static int sp2px(Context context, int sp) {
        return (int) sp2px(context, (float) sp);
    }

    public static int px2sp(Context context, int px) {
        return (int) px2sp(context, (float) px);
    }

    private static Context getAppContext(Context context) {
        return context.getApplicationContext();
    }

    private static DisplayMetrics getDisplayMetrics(Context context) {
        return getAppContext(context).getResources().getDisplayMetrics();
    }
}
