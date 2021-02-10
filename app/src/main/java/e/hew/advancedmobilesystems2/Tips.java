package e.hew.advancedmobilesystems2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Tips extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mQuestionView;
    private Button mButton;

    private int mQuestionNumber = 0;

    Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        mQuestionView = findViewById(R.id.textView12);
        mButton = findViewById(R.id.button2);

        updateQuestion();

        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                updateQuestion();
            }
        });
    }

    private void updateQuestion(){
        mQuestionNumber = r.nextInt(8 - 1) + 0;
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
    }

}
