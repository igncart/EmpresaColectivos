package empresacolectivos;

import empresacolectivos.Entidades.*;
import empresacolectivos.accesoADatos.*;
import java.sql.Connection;


public class EmpresaColectivos {

    
    public static void main(String[] args) {

       

//                                                                            (((PasajeroData)))

/* 
PasajeroData pasa = new PasajeroData();       

                                                                     - - - - registrar pasajeros - - - -

Pasajero pasajero1 = new Pasajero("Juanjo", "Saez", "35353535", "juanjo@gmail.com", "2664353535", true);
Pasajero pasajero2 = new Pasajero("Juanjito", "Saezito", "25252525", "juanjito@hotmail.com", "02652010203", true);

pasa.registrarPasajero(pasajero1);
pasa.registrarPasajero(pasajero2);

                                                                     - - - - modificar pasajero - - - -        

Pasajero pasajero2 = new Pasajero(2, "Juanjitooo", "Saezitooo", "25252525", "juanjito@hotmail.com", "02652010203", true);
pasa.modificarPasajero(pasajero2);        
        
        
                                                                     - - - - eliminar pasajero - - - -

pasa.eliminarPasajero(2);


                                                                     - - - - listar pasajeros - - - -

 for (Pasajero pasajero : pasa.listarPasajeros()) {
            System.out.println("Nombre: "+pasajero.getNombre());
            System.out.println("Apellido: "+pasajero.getApellido());
            System.out.println("DNI: "+pasajero.getDni());
            System.out.println("Correo: "+pasajero.getCorreo());
            System.out.println("Telefono: "+pasajero.getTelefono());
            System.out.println("");
}


                                                                     - - - - buscar pasajero por id - - - -
                                                                             
   Pasajero pasajeroEncontrado = pasa.buscarPasajero(1); 
       
           if (pasajeroEncontrado != null) {      
                   System.out.println("Nombre: "+pasajeroEncontrado.getNombre());
                   System.out.println("Apellido: "+pasajeroEncontrado.getApellido());
                   System.out.println("DNI: "+pasajeroEncontrado.getDni());
                   System.out.println("Correo: "+pasajeroEncontrado.getCorreo());
                   System.out.println("Telefono: "+pasajeroEncontrado.getTelefono());
                   System.out.println("");
           }


                                                                     - - - - buscar pasajero por dni - - - -       
       
   Pasajero pasajeroEncontrado = pasa.buscarPasajeroPorDni("35353535"); 
       
           if (pasajeroEncontrado != null) {      
                   System.out.println("Nombre: "+pasajeroEncontrado.getNombre());
                   System.out.println("Apellido: "+pasajeroEncontrado.getApellido());
                   System.out.println("DNI: "+pasajeroEncontrado.getDni());
                   System.out.println("Correo: "+pasajeroEncontrado.getCorreo());
                   System.out.println("Telefono: "+pasajeroEncontrado.getTelefono());
                   System.out.println("");
           }   


                                                                    - - - - buscar pasajero por nombre - - - -          
  
   Pasajero pasajeroEncontrado = pasa.buscarPasajeroPorNombre("Juanjo"); 
       
           if (pasajeroEncontrado != null) {      
                   System.out.println("Nombre: "+pasajeroEncontrado.getNombre());
                   System.out.println("Apellido: "+pasajeroEncontrado.getApellido());
                   System.out.println("DNI: "+pasajeroEncontrado.getDni());
                   System.out.println("Correo: "+pasajeroEncontrado.getCorreo());
                   System.out.println("Telefono: "+pasajeroEncontrado.getTelefono());
                   System.out.println("");
           }      

       
                                                                    - - - - buscar pasajero por apellido - - - -     
       
   Pasajero pasajeroEncontrado = pasa.buscarPasajeroPorApellido("Saez"); 
       
           if (pasajeroEncontrado != null) {      
                   System.out.println("Nombre: "+pasajeroEncontrado.getNombre());
                   System.out.println("Apellido: "+pasajeroEncontrado.getApellido());
                   System.out.println("DNI: "+pasajeroEncontrado.getDni());
                   System.out.println("Correo: "+pasajeroEncontrado.getCorreo());
                   System.out.println("Telefono: "+pasajeroEncontrado.getTelefono());
                   System.out.println("");
           } 
*/ 




       

//-----ColectivoData
    
    /*   Colectivo colectivo=new Colectivo(1,"AB123CS", "niccolo", "Isidro 2022", 60, true);
       Colectivo colectivo2=new Colectivo(2,"AB214DC", "niccolo", "avanti", 30, true);
       Colectivo colectivo3=new Colectivo("AC213CD", "niccolo", "cento", 44, true);
       ColectivoData cole=new ColectivoData();
    */  
       //-------Registrar Colectivo
       //cole.registrarColectivo(colectivo);
       //cole.registrarColectivo(colectivo2);
       //cole.registrarColectivo(colectivo3);
       

       //-------Modificar Colectivo
       //cole.modificarColectivo(colectivo);
       //cole.modificarColectivo(colectivo2);
       
       //-------Eliminar Colectivo
       //cole.eliminarColectivo(3);
       
       //-------Listar Colectivos
    /*    for (Colectivo bus : cole.listarColectivo()) {
            System.out.println("Matricula: "+bus.getMatricula());
            System.out.println("Marca: "+bus.getMarca());
            System.out.println("Capacidad: "+bus.getCapacidad());
            System.out.println("--------------");
        }
    */  
       
    }
    
}
