package matrial.aka.angercomics;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by geckozila on 17/06/16.
 */
public class RageComicDetails_Fragment extends Fragment {

// factory method to call the constructor
    public static RageComicDetails_Fragment newInstance () {
        return new RageComicDetails_Fragment();

    }

    // empty constructor
    public RageComicDetails_Fragment() {
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_rage_comics_details,container,false);
    }
}
