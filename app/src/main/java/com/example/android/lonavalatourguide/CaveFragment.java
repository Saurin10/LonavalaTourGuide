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
public class CaveFragment extends Fragment {

    public CaveFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Add words mapping through Place object
        final ArrayList<Place> caves = new ArrayList<Place>();
        caves.add(new Place(getActivity().getString(R.string.karla_caves),
                R.drawable.karlacaves_lonavala));
        caves.add(new Place(getActivity().getString(R.string.bhaja_cave),
                R.drawable.bhaja_caves_lonavala));


        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), caves, R.color.category_cave);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);


        return rootView;
    }

    @Override
    public void onStop () {
        super.onStop();
    }


}
