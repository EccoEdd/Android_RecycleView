package com.example.android_recycleview.adaptador;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_recycleview.MainActivity;
import com.example.android_recycleview.Persona;
import com.example.android_recycleview.R;

import java.util.List;

public class PersonaAdaptador extends RecyclerView.Adapter<PersonaAdaptador.viewHolder> {

    List<Persona> lp;

    public PersonaAdaptador(List<Persona> lp) {
        this.lp = lp;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new viewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.setData(lp.get(position));
    }

    @Override
    public int getItemCount() {
        return lp.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView txtNombre;
        TextView txtContacto;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            txtNombre = itemView.findViewById(R.id.Contacto);
            txtContacto = itemView.findViewById(R.id.Numero);

            txtContacto.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent llamada = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+txtContacto.getText()));
                    view.getContext().startActivity(llamada);
                }
            });
        }

        public void setData(Persona p){
            txtNombre.setText(p.getNombre());
            txtContacto.setText(p.getTelefono());
        }
    }
}
