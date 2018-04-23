package br.usjt.desvweb.servicedeskcco.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.IOException;
import java.util.ArrayList;

import br.usjt.desvweb.servicedeskcco.R;
import br.usjt.desvweb.servicedeskcco.model.Chamado;
import br.usjt.desvweb.servicedeskcco.model.ChamadoAdapter;
import br.usjt.desvweb.servicedeskcco.model.ChamadoNetwork;

public class ListarChamadosActivity extends Activity {
    public static final String CHAMADO = "br.usjt.desvweb.servicedeskcco";
    ArrayList<Chamado> chamados;
    ListView listView;
    Activity contexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_chamados);
        Intent intent = getIntent();
        chamados = (ArrayList<Chamado>) intent.getSerializableExtra(MainActivity.CHAMADOS);

        listView = findViewById(R.id.lista_chamados);
        ChamadoAdapter adapter = new ChamadoAdapter(this, chamados);
        listView.setAdapter(adapter);

        contexto = this;
        listView.setOnItemClickListener(
            new AdapterView.OnItemClickListener(){

                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    Chamado chamado = chamados.get(position);
                    Intent intent = new Intent(contexto, DetalheChamadoActivity.class);
                    intent.putExtra(CHAMADO, chamado);
                    startActivity(intent);
                }
            }
        );
    }
}
