package ar.edu.utn.fra.lab5.a1erparcial;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lkdml on 03/10/2017.
 */

public class Controlador {
    //TODO: Traer del Main lo necesario para usar MVC
    public List<Modelo> contactos;
    public int posicion;


    public Controlador(VistaControlador v)
    {
        this.contactos = new ArrayList<Modelo>();
        this.contactos.add(new Modelo("Juan", "Garcia", "4444-4444"));
        this.contactos.add(new Modelo("Pablo", "Lopez", "5555-45554"));
        this.contactos.add(new Modelo("Ricardo", "Perez", "4124-1234"));
        this.contactos.add(new Modelo("Raul", "Garnica", "4123-43244"));
        this.contactos.add(new Modelo("Roberto", "Rossi", "1251-5123"));
        this.contactos.add(new Modelo("Julieta", "H.", "5324-1252"));
        this.contactos.add(new Modelo("Gabriel", "Veracruz", "1225-5423"));
        this.contactos.add(new Modelo("Martin", "Paez", "4444-4124"));
        this.contactos.add(new Modelo("Adrian", "Stocombo", "4444-1251"));
        this.contactos.add(new Modelo("Walter", "Lilope", "4444-1524"));
        this.contactos.add(new Modelo("Teodoro", "Tarcuro", "4444-1252"));
        this.contactos.add(new Modelo("Celia", "Curro", "2314-1521"));
        this.contactos.add(new Modelo("Belen", "Paz", "1523-4444"));
        this.contactos.add(new Modelo("Tomas", "Tarifa", "3125-6234"));
        this.contactos.add(new Modelo("Jazmin", "Solano", "1252-6234"));
        this.contactos.add(new Modelo("Nicolas", "trejo", "2634-2346"));
        this.contactos.add(new Modelo("Osvaldo", "Ramallo", "7345-4444"));
        this.contactos.add(new Modelo("Alfredo", "Garcia", "2364-2346"));
    }

    public void seleccion (int posicion){
        this.posicion = posicion;


    }
}
