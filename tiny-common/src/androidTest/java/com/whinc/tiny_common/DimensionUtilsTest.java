package com.whinc.tiny_common;

import android.content.Context;
import android.test.InstrumentationTestCase;
import android.util.DisplayMetrics;

/**
 * ${END}
 * <p/>
 * <p>Created by whinc on 2016/2/19.
 * Email:xiaohui_hubei@163.com</p>
 */
public class DimensionUtilsTest extends InstrumentationTestCase {

    public void setUp() throws Exception {
        super.setUp();

    }

    public void tearDown() throws Exception {

    }

    private Context getContext() {
        return getInstrumentation().getContext();
    }

    private DisplayMetrics getDisplayMetrics() {
        return getContext().getResources().getDisplayMetrics();
    }

    public void testDp2px() throws Exception {
        assertEquals(DimensionUtils.dp2px(getContext(), 10.0f),
                getDisplayMetrics().density * 10.0f);
        assertEquals(DimensionUtils.dp2px(getContext(), 10),
                (int)(getDisplayMetrics().density * 10));
    }

    public void testPx2dp() throws Exception {
        assertEquals(DimensionUtils.px2dp(getContext(), 9.9f),
                9.9f / getDisplayMetrics().density);
        assertEquals(DimensionUtils.px2dp(getContext(), 9),
                (int) (9 / getDisplayMetrics().density));
    }

    public void testSp2px() throws Exception {
        assertEquals(DimensionUtils.sp2px(getContext(), 10.0f),
                getDisplayMetrics().density * 10.0f);
        assertEquals(DimensionUtils.sp2px(getContext(), 10),
                (int)(getDisplayMetrics().density * 10));
    }

    public void testPx2sp() throws Exception {
        assertEquals(DimensionUtils.px2sp(getContext(), 9.9f),
                9.9f / getDisplayMetrics().density);
        assertEquals(DimensionUtils.px2sp(getContext(), 9),
                (int) (9 / getDisplayMetrics().density));
    }
}