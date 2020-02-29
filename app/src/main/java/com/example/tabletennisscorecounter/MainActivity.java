package com.example.tabletennisscorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int teamAScore,teamBScore,teamASetScore,teamBSetScore;
    private TextView textViewTeamA,textViewTeamASet;
    private TextView textViewTeamB,textViewTeamBSet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewTeamA = findViewById(R.id.teamascore);
        textViewTeamB = findViewById(R.id.teambscore);
        textViewTeamASet= findViewById(R.id.teamasetscore);
        textViewTeamBSet= findViewById(R.id.teambsetscore);

    }
    public void displayScoreForTeamA(int score)
    {
        textViewTeamA.setText(String.valueOf(score));
    }
    public void displayScoreForTeamB(int score)
    {
        textViewTeamB.setText(String.valueOf(score));
    }

    public void displaySetScoreForTeamA(int score)
    {
        textViewTeamASet.setText(String.valueOf(score));
    }

    public void displaySetScoreForTeamB(int score)
    {
        textViewTeamBSet.setText(String.valueOf(score));
    }
    public void add1forTeamA(View view) {
        teamAScore=teamAScore+1;
        displayScoreForTeamA(teamAScore);
    }
    public void add1forTeamB(View view)
    {
        teamBScore=teamBScore+1;
        displayScoreForTeamB(teamBScore);
    }
    public void reset(View view)
    {
        teamAScore=0;
        teamBScore=0;
        displayScoreForTeamB(teamBScore);
        displayScoreForTeamA(teamAScore);
    }

    public void clicksetadda(View view) {
        teamASetScore=teamASetScore+1;
        displaySetScoreForTeamA(teamASetScore);
    }

    public void clicksetsuba(View view) {
        teamASetScore=teamASetScore-1;
        displaySetScoreForTeamA(teamASetScore);
    }

    public void clicksetaddb(View view) {
        teamBSetScore=teamBSetScore+1;
        displaySetScoreForTeamB(teamBSetScore);
    }
    public void clicksetsubb(View view) {
        teamBSetScore=teamBSetScore-1;
        displaySetScoreForTeamB(teamBSetScore);
    }
    public void gameover(View view) {
        if((teamAScore==0)&&(teamBScore == 0))
        {
            if((teamASetScore > teamBSetScore) &&((teamASetScore>= 2) || (teamBSetScore>=2)))
            {
                Toast.makeText(MainActivity.this,"Player 1 Wins", Toast.LENGTH_LONG).show();
            }
            else if((teamASetScore < teamBSetScore) &&((teamASetScore>= 2) || (teamBSetScore>=2)))
            {
                Toast.makeText(MainActivity.this,"Player 2 Wins", Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(MainActivity.this,"Player needs to play one more game", Toast.LENGTH_LONG).show();
            }
        }
        else
        {
            Toast.makeText(MainActivity.this,"Match should be completed first", Toast.LENGTH_LONG).show();
        }

    }
}
