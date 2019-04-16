package sg.edu.rp.c346.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btnfinish = findViewById(R.id.buttonfin);

        Intent i = getIntent();
        String[] result =i.getStringArrayExtra("result");
        TextView tvd1 = findViewById(R.id.textViewDisplay1);
        TextView tvd2 = findViewById(R.id.textViewDisplay2);
        TextView tvd3 = findViewById(R.id.textViewDisplay3);
        TextView tvd4 = findViewById(R.id.textViewDisplay4);

        tvd1.setText( "Read up on materials before class : " + result[0]);
        tvd2.setText( "Arrive on time so as not to miss important part of the lesson : " + result[1]);
        tvd3.setText( "Attempt the problem myself : " + result[2]);
        tvd4.setText( "Reflection: " + result[3]);

        btnfinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
