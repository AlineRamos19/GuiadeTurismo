package com.example.android.guiadeturismo;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class CidadeFragment extends Fragment {

    View rootView;

    public CidadeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_cidade, container, false);

        TextView comoChegar = (TextView) rootView.findViewById(R.id.cliqueAqui_txt);

        comoChegar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri localIntentUri = Uri.parse("geo:-23.5248,-46.187123?z=15");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, localIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");

                if (mapIntent.resolveActivity(getActivity().getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }

        });

        return rootView;
    }


}
