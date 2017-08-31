package com.example.android.guiadeturismo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class LazerFragment extends Fragment {

    View rootView;

    public LazerFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.lista, container, false);

        ArrayList<Local> listaLugares = new ArrayList<Local>(Arrays.asList(

                new Local(getResources().getString(R.string.titulo_lazer_um),
                        getResources().getString(R.string.descricao_lazer_um)),

                new Local(getResources().getString(R.string.titulo_lazer_dois),
                        getResources().getString(R.string.descricao_lazer_dois)),

                new Local(getResources().getString(R.string.titulo_lazer_tres),
                        getResources().getString(R.string.descricao_lazer_tres)),

                new Local(getResources().getString(R.string.titulo_lazer_quatro),
                        getResources().getString(R.string.descricao_lazer_quatro))));


        ListaAdapter adapter = new ListaAdapter(getActivity(), listaLugares);
        ListView listView = (ListView) rootView.findViewById(R.id.lista);
        listView.setAdapter(adapter);

        return rootView;
    }

}
