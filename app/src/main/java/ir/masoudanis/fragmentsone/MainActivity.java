package ir.masoudanis.fragmentsone;

import android.support.annotation.AnimRes;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.annotation.StyleRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    Button fragmentButtonOne, fragmentButtonTwo;
    FragmentManager fm = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentButtonOne = (Button) findViewById(R.id.fragment_one_button);
        fragmentButtonTwo = (Button) findViewById(R.id.fragment_Two_button);
    }

    public void fragmentButtonOneCl(View v){
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame_layout_view, new  FragmentClassOne() );
        ft.commit();
    }

    public void fragmentButtonTwoCl(View v){
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame_layout_view, new FragmentClassTwo() );
        ft.commit();
    }
}
