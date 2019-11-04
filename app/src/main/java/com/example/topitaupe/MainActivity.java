package com.example.topitaupe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout mainScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainScreen = findViewById(R.id.mainScreen);

        Case taupe = new Case(this,200,200);
        Case taupeV2 = new Case(this, 400, 200);
    }

    public ConstraintLayout getMainScreen() {
        return mainScreen;
    }

    public void setView(ImageButton taupe) {
        this.mainScreen.addView(taupe);
    }
}
