package com.example.administrator.biaozhunban.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import com.example.administrator.biaozhunban.R;

/**
 * Created by Administrator on 2018/1/28.
 */

public class IndexBar extends View {
    private String[] chars = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "#"};
    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private int width;
    private int sHeight;
    private CharSelectedListener sListener;
    private int height;

    public IndexBar(Context context) {
        this(context, null);
    }

    public IndexBar(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, -1);
    }

    public IndexBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
//        setBackgroundColor(R.drawable.index_bar_shape);
        init();
    }

    private void init() {
        mPaint.setColor(Color.BLACK);
        mPaint.setTextAlign(Paint.Align.CENTER);
        mPaint.setTypeface(Typeface.DEFAULT_BOLD);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        width = getMeasuredWidth();
        height = getMeasuredHeight();
        sHeight = height / 27;
        int mTextSize = Math.min(sHeight, width);
        mPaint.setTextSize(mTextSize);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        for (int i = 0; i < chars.length; i++) {
            canvas.drawText(String.valueOf(chars[i]), width / 2, (i + 1) * sHeight, mPaint);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(sListener==null)return true;
        boolean result=false;
        int action = event.getAction();
        int y= (int) event.getY();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_MOVE:
                String s = search(y);
                sListener.charSelected(s);
                result=true;
                break;
            case MotionEvent.ACTION_UP:
                sListener.cancel();
                result=true;
                break;
        }
        return result;
    }

    private String search(int y){
        if(y<0)return chars[0];
        if(y>height)return chars[26];
        int index = (int) ((y + 0.5) / sHeight);
        return chars[Math.min(index,26)];
    }

    public interface CharSelectedListener{
        void charSelected(String s);
        void cancel();
    }

    public void setCharSelectedListener(CharSelectedListener listener){
        sListener=listener;
    }
}
