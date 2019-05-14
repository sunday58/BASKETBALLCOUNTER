package com.example.andriod.basketballcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import static com.example.andriod.basketballcounter.R.id.action_settings;

/**
 * This app displays a counter form for basketball.
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

        displayForTeamA (0);
        displayForTeamB (0);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu){
    // inflate the menu, this adds options to the menu dat if it is present
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
}



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //handle item bar click here, the action bar will
        //automatically handle things on home.
        int id = item.getItemId();
        //no inspection simplification statement
        if (id == action_settings) {
            return super.onOptionsItemSelected(item);
        }
        return true;
    }


    /**
     * increase the score when clicked
     */

    public void increment3 (View view){
        displayForTeamB(3) ;
        displayForTeamA(3);
    }

    public void increment2 (View view) {
        displayForTeamB(2) ;
        displayForTeamA(2);
    }

    public void increment1 (View view) {
        displayForTeamB(1) ;
        displayForTeamA(1);
    }


    /**
     * display the given score for team A
     */
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
