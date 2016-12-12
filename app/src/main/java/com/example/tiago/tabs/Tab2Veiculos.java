package com.example.tiago.tabs;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;


/**
 * Created by Tiago on 07/12/16.
 */


public class Tab2Veiculos extends Fragment {

    EditText marca, modelo, matricula;
    FloatingActionButton fab2;
    DatabaseHandler db;
    SharedPreferences sharedpreferences;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab2veiculos, container, false);


    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        marca = (EditText) getActivity().findViewById(R.id.etmarca);
        modelo = (EditText) getActivity().findViewById(R.id.etmodelo);
        matricula = (EditText) getActivity().findViewById(R.id.etmatricula);
        final FloatingActionButton fab2 = (FloatingActionButton) getActivity().findViewById(R.id.fab2);
            fab2.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                  /*  String etmarca = marca.getText().toString();
                    String etmodelo = modelo.getText().toString();
                    String etmatricula = matricula.getText().toString();
                    SharedPreferences.Editor editor = sharedpreferences.edit();
                    editor.apply();

                    db = new DatabaseHandler(Tab2Veiculos.this, null, null);
                    Veiculosdata vei = new Veiculosdata();

                    vei.setMarca(etmarca);
                    vei.setModelo(etmodelo);
                    vei.setMatricula(etmatricula);
                    db.addveiculos(vei);*/
                    Snackbar.make(view, "Registado", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
            });

    }



}
