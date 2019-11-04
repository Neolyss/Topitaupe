package com.example.topitaupe;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class Case {

    private MainActivity context;
    private ImageButton taupe;
    private float coorX;
    private float coorY;

    public Case(MainActivity context,float coorX, float coorY) {
        this.coorX = coorX;
        this.coorY = coorY;
        this.taupe = new ImageButton(context);
        taupe.setBackgroundResource(R.mipmap.ic_launcher);
        taupe.setLayoutParams(new ViewGroup.LayoutParams(200,200));
        taupe.setX(coorX);
        taupe.setY(coorY);
        this.context = context;
        this.context.setView(taupe);
    }
}
