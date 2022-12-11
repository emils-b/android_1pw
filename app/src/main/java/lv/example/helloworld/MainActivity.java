package lv.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView title = findViewById(R.id.title);
        title.setText(R.string.title);

        TextView participant1 = findViewById(R.id.participant1);
        participant1.setText(R.string.participant1);

        TextView participant2 = findViewById(R.id.participant2);
        participant2.setText(R.string.participant2);

        TextView end = findViewById(R.id.end);
        String text = getResources().getString(R.string.end) + " " + getResources().getString(R.string.participant1);
        end.setText(text);
    }
}
