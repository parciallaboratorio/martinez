package ar.edu.utn.fra.lab5.a1erparcial;

import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lkdml on 03/10/2017.
 */

public class VistaControlador {
    //TODO: Traer del Main lo necesario para usar MVC

    RecyclerView rv;
    ImageView imgContacto;
    TextView main_nombre;
    TextView main_telefono;
    Button btn_llamar;


    public VistaControlador(MainActivity actv)
    {
        imgContacto= (ImageView) actv.findViewById(R.id.vh_img);
        main_nombre = (TextView) actv.findViewById(R.id.main_nombre);
        main_telefono = (TextView) actv.findViewById(R.id.main_telefono);

        rv = (RecyclerView)actv.findViewById(R.id.rv1);

        btn_llamar = (Button) actv.findViewById(R.id.btn_llamar);
        btn_llamar.setOnClickListener((MainActivity)actv);

    }
}
