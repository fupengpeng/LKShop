package net.anumbrella.lkshop.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * author：Anumbrella
 * Date：16/5/27 下午8:57
 */
public class MyViewPager extends ViewPager {

    public static final String TAG = "MyViewPager";

    private boolean scrollble = true;

    public MyViewPager(Context context) {
        super(context);
    }

    public MyViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        Log.e(TAG, "onTouchEvent: "+"自定义viewPager" );
        if (scrollble) {
            return super.onTouchEvent(ev);
        }else {
            return false;
        }

    }

    public boolean isScrollble() {
        return scrollble;
    }

    public void setScrollble(boolean scrollble) {
        this.scrollble = scrollble;
    }
}