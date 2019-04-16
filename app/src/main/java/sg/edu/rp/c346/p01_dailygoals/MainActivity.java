package sg.edu.rp.c346.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup rg1 = findViewById(R.id.RadioGroup1);
                RadioGroup rg2 = findViewById(R.id.RadioGroup2);
                RadioGroup rg3 = findViewById(R.id.RadioGroup3);

                int selectedButton1 = rg1.getCheckedRadioButtonId();
                int selectedButton2 = rg2.getCheckedRadioButtonId();
                int selectedButton3 = rg3.getCheckedRadioButtonId();

                RadioButton rb =findViewById(selectedButton1);
                RadioButton rb2 =findViewById(selectedButton2);
                RadioButton rb3 =findViewById(selectedButton3);

                EditText etrflc = findViewById(R.id.editTextRef);

                String[] result = {rb.getText().toString(), rb2.getText().toString(), rb3.getText().toString(), etrflc.getText().toString()};

                TextView tv1 = findViewById(R.id.textView1);
                TextView tv2 = findViewById(R.id.textView2);
                TextView tv3 = findViewById(R.id.textView3);

                Intent i = new Intent(MainActivity.this,
                        SecondActivity.class);

                i.putExtra("result", result);

                startActivity(i);
            }
        });


    }
}
