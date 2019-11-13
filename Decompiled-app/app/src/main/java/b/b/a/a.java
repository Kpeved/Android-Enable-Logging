package b.b.a;

import android.util.Log;
import lanchon.dexpatcher.annotation.DexEdit;
import lanchon.dexpatcher.annotation.DexReplace;

@DexEdit(contentOnly = true)
public class a {
  @DexReplace
  public void a(int priority, String tag, String message, Throwable throwable) {
    Log.e("HACKED", message);
  }
}
