package matrial.aka.angercomics;

import android.app.Fragment;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * Created by geckozila on 04/06/16.
 */
public class RageComicListFragment extends Fragment {
    private int[] mImageResdIds;
    private String [] mName;
    private String[] descriptions;
    private String [] mUrl;


    public static RageComicListFragment newInstance(){
        return new RageComicListFragment();
    }
    class RageComicAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{


        private LayoutInflater mLayoutInflater;

        public RageComicAdapter(Context context ){
            mLayoutInflater=LayoutInflater.from(context);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }
}
