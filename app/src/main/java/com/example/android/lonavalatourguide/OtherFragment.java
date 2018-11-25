package com.example.android.lonavalatourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class OtherFragment extends Fragment {

    public OtherFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> other = new ArrayList<Place>();
        other.add(new Place(getActivity().getString(R.string.imagica),
                R.drawable.imagica_lonavala));
        other.add(new Place(getActivity().getString(R.string.tiger_point),
                R.drawable.lonawala_tiger_point));
        other.add(new Place(getActivity().getString(R.string.aamby_valley),
                R.drawable.aamby_valley_lonavala));
        other.add(new Place(getActivity().getString(R.string.rajmachi),
                R.drawable.rajmachi));
        other.add(new Place(getActivity().getString(R.string.ekvira_temple),
                R.drawable.ekvira_devi_temple_lonavala));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), other, R.color.category_other);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);


        return rootView;

    }
    @Override
    public void onStop () {
        super.onStop();
    }


}
