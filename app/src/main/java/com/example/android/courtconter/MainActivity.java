package com.example.android.courtconter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 3 points
     */
    public void plus_3(View view) {
        int team_a_score = 0;
        team_a_score = team_a_score + 3;
        displayForTeamA(team_a_score);
    }

    /**
     * Adds 2 points
     */
    public void plus_2(View view) {
        int team_a_score = 0;
        team_a_score = team_a_score + 2;
        displayForTeamA(team_a_score);
    }

    /**
     * Adds 1 points
     */
    public void plus_1(View view) {
        int team_a_score = 0;
        team_a_score = team_a_score + 1;
        displayForTeamA(team_a_score);
    }
}
