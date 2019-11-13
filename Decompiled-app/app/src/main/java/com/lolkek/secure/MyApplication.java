package com.lolkek.secure;

import android.app.Application;
import android.util.Log;
import lanchon.dexpatcher.annotation.DexAdd;
import lanchon.dexpatcher.annotation.DexAppend;
import lanchon.dexpatcher.annotation.DexEdit;
import lanchon.dexpatcher.annotation.DexIgnore;

@DexEdit(contentOnly = true)
public class MyApplication extends Application {
  @DexAppend
  @Override
  public void onCreate() {
    Log.e("HAHAHA","YOU'VE BEEN HACKED!");
  }
}
