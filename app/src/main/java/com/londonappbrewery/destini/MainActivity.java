package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //final String TAG = "MainActivity";
    Button mTopButton;
    Button mBottomButton;
    TextView mStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTopButton = findViewById(R.id.buttonTop);
        mBottomButton = findViewById(R.id.buttonBottom);
        mStory = findViewById(R.id.storyTextView);

        switchT1();
    }

    private void switchT1() {
        mStory.setText(R.string.T1_Story);
        mTopButton.setText(R.string.T1_Ans1);
        mBottomButton.setText(R.string.T1_Ans2);
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchT3();
            }
        });
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchT2();
            }
        });
    }

    private void switchT2() {
        mStory.setText(R.string.T2_Story);
        mTopButton.setText(R.string.T2_Ans1);
        mBottomButton.setText(R.string.T2_Ans2);
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchT3();
            }
        });
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mStory.setText(R.string.T4_End);
                mTopButton.setVisibility(View.INVISIBLE);
                mBottomButton.setVisibility(View.INVISIBLE);
            }
        });
    }

    private void switchT3() {
        mStory.setText(R.string.T3_Story);
        mTopButton.setText(R.string.T3_Ans1);
        mBottomButton.setText(R.string.T3_Ans2);
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mStory.setText(R.string.T6_End);
                mTopButton.setVisibility(View.INVISIBLE);
                mBottomButton.setVisibility(View.INVISIBLE);
            }
        });
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mStory.setText(R.string.T5_End);
                mTopButton.setVisibility(View.INVISIBLE);
                mBottomButton.setVisibility(View.INVISIBLE);
            }
        });
    }
}
