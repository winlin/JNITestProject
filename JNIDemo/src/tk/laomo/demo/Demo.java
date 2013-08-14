package tk.laomo.demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import tk.laomo.demo.jni.SquaredWrapper;
import android.widget.TextView;

public class Demo extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
	TextView one = (TextView)this.findViewById(R.id.textview_one);
	SquaredWrapper sw = new SquaredWrapper();
	int b = 3;
	int a = sw.squared(b);
	one.setText(""+a);
	Log.i("JNIDemo", String.format("%d -> %d", b, a));
    }
}

