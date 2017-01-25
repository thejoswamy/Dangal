package com.example.android.dangal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int TAKEDOWN_POINTS = 2;
    private static final int ESCAPE_POINTS = 1;
    private static final int REVERSAL_POINTS = 2;
    // Assuming NearFall for two seconds
    private static final int NEARFALL_POINTS = 2;
    // Points awarded for opposite team. Assuming first or second penalty for simplicity
    private static final int PENALTY_POINTS = 1;

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given scoreTeamA for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given scoreTeamB for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void onTakedownForTeamA(View view) {
        scoreTeamA = scoreTeamA + TAKEDOWN_POINTS;
        displayForTeamA(scoreTeamA);
    }

    public void onEscapeForTeamA(View view) {
        scoreTeamA = scoreTeamA + ESCAPE_POINTS;
        displayForTeamA(scoreTeamA);
    }

    public void onReversalForTeamA(View view) {
        scoreTeamA = scoreTeamA + REVERSAL_POINTS;
        displayForTeamA(scoreTeamA);
    }

    public void onNearFallForTeamA(View view) {
        scoreTeamA = scoreTeamA + NEARFALL_POINTS;
        displayForTeamA(scoreTeamA);
    }

    public void onPenaltyForTeamA(View view) {
        scoreTeamB = scoreTeamB + PENALTY_POINTS;
        displayForTeamB(scoreTeamB);
    }

    public void onTakedownForTeamB(View view) {
        scoreTeamB = scoreTeamB + TAKEDOWN_POINTS;
        displayForTeamB(scoreTeamB);
    }

    public void onEscapeForTeamB(View view) {
        scoreTeamB = scoreTeamB + ESCAPE_POINTS;
        displayForTeamB(scoreTeamB);
    }

    public void onReversalForTeamB(View view) {
        scoreTeamB = scoreTeamB + REVERSAL_POINTS;
        displayForTeamB(scoreTeamB);
    }

    public void onNearFallForTeamB(View view) {
        scoreTeamB = scoreTeamB + NEARFALL_POINTS;
        displayForTeamB(scoreTeamB);
    }

    public void onPenaltyForTeamB(View view) {
        scoreTeamA = scoreTeamA + PENALTY_POINTS;
        displayForTeamA(scoreTeamA);
    }

    public void onReset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}