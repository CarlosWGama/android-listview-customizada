package br.com.carloswgama.listviewcustomizada.utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

import br.com.carloswgama.listviewcustomizada.R;
import br.com.carloswgama.listviewcustomizada.models.Produto;

public class ProdutoAdapter extends ArrayAdapter {

    private ArrayList<Produto> produtos;
    private Context c;

    public ProdutoAdapter(Context c, ArrayList<Produto> produtos) {
        super(c, 0, produtos);
        this.produtos = produtos;
        this.c = c;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v;
        if (convertView == null) { //Chamado pela primeira vez
            LayoutInflater inflater = LayoutInflater.from(c);
            v = inflater.inflate(R.layout.minha_listview_compras, parent, false);
        } else //Já foi inserido outros itens na ListView
            v = convertView;

        Produto produto = this.produtos.get(position);
        //Imagem
        ImageView fotoIV = v.findViewById(R.id.iv_foto_listview);
        fotoIV.setImageResource(produto.getFoto());
        //Produto
        TextView produtoTV = v.findViewById(R.id.tv_produto_listview);
        produtoTV.setText(produto.getProduto());
        //Preco
        //Produto
        TextView precoTV = v.findViewById(R.id.tv_preco_listview);
        precoTV.setText(String.format("R$ %4.2f", produto.getPreco()));

        return v;
    }
}
