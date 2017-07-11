package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    RectF rectF = new RectF();
    String[] osName = new String[]{"Froyo", "GB", "ICS", "JB", "KitKat", "L", "M"};
    float[] points = new float[]{700, 250, 810, 180, 810, 180, 910, 180};

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        rectF.left = 200;
        rectF.right = 800;
        rectF.top = 10;
        rectF.bottom = 610;

        paint.setColor(Color.WHITE);
        paint.setTextSize(24);
        canvas.drawLines(points, paint);
        canvas.drawText(osName[0], 920, 180, paint);

        paint.setColor(Color.YELLOW);
        canvas.drawArc(rectF, -50, 50, true, paint);

        paint.setColor(Color.MAGENTA);
        canvas.drawArc(rectF, 5, 10, true, paint);

        paint.setColor(Color.DKGRAY);
        canvas.drawArc(rectF, 20, 10, true, paint);

        paint.setColor(Color.GREEN);
        canvas.drawArc(rectF, 35, 40, true, paint);

        paint.setColor(Color.BLUE);
        canvas.drawArc(rectF, 80, 95, true, paint);

        rectF.left = 180;
        rectF.right = 780;
        rectF.top = 0;
        rectF.bottom = 600;

        paint.setColor(Color.RED);
        canvas.drawArc(rectF, -180, 130, true, paint);
    }
}
