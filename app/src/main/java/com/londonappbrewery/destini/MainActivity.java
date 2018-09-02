package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView view1;
    Button answer1;
    Button answer2;

    int mStoryIndex;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState !=null){
            mStoryIndex = savedInstanceState.getInt("Index");
                   }
                   else if (mStoryIndex == 5) {
            answer2.setVisibility(View.GONE);
            answer1.setVisibility(View.GONE);
            }
            else {
            mStoryIndex = 1;

        }




        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
view1 = (TextView) findViewById(R.id.storyTextView);
answer1 = findViewById(R.id.buttonTop);
answer2 = findViewById(R.id.buttonBottom);






        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view1.setText(R.string.T3_Story);
                answer1.setText(R.string.T3_Ans1);
                answer2.setText(R.string.T3_Ans2);

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view1.setText(R.string.T2_Story);
                answer1.setText(R.string.T2_Ans1);
                answer2.setText(R.string.T2_Ans2);



            }
        });



    }
}
