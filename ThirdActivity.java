package com.example.book;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        final RatingBar rBar = (RatingBar) findViewById(R.id.ratingBar1);
        final TextView tView = (TextView) findViewById(R.id.textview1);
        Button btn1 = (Button)findViewById(R.id.btnGet);
        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int noofstars = rBar.getNumStars();
                float getrating = rBar.getRating();
                tView.setText("Rating: "+getrating+"/"+noofstars);
                Toast.makeText(ThirdActivity.this, "Thanks for shopping!!",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}