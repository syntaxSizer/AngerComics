package matrial.aka.angercomics;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v4.app.Fragment;


/**
 * Created by geckozila on 17/06/16.
 */
public class RageComicDetails_Fragment extends Fragment {

    private static final String ARGUMENT_IMAGE_RES_ID = "imageResId";
    private static final String ARGUMENT_NAME = "name";
    private static final String ARGUMENT_DESCRIPTION = "description";
    private static final String ARGUMENT_URL = "url";

// factory method to call the constructor
    public static RageComicDetails_Fragment   newInstance(int imageResId, String name, String description, String url) {

        final Bundle args = new Bundle();
        args.putInt(ARGUMENT_IMAGE_RES_ID, imageResId);
        args.putString(ARGUMENT_NAME, name);
        args.putString(ARGUMENT_DESCRIPTION, description);
        args.putString(ARGUMENT_URL, url);
        final RageComicDetails_Fragment fragment = new RageComicDetails_Fragment();
        fragment.setArguments(args);
        return fragment;
    }


    // empty constructor
    public RageComicDetails_Fragment() {
    }
//
//
//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_rage_comics_details,container,false);

//    }
//}
@Nullable
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    final View view = inflater.inflate(R.layout.fragment_rage_comics_details, container, false);
    final ImageView imageView = (ImageView) view.findViewById(R.id.comic_image);
    final TextView nameTextView = (TextView) view.findViewById(R.id.name);
    final TextView descriptionTextView = (TextView) view.findViewById(R.id.description);

    final Bundle args = getArguments();
    imageView.setImageResource(args.getInt(ARGUMENT_IMAGE_RES_ID));
    nameTextView.setText(args.getString(ARGUMENT_NAME));
    final String text = String.format(getString(R.string.description_format), args.getString
            (ARGUMENT_DESCRIPTION), args.getString(ARGUMENT_URL));
    descriptionTextView.setText(text);
    return view;
}
}