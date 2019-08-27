package com.product.Utils;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.TextView;


class CommonFontTextView extends TextView {

    public CommonFontTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public CommonFontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CommonFontTextView(Context context) {
        super(context);
        init();
    }

    private void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "font/lato_black.ttf");
        setTypeface(tf, Typeface.BOLD);

    }

}