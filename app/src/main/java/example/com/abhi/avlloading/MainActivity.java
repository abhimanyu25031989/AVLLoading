package example.com.abhi.avlloading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wang.avi.AVLoadingIndicatorView;

public class MainActivity extends AppCompatActivity {

    private AVLoadingIndicatorView avLoadingIndicatorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        avLoadingIndicatorView = (AVLoadingIndicatorView) findViewById(R.id.loading);

        avLoadingIndicatorView.show();
    }
}
