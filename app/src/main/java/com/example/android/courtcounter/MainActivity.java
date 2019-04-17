package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ScoreTeamA = 0;
    int ScoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(ScoreTeamA );
    }

    public void displayForTeamA (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void  increament3 (View view) {
        ScoreTeamA = (ScoreTeamA + 3);
        displayForTeamA(ScoreTeamA);

    }
    public void  increament2 (View view) {
        ScoreTeamA =(ScoreTeamA + 2 );
        displayForTeamA(ScoreTeamA);
    }
    public void increament1(View view) {
        ScoreTeamA = (ScoreTeamA + 1);
        displayForTeamA(ScoreTeamA);
    }
    public void displayForTeamB (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void Show3B (View view) {
        ScoreTeamB = (ScoreTeamB + 3);
        displayForTeamB(ScoreTeamB);

    }

    public void Show2B (View view) {
        ScoreTeamB = (ScoreTeamB + 2);
        displayForTeamB(ScoreTeamB);
    }

    public void Show1B (View view) {
        ScoreTeamB = (ScoreTeamB + 1);
        displayForTeamB(ScoreTeamB);
    }
    public void ResetButton (View view) {
        ScoreTeamA = 0;
        ScoreTeamB = 0;
        displayForTeamA (0);
        displayForTeamB (0);

    }

}