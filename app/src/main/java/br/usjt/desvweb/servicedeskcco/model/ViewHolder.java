package br.usjt.desvweb.servicedeskcco.model;

import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Filipe Roque on 21/04/18.
 */

public class ViewHolder {
    private TextView numero;
    private TextView datas;
    private TextView descricao;
    private ImageView imagem;

    public TextView getNumero() {
        return numero;
    }

    public TextView getDatas() {
        return datas;
    }

    public TextView getDescricao() {
        return descricao;
    }

    public ImageView getImagem() {
        return imagem;
    }

    public void setNumero(TextView numero) {
        this.numero = numero;
    }

    public void setDatas(TextView datas) {
        this.datas = datas;
    }

    public void setDescricao(TextView descricao) {
        this.descricao = descricao;
    }

    public void setImagem(ImageView imagem) {
        this.imagem = imagem;
    }
}
