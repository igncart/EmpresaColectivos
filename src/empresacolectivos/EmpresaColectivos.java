package empresacolectivos;

import empresacolectivos.Entidades.*;
import empresacolectivos.accesoADatos.*;
import java.sql.Connection;
import java.time.LocalTime;


public class EmpresaColectivos {

    
    public static void main(String[] args) {


//                                                                            (((RutaData)))    
//RutaData rut = new RutaData();

/*                                                                     - - - - registrar rutas - - - -

Ruta ruta1 = new Ruta("San Luis", "Mendoza", LocalTime.of(04, 00, 00), true);
Ruta ruta2 = new Ruta("San Luis", "Villa Mercedes", LocalTime.of(01, 30, 00), true);

rut.registrarRuta(ruta1);
rut.registrarRuta(ruta2);
        
                                                                       - - - - modificar ruta - - - -        

Ruta ruta2 = new Ruta(2,"San Luis", "V. Mercedes", LocalTime.of(01, 20, 00), true);

rut.modificarRuta(ruta2);
        

                                                                       - - - - eliminar ruta - - - -     

rut.eliminarRuta(2);
        
                                                                        - - - - listar rutas - - - -     

for (Ruta ruta : rut.listarRutas()) {
    
    System.out.println("Origen: "+ruta.getOrigen());
    System.out.println("Destino: "+ruta.getDestino());
    System.out.println("Duración: "+ruta.getDuracion_Estimada()+" hs.");
    System.out.println("");
    
}
        
                                                                         - - - - buscar ruta por destino - - - -   

   Ruta rutaEncontrada = rut.buscarRutaPorDestino("Mendoza"); 
       
           if (rutaEncontrada != null) {      
                   System.out.println("ID: "+rutaEncontrada.getId_Ruta());
                   System.out.println("Origen: "+rutaEncontrada.getOrigen());
                   System.out.println("Destino: "+rutaEncontrada.getDestino());
                   System.out.println("Duración: "+rutaEncontrada.getDuracion_Estimada());
                   System.out.println("");
           }
        
                                                                          - - - - buscar ruta por origen - - - -       

   Ruta rutaEncontrada = rut.buscarRutaPorOrigen("San Luis"); 
       
           if (rutaEncontrada != null) {      
                   System.out.println("ID: "+rutaEncontrada.getId_Ruta());
                   System.out.println("Origen: "+rutaEncontrada.getOrigen());
                   System.out.println("Destino: "+rutaEncontrada.getDestino());
                   System.out.println("Duración: "+rutaEncontrada.getDuracion_Estimada());
                   System.out.println("");
           }
*/        







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
