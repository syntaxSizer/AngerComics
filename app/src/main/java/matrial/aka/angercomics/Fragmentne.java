package matrial.aka.angercomics;

import android.app.Fragment;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by geckozila on 04/06/16.
 */
public class Fragmentne extends Fragment {

    private int[] mImageResId;
    private String[] mName;
    private String[] mDescription;
    private String[] mUrl;

    public static Fragmentne newInstace() {
        return new Fragmentne();
    }

    // empty constructor
    public Fragmentne() {

    }

    class FragmentAdapter extends RecyclerView.Adapter<ViewHolder> {

        private LayoutInflater mLayoutInflater;

        public FragmentAdapter(Context contect) {
            mLayoutInflater = LayoutInflater.from(contect);
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new ViewHolder(mLayoutInflater.inflate(R.layout.recycler_item_rage_comic, parent, false));


        }

        @Override
        public void onBindViewHolder(ViewHolder holder, final int position) {
            final int imageResId = mImageResId[position];
            final String name = mName[position];
            final String descriptions = mDescription[position];
            final String url = mUrl[position];
            holder.setData(imageResId, name);
        }

        @Override
        public int getItemCount() {
            return mName.length;
        }
    }
        class ViewHolder extends RecyclerView.ViewHolder {


            private ImageView mimageview;
            private TextView mNameTextview;

            public ViewHolder(View itemview) {
                super(itemview);
                //get reference to  image and name
                mimageview = (ImageView) itemview.findViewById(R.id.comic_image);
                mNameTextview = (TextView) itemview.findViewById(R.id.name);

            }

            private void setData(int imageResId, String name) {
                mimageview.setImageResource(imageResId);
                mNameTextview.setText(name);

        }
    }
}