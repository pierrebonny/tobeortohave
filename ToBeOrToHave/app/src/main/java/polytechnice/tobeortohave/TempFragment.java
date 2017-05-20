package polytechnice.tobeortohave;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Pierre on 16/05/2017.
 */

public class TempFragment extends Fragment {

    private TextView text;

    public static TempFragment newInstance(){
        TempFragment fragment = new TempFragment();
        Log.d("MainActivity","ok");
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.points,container,false);
        rootView.setBackgroundColor(Color.parseColor("#6495E1"));
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle bundle){
        super.onActivityCreated(bundle);
        text = (TextView)getView().findViewById(R.id.textTemp);
        text.setTextColor(Color.parseColor("#F8FFFF"));
    }
}
