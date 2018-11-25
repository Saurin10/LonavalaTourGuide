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
public class LakeFragment extends Fragment {


    public LakeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Add words mapping through Place object
        final ArrayList<Place> lake = new ArrayList<Place>();
        lake.add(new Place(getActivity().getString(R.string.pawana_lake),
                R.drawable.lonavala_pawna_lake));
        lake.add(new Place(getActivity().getString(R.string.tungarli_lake),
                R.drawable.tungarli_lake_lonavala));
        lake.add(new Place(getActivity().getString(R.string.bushi_dam),
                R.drawable.bhushi_dam_lonavala));
        lake.add(new Place(getActivity().getString(R.string.valvan_dam),
                R.drawable.valvan_dam_lonavala));


        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), lake, R.color.category_lake);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        return rootView;
    }
    @Override
    public void onStop () {
        super.onStop();
    }


}
