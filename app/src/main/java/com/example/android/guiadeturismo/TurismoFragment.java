package com.example.android.guiadeturismo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;


public class TurismoFragment extends Fragment {

    View rootView;

    public TurismoFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.lista, container, false);


        ArrayList<Local> listaLugares = new ArrayList<Local>(Arrays.asList(

                new Local(getResources().getString(R.string.titulo_turismo_um),
                        getResources().getString(R.string.descricao_turismo_um)),

                new Local(getResources().getString(R.string.titulo_turismo_dois),
                        getResources().getString(R.string.descricao_turismo_dois)),

                new Local(getResources().getString(R.string.titulo_turismo_tres),
                        getResources().getString(R.string.descricao_turismo_tres)),

                new Local(getResources().getString(R.string.titulo_turismo_quatro),
                        getResources().getString(R.string.descricao_turismo_quatro)),

                new Local(getResources().getString(R.string.titulo_turismo_cinco),
                        getResources().getString(R.string.descricao_turismo_cinco))));


        ListaAdapter adapter = new ListaAdapter(getActivity(), listaLugares);
        ListView listView = (ListView) rootView.findViewById(R.id.lista);
        listView.setAdapter(adapter);

        return rootView;

    }
}
