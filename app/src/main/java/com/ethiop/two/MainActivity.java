package com.ethiop.two;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.ethiop.assignmenttwo.R;

public class MainActivity extends AppCompatActivity {

    TextView viewss;
            int var;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState!= null) {

            var = savedInstanceState.getInt("count");
                viewss = (TextView) findViewById(R.id.countView);
                       viewss.setText(String.valueOf(var));
        }
    }

    public void count(View view) {

            viewss = (TextView) findViewById(R.id.countView);
                                 String getView = (String) viewss.getText();
                                        var = Integer.parseInt(getView);
                    var += 1;
                            viewss.setText(Integer.toString(var));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count",var);
    }
}