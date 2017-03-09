package academiasmoviles.com.layouts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLinearLayout;
    Button btnFrameLayout;
    Button btnRelativeLayout;
    Button btnTableLayout;
    Button btnGridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencias
        btnLinearLayout = (Button) findViewById(R.id.btnLinearLayout);
        btnLinearLayout.setOnClickListener(this);

        btnFrameLayout = (Button) findViewById(R.id.btnFrameLayout);
        btnFrameLayout.setOnClickListener(this);

        btnRelativeLayout = (Button) findViewById(R.id.btnRelativeLayout);
        btnRelativeLayout.setOnClickListener(this);

        btnTableLayout = (Button) findViewById(R.id.btnTableLayout);
        btnTableLayout.setOnClickListener(this);

        btnGridLayout = (Button) findViewById(R.id.btnGridLayout);
        btnGridLayout.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        Intent intent = null;

        switch (view.getId()) {
            case R.id.btnLinearLayout:
                intent = new Intent(getApplicationContext(), LinearLayoutActivity.class);
                break;
        }

        if(null != intent) {
            startActivity(intent);
        }

    }
}
