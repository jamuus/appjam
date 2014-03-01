package com.example.levelapp;

import java.util.Hashtable;

import android.content.res.AssetManager;
import android.graphics.Typeface;


public class TypefaceCache {
 
 private static final Hashtable<String, Typeface> CACHE = new Hashtable<String, Typeface>();
 
 private static final String StrangeMIX = "fonts/strangelove-next-mix.otf";
 private static final String StrangeNARROW = "fonts/strangelove-next-narrow.otf";
 private static final String StrangeWIDE = "fonts/strangelove-next-wide.otf";
 
 public static Typeface get(AssetManager manager, int typefaceCode) {
  synchronized (CACHE) {
 
   String typefaceName = getTypefaceName(typefaceCode);
 
   if (!CACHE.containsKey(typefaceName)) {
    Typeface t = Typeface.createFromAsset(manager, typefaceName);
    CACHE.put(typefaceName, t);
   }
   return CACHE.get(typefaceName);
  }
 }
 
 private static String getTypefaceName(int typefaceCode) {
  switch (typefaceCode) {
  case 0:
   return StrangeMIX;
 
  case 1:
   return StrangeNARROW;
 
  case 2:
   return StrangeWIDE;
 
  default:
   return null;
  }
 }
 
}