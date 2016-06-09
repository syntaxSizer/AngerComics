package matrial.aka.angercomics;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by geckozila on 04/06/16.
 */
public class Fragmentne extends Fragment {

    private int [] mImageResId;
    private String[] mName;
    private String[] mDescription;
    private String[] mUrl;

    public static Fragmentne newInstace(){
        return new Fragmentne();
    }
    // empty constructor
    public Fragmentne(){

    }

    class FragmentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

        private LayoutInflater mLayoutInflater;

        public FragmentAdapter(Context contect){
            mLayoutInflater = LayoutInflater.from(contect);
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new ViewHolder(mLayoutInflater.inflate(R.layout.recycler_item_rage_comic,parent,false));


        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
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
        class ViewHolder extends RecyclerView.ViewHolder{

            public ViewHolder(View inflate) {
                super(inflate);
            }
        }
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false);

    }


}


