package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    int width = 100;
    int divider = 20;
    int[] os = new int[]{1, 2, 2, 5, 6, 7, 4};
    String[] osName = new String[]{"Froyo", "GB", "ICS", "JB", "KitKat", "L", "M"};
    RectF rectF = new RectF();

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(2);
        canvas.drawLine(120, 10, 120, 501, paint);
        canvas.drawLine(120, 501, 1000, 501, paint);
        rectF.left = 120 - width;
        rectF.bottom = 501;
        for (int i = 0; i < os.length; i++) {
            paint.setColor(Color.GREEN);
            rectF.left += (width + divider);
            rectF.right = rectF.left + width;
            rectF.top = rectF.bottom - os[i] * 30;
            canvas.drawRect(rectF, paint);
            paint.setColor(Color.WHITE);
            paint.setTextSize(24);
            canvas.drawText(osName[i], rectF.left + 20, rectF.bottom + 20, paint);
        }
        paint.setTextSize(40);
        canvas.drawText("直方图", 500, 600, paint);
    }
}
