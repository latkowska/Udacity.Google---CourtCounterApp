package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * This app allows to track score of basketball match
 */

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A = first team.
     */

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * After pushing the button 3 points will be add to the score
     */
    public void addThreePointsForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * After pushing the button 2 points will be add to the score
     */
    public void addTwoPointsForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * After pushing the button 1 point will be add to the score
     */
    public void addOnePointsForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B = second team.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * After pushing the button 3 points will be add to the score
     */
    public void addThreePointsForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * After pushing the button 2 points will be add to the score
     */
    public void addTwoPointsForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * After pushing the button 1 point will be add to the score
     */
    public void addOnePointsForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * After pushing this button scores and names of both teams will be reset to 0
     */

    public void ResetButton(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        EditText teamAName = findViewById(R.id.team_first_a);
        EditText teamBName = findViewById(R.id.team_second_b);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        teamAName.setText(null);
        teamBName.setText(null);
    }
}
