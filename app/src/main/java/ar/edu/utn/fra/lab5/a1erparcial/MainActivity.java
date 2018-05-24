package ar.edu.utn.fra.lab5.a1erparcial;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListener, View.OnClickListener{

    /*TODO:
    * 1.- Completar lo necesario para que compile
    *   a.- Strings.xml
    *   b.- Crear menu.xml
    *   c.- crear Interface
    * 2.- Adaptar codigo usando MVC (mover lo que no debe estar en MainActivity)
    * 3.- Completar metodos OnCreate y OnBind del Adapter
    * 4.- Menu
    *   a.- Completar opciones del menu "opcion a" y "salir"
    *   b.- Dar funcionalidad a los botones
    * 5.- Usar Intent para llamar por telefono.
    * 6.- Uso de GIT:
    *   a.- Bajar y subir cambios de/a github
    *   b.- realizar al menos 1 commit con la leyenda "entrega 1er Parcial, Alumno: Nombre y Apellido
    */


    //TODO: Limpiar MainActivity, pasando lo necesario a las clases Controlador y VistaControlador para usar MVC
    Adapter adaptador;
   // List<Modelo> contactos;
    VistaControlador vc;
    Controlador control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vc = new VistaControlador(this);
        control = new Controlador(vc);

        vc.rv.setLayoutManager(new GridLayoutManager(this,2));
        adaptador = new Adapter(this, control.contactos, this);
        vc.rv.setAdapter(adaptador);
    }



    @Override
    public void onItemClick(View view, int position) {
        //TODO: Setear Textos
        Modelo m = this.control.contactos.get(position);
        this.vc.main_nombre.setText(m.getNombre());
        this.vc.main_telefono.setText(m.getTelefono());
        this.control.seleccion(position);

    }

    @Override
    public void onClick(View v) {
        //TODO: completar lo que falta
            Log.d("telefono","tel");
            Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: " + this.control.contactos.get(control.posicion).getTelefono()));
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 0);
            } else {
                startActivity(callIntent);
            }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //TODO: Cargar menu desde archivo xml
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.salir:
                //TODO: Completar para salir de la aplicacion
                finish();
                break;
            case R.id.nuevo:
                //TODO: mostrar texto por consola
                Log.d("Texto","por consola");
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
