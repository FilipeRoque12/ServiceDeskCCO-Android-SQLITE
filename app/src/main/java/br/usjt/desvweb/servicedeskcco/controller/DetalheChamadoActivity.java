package br.usjt.desvweb.servicedeskcco.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import br.usjt.desvweb.servicedeskcco.R;
import br.usjt.desvweb.servicedeskcco.model.Chamado;
import br.usjt.desvweb.servicedeskcco.model.Fila;

public class DetalheChamadoActivity extends Activity {
    TextView txtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_chamado);
        Intent intent = getIntent();
        Chamado chamado = (Chamado)intent.getSerializableExtra(ListarChamadosActivity.CHAMADO);
        ImageView foto = (ImageView) findViewById(R.id.foto_fila_detalhe);
        try {
            foto.setImageBitmap(MainActivity._filas.get(Fila.getFila(MainActivity._filas,
                    chamado.getFila().getId())).getImagem());
        } catch (Exception e){
            foto.setImageDrawable(getDrawable(R.drawable.ic_not_found));
        }
        TextView fila = (TextView)findViewById(R.id.valor_fila);
        fila.setText(chamado.getFila().getNome());
        TextView numero = (TextView)findViewById(R.id.valor_numero);
        numero.setText(""+chamado.getNumero());
        TextView status = (TextView)findViewById(R.id.valor_status);
        status.setText(""+chamado.getStatus());
        DateFormat formatter = new SimpleDateFormat(Chamado.DATE_PATTERN);
        TextView abertura = (TextView)findViewById(R.id.valor_abertura);
        abertura.setText(formatter.format(chamado.getDataAbertura()));
        TextView fechamento = (TextView)findViewById(R.id.valor_fechamento);
        fechamento.setText(chamado.getDataFechamento() == null?" ":
                formatter.format(chamado.getDataFechamento()));
        TextView descricao = (TextView)findViewById(R.id.valor_descricao);
        descricao.setText(""+chamado.getDescricao());
    }
}
