package e.hew.advancedmobilesystems2;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    private TextView mQuestionView1;
    private TextView mQuestionView2;
    private TextView mQuestionView3;
    private TextView mQuestionView4;
    private TextView mQuestionView5;
    private TextView mQuestionView6;
    private TextView mQuestionView7;
    private TextView mQuestionView8;
    private TextView mQuestionView9;
    private Button mButton;
    private EditText mEditText1;
    private EditText mEditText2;
    private EditText mEditText3;
    private EditText mEditText4;
    private EditText mEditText5;
    private EditText mEditText6;
    private EditText mEditText7;

    private int income;
    private int rent;
    private int water;
    private int electric;
    private int gas;
    private int food;
    private int other;
    private int left;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        mQuestionView1 = findViewById(R.id.textView3);
        mQuestionView2 = findViewById(R.id.textView4);
        mQuestionView3 = findViewById(R.id.textView5);
        mQuestionView4 = findViewById(R.id.textView6);
        mQuestionView5 = findViewById(R.id.textView7);
        mQuestionView6 = findViewById(R.id.textView8);
        mQuestionView7 = findViewById(R.id.textView9);
        mQuestionView8 = findViewById(R.id.textView10);
        mQuestionView9 = findViewById(R.id.textView11);
        mEditText1 = findViewById(R.id.editText1);
        mEditText2 = findViewById(R.id.editText2);
        mEditText3 = findViewById(R.id.editText3);
        mEditText4 = findViewById(R.id.editText4);
        mEditText5 = findViewById(R.id.editText5);
        mEditText6 = findViewById(R.id.editText6);
        mEditText7 = findViewById(R.id.editText7);
        mButton = findViewById(R.id.button);

        mQuestionView8.setVisibility(View.GONE);
        mQuestionView9.setVisibility(View.GONE);

        mButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                String sincome = mEditText1.getText().toString();
                income = Integer.parseInt(sincome);
                String srent = mEditText2.getText().toString();
                rent = Integer.parseInt(srent);
                String swater = mEditText3.getText().toString();
                water = Integer.parseInt(swater);
                String selectric = mEditText4.getText().toString();
                electric = Integer.parseInt(selectric);
                String sgas = mEditText5.getText().toString();
                gas = Integer.parseInt(sgas);
                String sfood = mEditText6.getText().toString();
                food = Integer.parseInt(sfood);
                String sother = mEditText7.getText().toString();
                other = Integer.parseInt(sother);

                left = income - (rent + water + electric + gas + (food*4) + other);

                mEditText1.setVisibility(View.GONE);
                mEditText2.setVisibility(View.GONE);
                mEditText3.setVisibility(View.GONE);
                mEditText4.setVisibility(View.GONE);
                mEditText5.setVisibility(View.GONE);
                mEditText6.setVisibility(View.GONE);
                mEditText7.setVisibility(View.GONE);
                mButton.setVisibility(View.GONE);

                mQuestionView1.setTextColor(Color.rgb(0,117,25));
                mQuestionView1.setText("Monthly income: " + sincome);
                mQuestionView2.setTextColor(Color.rgb(230,0,27));
                mQuestionView2.setText("Monthly rent/mortgage: " + srent);
                mQuestionView3.setTextColor(Color.rgb(230,0,27));
                mQuestionView3.setText("Monthly water bill: " + swater);
                mQuestionView4.setTextColor(Color.rgb(230,0,27));
                mQuestionView4.setText("Monthly electric bill: " + selectric);
                mQuestionView5.setTextColor(Color.rgb(230,0,27));
                mQuestionView5.setText("Monthly gas bill: " + sgas);
                mQuestionView6.setTextColor(Color.rgb(230,0,27));
                mQuestionView6.setText("Monthly food cost: " + Integer.toString(food*4));
                mQuestionView7.setTextColor(Color.rgb(230,0,27));
                mQuestionView7.setText("Other monthly cost: " + sother);

                mQuestionView8.setText("You will have £" + Integer.toString(left) + " disposable");
                mQuestionView9.setText("You should try to save around £" + Integer.toString(income/5));

                mQuestionView8.setVisibility(View.VISIBLE);
                mQuestionView9.setVisibility(View.VISIBLE);
            }
        });

    }
}
