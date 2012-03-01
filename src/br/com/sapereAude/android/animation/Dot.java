package br.com.sapereAude.android.animation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class Dot extends View {
	public Dot(Context context) {
		super(context);
	}
	
	public Dot(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	public Dot(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	private float y = 400;
	private float x = 220;

	@Override
	protected void onDraw(Canvas canvas) {
		canvas.drawARGB(0, 0, 0, 0);
		Paint paint = new Paint();
		paint.setARGB(255, 255, 0, 0);
		canvas.drawCircle(x, y, 3, paint);
	}
}
