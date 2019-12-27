package br.com.blimas.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import br.com.blimas.cardview.R;
import br.com.blimas.cardview.adapter.PostagemAdapter;
import br.com.blimas.cardview.model.Postagem;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.card_postagem);

        //Define o layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        //Define o adapter
            //configura as postagens na view
            this.configuraPostagens();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void configuraPostagens() {
        Postagem postagem = new Postagem("Usuario XPTO", "Descrição ABCD", R.drawable.imagem1);
        this.postagens.add(postagem);

        postagem = new Postagem("Usuario XPTO", "Descrição ABCD", R.drawable.imagem2);
        this.postagens.add(postagem);

        postagem = new Postagem("Usuario XPTO", "Descrição ABCD", R.drawable.imagem3);
        this.postagens.add(postagem);

        postagem = new Postagem("Usuario XPTO", "Descrição ABCD", R.drawable.imagem4);
        this.postagens.add(postagem);

    }
}
