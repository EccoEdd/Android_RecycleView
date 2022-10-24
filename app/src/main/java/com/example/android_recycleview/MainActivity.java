package com.example.android_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.android_recycleview.adaptador.PersonaAdaptador;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Persona> personas = new ArrayList<Persona>();

        personas.add(new Persona("Eduardo", "tel:9842393470"));
        personas.add(new Persona("Denji", "tel:9087654321"));
        personas.add(new Persona("Kobeni Hagashiyama", "tel:9876543210"));


        PersonaAdaptador personaAdaptador = new PersonaAdaptador(personas);
        RecyclerView re = (RecyclerView) findViewById(R.id.recicle1);

        re.setAdapter(personaAdaptador);

    }
}