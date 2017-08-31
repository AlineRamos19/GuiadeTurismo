package com.example.android.guiadeturismo;

public class Local {

    private String mNomeLocal;
    private String mDescricaoLocal;
    private int mImagem = SEM_IMAGEM;
    private static final int SEM_IMAGEM = -1;

    public Local(String nomeLocal, String descricaoLocal) {
        mNomeLocal = nomeLocal;
        mDescricaoLocal = descricaoLocal;
    }

    public Local(String nomeLocal, String descricaoLocal, int imagem) {
        mNomeLocal = nomeLocal;
        mDescricaoLocal = descricaoLocal;
        mImagem = imagem;
    }

    public String getNomeLocal() {
        return mNomeLocal;
    }

    public String getDescricaoLocal() {
        return mDescricaoLocal;
    }

    public int getImagem() {
        return mImagem;
    }

    public boolean temImagem() {
        return mImagem != SEM_IMAGEM;
    }

    @Override
    public String toString() {
        return "Local: " +
                "Nome do lugar: " + mNomeLocal + "\n" +
                "Descrição do lugar: " + mDescricaoLocal +
                "Imagem: " + mImagem;
    }
}
