package android.demo.com.testcheckboxes;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
        layout.setOrientation(LinearLayout.VERTICAL);
        for(int i=0; i< 10; i++) {
            CheckBox checkbox = new CheckBox(this);
            checkbox.setText("test" + i);
            layout.addView(checkbox);


        }
    }
}
