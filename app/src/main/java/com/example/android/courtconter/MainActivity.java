package com.example.android.courtconter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int team_a_score = 0;
    int team_b_score = 0;

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
     * Adds 3 points for A
     */
    public void plus_3_a(View view) {
        team_a_score = team_a_score + 3;
        displayForTeamA(team_a_score);
    }

    /**
     * Adds 2 points for A
     */
    public void plus_2_a(View view) {
        team_a_score = team_a_score + 2;
        displayForTeamA(team_a_score);
    }

    /**
     * Adds 1 points for A
     */
    public void plus_1_a(View view) {
        team_a_score = team_a_score + 1;
        displayForTeamA(team_a_score);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 3 points for B
     */
    public void plus_3_b(View view) {
        team_b_score = team_b_score + 3;
        displayForTeamB(team_b_score);
    }

    /**
     * Adds 2 points for B
     */
    public void plus_2_b(View view) {
        team_b_score = team_b_score + 2;
        displayForTeamB(team_b_score);
    }

    /**
     * Adds 1 points for B
     */
    public void plus_1_b(View view) {
        team_b_score = team_b_score + 1;
        displayForTeamB(team_b_score);
    }

    public void reset_scores(View view) {
        team_a_score = 0;
        team_b_score = 0;
        displayForTeamA(team_a_score);
        displayForTeamB(team_b_score);
    }
}
