package br.com.sapereAude.android.animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;

public class AnimationTestActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        View body = findViewById(R.id.body);
        body.startAnimation(AnimationUtils.loadAnimation(this, R.anim.body_animation));
        
        View leftArm = findViewById(R.id.left_arm);
        leftArm.startAnimation(AnimationUtils.loadAnimation(this, R.anim.left_arm_animation));
        
        View rightArm = findViewById(R.id.right_arm);
        rightArm.startAnimation(AnimationUtils.loadAnimation(this, R.anim.right_arm_animation));
    }
}