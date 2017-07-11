package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {
    Paint paint;
    Path path = new Path();

    public Practice9DrawPathView(Context context) {
        super(context);
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        path.addArc(400, 300, 600, 500, 180, 180);
        path.arcTo(600, 300, 800, 500, 180, 180, false);
        path.lineTo(600, 650);
        path.close();
        canvas.drawPath(path, paint);
    }
}
