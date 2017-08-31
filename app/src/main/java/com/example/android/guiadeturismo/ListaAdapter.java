package com.example.android.guiadeturismo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class ListaAdapter extends ArrayAdapter<Local> {

    public ListaAdapter(Context contexto, ArrayList<Local> listaLugares) {
        super(contexto, 0, listaLugares);
    }

    @Override
    public View getView(int posicao, View converteVisualizacao, ViewGroup parente) {

        if (converteVisualizacao == null) {
            converteVisualizacao = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parente, false);
        }

        Local listaLugares = getItem(posicao);

        TextView tituloLocal = (TextView) converteVisualizacao.findViewById(R.id.titulo_lugar_cidade);
        tituloLocal.setText(listaLugares.getNomeLocal());

        TextView descricaoLocal = (TextView) converteVisualizacao.findViewById(R.id.txt_descricao_lugar);
        descricaoLocal.setText(listaLugares.getDescricaoLocal());

        ImageView imageView = (ImageView) converteVisualizacao.findViewById(R.id.image);

        if (listaLugares.temImagem()) {
            imageView.setImageResource(listaLugares.getImagem());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return converteVisualizacao;
    }
}




