package com.example.therealcourtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
        TextView scoreView = (TextView) findViewById(R.id.teamAScore);
        scoreView.setText(String.valueOf(score));
    }

    int scoreTeamA = 0;

    public void addThreeForTeamA(View v)
    {scoreTeamA+=3;
    displayForTeamA(scoreTeamA);}

    public void addTwoPointsForTeamA(View v)
    {scoreTeamA+=2;
    displayForTeamA(scoreTeamA);}

    public void freeThrowForTeamA(View v)
    {scoreTeamA+=1;
    displayForTeamA(scoreTeamA);}



    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamBScore);
        scoreView.setText(String.valueOf(score));
    }

    int scoreTeamB = 0;

    public void addThreeForTeamB(View v)
    {scoreTeamB+=3;
        displayForTeamB(scoreTeamB);}

    public void addTwoPointsForTeamB(View v)
    {scoreTeamB+=2;
        displayForTeamB(scoreTeamB);}

    public void freeThrowForTeamB(View v)
    {scoreTeamB+=1;
        displayForTeamB(scoreTeamB);}


        public void reset(View v)
        {scoreTeamA = 0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);}

}