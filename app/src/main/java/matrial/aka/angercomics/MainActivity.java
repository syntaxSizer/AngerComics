package matrial.aka.angercomics;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity
        implements Fragmentne.OnRageComicSelected {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // the if block to check the state of the activity , if it has savedInstance
        // that apply to the fragment too , if you don't put the if block
        // you will end up adding fragment on top of each other for instance
        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.root_layout, Fragmentne.newInstace(), "rageComicList")
                    .commit();
        }
    }

    @Override
    public void onRageComicSelected(int imageResId, String name, String description, String url) {
        final RageComicDetails_Fragment detailsFragment =
                RageComicDetails_Fragment.newInstance(imageResId, name, description, url);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.root_layout, detailsFragment, "rageComicDetails")
                .addToBackStack(null)
                .commit();
    }
}