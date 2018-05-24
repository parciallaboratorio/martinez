package ar.edu.utn.fra.lab5.a1erparcial;

import android.content.ClipData;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by lkdml on 03/10/2017.
 */


public class Adapter extends RecyclerView.Adapter<ViewHolder>{
    LayoutInflater mLInflater;
    List<Modelo> contactos;
    ItemClickListener listener;

    public Adapter(Context context, List<Modelo> modelo, ItemClickListener listener) {
        this.mLInflater = LayoutInflater.from(context);
        this.contactos = modelo;
        //TODO: Crear Interface ItemClickListener
        this.listener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //TODO: completar lo que falta
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.holder,parent,false);
        ViewHolder vh = new ViewHolder(v,this.listener);
        v.setOnClickListener(vh);
        return vh;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //TODO: completar lo que falta
        Modelo m = this.contactos.get(position);
        holder.apellido.setText(m.getApellido());
        holder.nombre.setText(m.getNombre());
        holder.telefono.setText(m.getTelefono());
    }

    @Override
    public int getItemCount() {
        return this.contactos.size();
        //TODO: completar lo que falta
    }


}
