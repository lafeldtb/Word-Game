package edu.gvsu.cis.lafeldtb.snapjudgement;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import edu.gvsu.cis.lafeldtb.snapjudgement.R;

public class Victory extends ActionBarActivity implements View.OnClickListener {

    private TextView text;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victory);
<<<<<<< HEAD
        text = (TextView) findViewById(R.id.victory);
=======

        Player player = new Player("null");
        for (Player p: game.players) {
            if (p.getScore() > player.getScore())
                player = p;
        }
        text = (TextView) findViewById(R.id.victory);
        text.setText(player.getName() + " wins the match with " + player.getScore() + " points");
        button = (Button) findViewById(R.id.ok);
        button.setOnClickListener(this);
>>>>>>> f52adad0de4a6c17e44d03b6d1502e743cfd3f55
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_victory, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        if (view == button) {
            Intent play = new Intent(Victory.this, TitleScreen.class);
            startActivity(play);
        }
    }
}
