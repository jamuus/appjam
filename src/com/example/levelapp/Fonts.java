package com.example.levelapp;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class Fonts extends TextView
{
 
 public Fonts(Context context, AttributeSet attrs)
 {
 
  super(context, attrs);
 
  if (attrs != null)
  {
   // Get Custom Attribute Name and value
   TypedArray styledAttrs = context.obtainStyledAttributes(attrs, R.styleable.Fonts);
   int typefaceCode = styledAttrs.getInt(R.styleable.Fonts_fontStyle, -1);
   styledAttrs.recycle();
 
   // Typeface.createFromAsset doesn't work in the layout editor.
   // Skipping...
   if (isInEditMode())
   {
    return;
   }
 
   Typeface typeface = TypefaceCache.get(context.getAssets(), typefaceCode);
   setTypeface(typeface);
  }
 }
 
 public Fonts(Context context)
 {
  super(context);
 }
 
}