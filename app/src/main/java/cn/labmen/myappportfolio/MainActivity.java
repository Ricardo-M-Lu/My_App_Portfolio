package cn.labmen.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the app
        //// Set a click listener on that View
        Button mClickButton1 = (Button)findViewById(R.id.spotify_streamer);
        mClickButton1.setOnClickListener(MainActivity.this);
        Button mClickButton2 = (Button)findViewById(R.id.scores_app);
        mClickButton2.setOnClickListener(MainActivity.this);
        Button mClickButton3 = (Button)findViewById(R.id.library_app);
        mClickButton3.setOnClickListener(MainActivity.this);
        Button mClickButton4 = (Button)findViewById(R.id.xyz_reader);
        mClickButton4.setOnClickListener(MainActivity.this);
        Button mClickButton5= (Button)findViewById(R.id.build_it_bigger);
        mClickButton5.setOnClickListener(MainActivity.this);
        Button mClickButton6= (Button)findViewById(R.id.graduation_project);
        mClickButton6.setOnClickListener(MainActivity.this);
        }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case  R.id.spotify_streamer: {
                Toast.makeText(this, "This Button will launch my spotify streamer", Toast.LENGTH_LONG).show();
                break;
            }

            case R.id.scores_app: {
                Toast.makeText(this, "This Button will launch my scores app", Toast.LENGTH_LONG).show();
                break;
            }

            case R.id.library_app: {
                Toast.makeText(this, "This Button will launch my library app", Toast.LENGTH_LONG).show();
                break;
            }

            case R.id.xyz_reader: {
                Toast.makeText(this, "This Button will launch my xyz reader", Toast.LENGTH_LONG).show();
                break;
            }

            case R.id.build_it_bigger: {
                Toast.makeText(this, "This Button will launch my build_it_bigger", Toast.LENGTH_LONG).show();
                break;
            }

            case R.id.graduation_project: {
                Toast.makeText(this, "This Button will launch my graduation project", Toast.LENGTH_LONG).show();
                break;
            }
        }
    }

}
