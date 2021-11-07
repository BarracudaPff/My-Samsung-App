package com.samsung;

import android.view.View;
import android.widget.Toast;

public class MyOnClickListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Toast myToast = Toast.makeText(v.getContext(), "Button was clicked!", Toast.LENGTH_LONG);
        myToast.show();
        System.out.println("Clicked!");
    }
}
