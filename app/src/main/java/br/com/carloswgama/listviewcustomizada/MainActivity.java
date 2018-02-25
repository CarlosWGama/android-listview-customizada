package br.com.carloswgama.listviewcustomizada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import br.com.carloswgama.listviewcustomizada.models.Produto;
import br.com.carloswgama.listviewcustomizada.utils.ProdutoAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ArrayAdapaterde Produtos
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        produtos.add(new Produto(R.drawable.playstation, "PlayStation", 1500));
        produtos.add(new Produto(R.drawable.pendriver, "Pendriver", 25.50));
        ProdutoAdapter adapter = new ProdutoAdapter(this, produtos);

        //Lista
        ListView lista = findViewById(R.id.lv_customizada);
        lista.setAdapter(adapter);

    }

}
