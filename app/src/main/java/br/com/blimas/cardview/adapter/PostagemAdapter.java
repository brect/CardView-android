package br.com.blimas.cardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.blimas.cardview.R;
import br.com.blimas.cardview.model.Postagem;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {

    private List<Postagem> postagens;

    public PostagemAdapter(List<Postagem> listaPostagens) {
        this.postagens = listaPostagens;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listaPostagem = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_card_postagem, parent, false);

        return new MyViewHolder(listaPostagem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Postagem postagem = postagens.get(position);

        holder.nomeUsuario.setText(postagem.getNomeUsuario());
        holder.descricaoPostagem.setText(postagem.getDescricaoPostagem());
        holder.imagemPostada.setImageResource(postagem.getImagemPostagem());

    }

    @Override
    public int getItemCount() {
        return postagens.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView nomeUsuario;
        private TextView descricaoPostagem;
        private ImageView imagemPostada;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nomeUsuario = itemView.findViewById(R.id.texto_usuario_adapter);
            descricaoPostagem = itemView.findViewById(R.id.descricao_postagem_adapter);
            imagemPostada = itemView.findViewById(R.id.imagem_postagem_adapter);
        }
    }

}
