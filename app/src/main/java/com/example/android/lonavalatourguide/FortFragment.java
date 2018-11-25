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
public class FortFragment extends Fragment {


    public FortFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Add Family mapping through Place object
        final ArrayList<Place> fort = new ArrayList<Place>();
        fort.add(new Place(getActivity().getString(R.string.rajmachi_fort),
                R.drawable.rajmachi_fort_lonavala));
        fort.add(new Place(getActivity().getString(R.string.lohagad_fort),
                R.drawable.lohagad_fort_lonavala));
        fort.add(new Place(getActivity().getString(R.string.visapur_fort),
                R.drawable.visapur_fort_lonavala));

        PlaceAdapter familyAdapter = new PlaceAdapter(getActivity(), fort, R.color.category_fort);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(familyAdapter);


        return rootView;
    }
    @Override
    public void onStop () {
        super.onStop();
    }


}
