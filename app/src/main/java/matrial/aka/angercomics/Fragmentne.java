package matrial.aka.angercomics;

import android.app.Fragment;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
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

@Override
public void onAttach (Context context)
{
    super.onAttach(context);
    // get rage face name and descriptions

    final Resources resources = context.getResources();
    mName = resources.getStringArray(R.array.names);
    mDescription = resources.getStringArray(R.array.descriptions);
    mUrl = resources.getStringArray(R.array.urls);


    // get rage face image

    final TypedArray typedarray =resources.obtainTypedArray(R.array.image);
    final int imageCount = mName.length;
    mImageResId = new int[imageCount];
    for (int i =0; i< imageCount ; i++){
        mImageResId[i]=typedarray.getResourceId(i,0);
    }
    typedarray.recycle();

}
// creating the fragment
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }









    class RageComicAdapter extends RecyclerView.Adapter<ViewHolder> {

        private LayoutInflater mLayoutInflater;

        public RageComicAdapter(Context contect) {
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
            //views
            private ImageView mimageview;
            private TextView mNameTextview;

            private ViewHolder(View itemView) {
                super(itemView);
                //get reference to  image and name
                mimageview = (ImageView) itemView.findViewById(R.id.comic_image);
                mNameTextview = (TextView) itemView.findViewById(R.id.name);

            }

            private void setData(int imageResId, String name) {
                mimageview.setImageResource(imageResId);
                mNameTextview.setText(name);

        }
    }
}