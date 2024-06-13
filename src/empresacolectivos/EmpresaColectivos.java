package empresacolectivos;

import empresacolectivos.Entidades.*;
import empresacolectivos.accesoADatos.*;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.LocalTime;


public class EmpresaColectivos {

    
    public static void main(String[] args) {


//                                                                            (((PasajeData)))            
   
 /*    
PasajeData pd = new PasajeData();

PasajeroData pasad = new PasajeroData();
Pasajero pasajeroA = pasad.buscarPasajero(1);

RutaData rd = new RutaData();
Ruta rutaA = rd.buscarRuta(1);

ColectivoData cd = new ColectivoData();
Colectivo colectivoA = cd.buscarColectivo(1);

//                                                                      - - - - registrar pasaje - - - -     
/*
        Pasaje pasaje1 = new Pasaje(pasajeroA, colectivoA, rutaA, LocalDate.of(2024, 06, 10), LocalTime.of(5, 45), 1, 20000);
        Pasaje pasaje2 = new Pasaje(pasajeroA, colectivoA, rutaA, LocalDate.of(2024, 07, 11), LocalTime.of(5, 45), 4, 25000);
        pd.registrarPasaje(pasaje1);
        pd.registrarPasaje(pasaje2);

        
//                                                                      - - - - eliminar pasaje - - - -            
        
 pd.eliminarPasaje(2);
       
        
 //                                                                       - - - - listar pasajes - - - -

for (Pasaje pasaje3 : pd.listarPasajes()) {
    
    System.out.println("ID-pasaje: "+pasaje3.getId_Pasaje());
    System.out.println("ID-pasajero: "+pasaje3.getPasajero().getId_Pasajero());
    System.out.println("ID-colectivo: "+pasaje3.getColectivo().getId_Colectivo());
    System.out.println("ID-ruta: "+pasaje3.getRuta().getId_Ruta());
    System.out.println("Fecha del viaje: "+pasaje3.getFecha_Viaje());
    System.out.println("Hora del viaje: "+pasaje3.getHora_Viaje());
    System.out.println("Asiento número: "+pasaje3.getAsiento());
    System.out.println("Precio: $"+pasaje3.getPrecio());
    System.out.println("");
}       

*/ 


//                                                                            (((HorarioData)))    
/*
                                                                     - - - - registrar horarios - - - -
HorarioData hora = new HorarioData();
RutaData rut = new RutaData();
Ruta ruta = rut.buscarRuta(1);


 
Horario horario1 = new Horario(ruta, LocalTime.of(06, 0), LocalTime.of(10, 0), true);
Horario horario2 = new Horario(ruta, LocalTime.of(16, 0), LocalTime.of(20, 0), true);

hora.registrarHorario(horario1);
hora.registrarHorario(horario2);

//                                                                       - - - - modificar horario - - - -
Horario horario1 = new Horario(1, ruta, LocalTime.of(05, 45), LocalTime.of(10, 0), true);
hora.modificarHorario(horario1);

//                                                                       - - - - eliminar horario - - - -
hora.eliminarHorario(2);


//                                                                       - - - - listar horarios - - - -

for (Horario horario3 : hora.listarHorarios()) {
    
    System.out.println("ID-horario: "+horario3.getId_Horario());
    System.out.println("ID-ruta: "+horario3.getRuta().getId_Ruta());
    System.out.println("Hora de salida: "+horario3.getHora_Salida()+" hs.");
    System.out.println("Hora de llegada: "+horario3.getHora_Llegada()+" hs.");
    System.out.println("");
}

//                                                                       - - - - buscar horario por ruta - - - -

   Horario horarioEncontrado = hora.buscarHorarioPorRuta(ruta); 
       
           if (horarioEncontrado != null) {      
                   System.out.println("ID-horario: "+horarioEncontrado.getId_Horario());
                   System.out.println("ID-ruta: "+horarioEncontrado.getRuta().getId_Ruta());
                   System.out.println("Hora de salida: "+horarioEncontrado.getHora_Salida());
                   System.out.println("Hora de llegada: "+horarioEncontrado.getHora_Llegada());
                   System.out.println("");
           }

//                                                                       - - - - buscar horario por salida - - - -
  
   Horario horarioEncontrado = hora.buscarHorarioPorSalida(LocalTime.of(05, 45)); 
       
           if (horarioEncontrado != null) {      
                   System.out.println("ID-horario: "+horarioEncontrado.getId_Horario());
                   System.out.println("ID-ruta: "+horarioEncontrado.getRuta().getId_Ruta());
                   System.out.println("Hora de salida: "+horarioEncontrado.getHora_Salida());
                   System.out.println("Hora de llegada: "+horarioEncontrado.getHora_Llegada());
                   System.out.println("");
           }
*/





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
