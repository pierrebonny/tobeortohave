package polytechnice.tobeortohave;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.SwitchPreference;
import android.support.v4.app.Fragment;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.support.v7.preference.SwitchPreferenceCompat;
import android.support.v7.widget.SwitchCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by Pierre on 09/05/2017.
 */
public class PointsFragment extends PreferenceFragmentCompat {
    private SwitchPreference switch1;
    private SwitchPreference switch2;
    private SwitchPreference switch3;
    private static RepeatAction action;
    private TextView title;

    public static PointsFragment newInstance(RepeatAction repeatAction){
        PointsFragment fragment = new PointsFragment();
        action = repeatAction;
        return fragment;
    }

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.preferences);

    }

    /*@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.points_layout, container, false);
        rootView.setBackgroundColor(Color.parseColor("#6495E1"));
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle bundle){
        super.onActivityCreated(bundle);
        switch1 = (SwitchCompat) getView().findViewById(R.id.switch1);
        switch2 = (SwitchCompat) getView().findViewById(R.id.switch2);
        switch3 = (SwitchCompat) getView().findViewById(R.id.switch3);
        title = (TextView)getView().findViewById(R.id.pointsTitle);
        title.setText("Mes préférences");
        title.setTextColor(Color.parseColor("#F8FFFF"));
        title.setTypeface(null, Typeface.BOLD);
        title.setTextSize(30);
        title.setPadding(150,0,150,0);
        SharedPreferences prefs = getActivity().getSharedPreferences("com.mobileapp.smartapplocker", MODE_PRIVATE);
        if(prefs.contains("switch1")){
            switch1.setChecked(prefs.getBoolean("switch1",false));
            switch2.setChecked(prefs.getBoolean("switch2",false));
            switch3.setChecked(prefs.getBoolean("switch3",false));
            setSwitch();
        }
        else {
            switch1.setChecked(true);
            switch2.setChecked(true);
            switch3.setChecked(true);
            setSwitch();
        }
    }

    private void setSwitch(){
        switch1.setText("Je souhaite être notifié lorsque des soldes sont en cours");
        switch1.setTextColor(Color.parseColor("#F8FFFF"));
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                SharedPreferences.Editor editor = getActivity().getSharedPreferences("com.mobileapp.smartapplocker", MODE_PRIVATE).edit();
                editor.remove("switch1");
                editor.putBoolean("switch1",switch1.isChecked());
                editor.commit();
                SharedPreferences prefs = getActivity().getSharedPreferences("com.mobileapp.smartapplocker", MODE_PRIVATE);
                if(!prefs.getBoolean("switch1",false)){
                    action.cancel(0);
                }
                else {
                    action.schedule(0);
                }
            }
        });
        switch2.setText("Je souhaite être notifié lorsque des ventes privées sont en cours");
        switch2.setTextColor(Color.parseColor("#F8FFFF"));
        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                SharedPreferences.Editor editor = getActivity().getSharedPreferences("com.mobileapp.smartapplocker", MODE_PRIVATE).edit();
                editor.remove("switch2");
                editor.putBoolean("switch2",switch2.isChecked());
                editor.commit();
                SharedPreferences prefs = getActivity().getSharedPreferences("com.mobileapp.smartapplocker", MODE_PRIVATE);
                if(!prefs.getBoolean("switch2",false)){
                    action.cancel(1);
                }
                else {
                    action.schedule(1);
                }
            }
        });
        switch3.setText("Je souhaite être notifié lorsqu'un grand jeu est en cours");
        switch3.setTextColor(Color.parseColor("#F8FFFF"));
        switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                SharedPreferences.Editor editor = getActivity().getSharedPreferences("com.mobileapp.smartapplocker", MODE_PRIVATE).edit();
                editor.remove("switch3");
                editor.putBoolean("switch3",switch3.isChecked());
                editor.commit();
                SharedPreferences prefs = getActivity().getSharedPreferences("com.mobileapp.smartapplocker", MODE_PRIVATE);
                if(!prefs.getBoolean("switch3",false)){
                    action.cancel(2);
                }
                else {
                    action.schedule(2);
                }
            }
        });
    }*/
}
