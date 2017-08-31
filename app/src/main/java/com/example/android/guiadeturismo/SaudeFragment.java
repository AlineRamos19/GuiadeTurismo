package com.example.android.guiadeturismo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class SaudeFragment extends Fragment {

    View rootView;

    public SaudeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.lista, container, false);

        ArrayList<Local> listaLugares = new ArrayList<Local>(Arrays.asList(

                new Local(getResources().getString(R.string.titulo_saude_um),
                        getResources().getString(R.string.descricao_saude_um)),

                new Local(getResources().getString(R.string.titulo_saude_dois),
                        getResources().getString(R.string.descricao_saude_dois)),

                new Local(getResources().getString(R.string.titulo_saude_tres),
                        getResources().getString(R.string.descricao_saude_tres)),

                new Local(getResources().getString(R.string.titulo_saude_quatro),
                        getResources().getString(R.string.descricao_saude_quatro)),

                new Local(getResources().getString(R.string.titulo_saude_cinco),
                        getResources().getString(R.string.descricao_saude_cinco))));


        ListaAdapter adapter = new ListaAdapter(getActivity(), listaLugares);
        ListView listView = (ListView) rootView.findViewById(R.id.lista);
        listView.setAdapter(adapter);

        return rootView;
    }

}
