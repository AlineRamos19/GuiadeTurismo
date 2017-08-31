package com.example.android.guiadeturismo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;


public class AlimentacaoFragment extends Fragment {

    View rootView;

    public AlimentacaoFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.lista, container, false);

        ArrayList<Local> listaLugares = new ArrayList<Local>(Arrays.asList(

                new Local(getResources().getString(R.string.titulo_alimentacao_um),
                        getResources().getString(R.string.descricao_alimentacao_um), R.drawable.hamburger),

                new Local(getResources().getString(R.string.titulo_alimentacao_dois),
                        getResources().getString(R.string.descricao_alimentacao_dois), R.drawable.sushi),

                new Local(getResources().getString(R.string.titulo_alimentacao_tres),
                        getResources().getString(R.string.descricao_alimentacao_tres), R.drawable.dish),

                new Local(getResources().getString(R.string.titulo_alimentacao_quatro),
                        getResources().getString(R.string.descricao_alimentacao_quatro), R.drawable.fish),

                new Local(getResources().getString(R.string.titulo_alimentacao_cinco),
                        getResources().getString(R.string.descricao_alimentacao_cinco), R.drawable.dinner),

                new Local(getResources().getString(R.string.titulo_alimentacao_seis),
                        getResources().getString(R.string.descricao_alimentacao_seis), R.drawable.pizza)));

        ListaAdapter adapter = new ListaAdapter(getActivity(), listaLugares);
        ListView listView = (ListView) rootView.findViewById(R.id.lista);
        listView.setAdapter(adapter);

        return rootView;
    }

}
