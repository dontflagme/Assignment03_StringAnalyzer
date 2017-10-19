package co.miniforge.corey.stringanalyzer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InputActivity extends AppCompatActivity {
    public static String intentTag = "inputData";

    EditText input;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        locateViews();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This is a toast", Toast.LENGTH_LONG).show();
                String inputString = input.getText().toString();
                Intent intent = new Intent(getApplicationContext(), AnalyzerActivity.class);

                intent.putExtra(intentTag, inputString);

                startActivity(intent);
            }
        });
    }

    void locateViews(){
        input = (EditText) findViewById(R.id.stringToAnalyzeEditText);
        submit = (Button) findViewById(R.id.submitButton);
    }

    void bindFunctionality(){
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This is a toast", Toast.LENGTH_LONG).show();
                String inputString = input.getText().toString();
                Intent intent = new Intent(getApplicationContext(), AnalyzerActivity.class);
                //intent.putExtra(intentTag, inputString);
                //intent.putExtra("test", "test");
                startActivity(intent);
            }
        });
    }
}
