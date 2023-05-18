/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.servicios;


import servidor.utilidades.UtilidadesRegistroS;
import servidor.utilidades.UtilidadesConsola;
import java.rmi.RemoteException;
import servidor.Repositorios.usuarioRepositoryImpl;
import servidor.controladores.ControladorGestorUsuariosImpl;
import java.rmi.Remote;

public class ServidorDeObjetos
{
    public static void main(String args[]) throws RemoteException
    {        
         
        int numPuertoRMIRegistry = 0;
        String direccionIpRMIRegistry = "";
          //donde esta el NS             
        System.out.println("Cual es el la dirección ip donde se encuentra  el rmiRegistry ");
        direccionIpRMIRegistry = UtilidadesConsola.leerCadena();
        System.out.println("Cual es el número de puerto por el cual escucha el rmiRegistry ");
        numPuertoRMIRegistry = UtilidadesConsola.leerEntero(); 
     
        //Crear el repositorio
        usuarioRepositoryImpl objUsuarioRepository = new usuarioRepositoryImpl();
        ControladorGestorUsuariosImpl objRemotoGestionUsuarios = new ControladorGestorUsuariosImpl(objUsuarioRepository);

        //Crear el objeto remoto
        try
        {
           UtilidadesRegistroS.arrancarNS(numPuertoRMIRegistry);
           UtilidadesRegistroS.RegistrarObjetoRemoto((Remote) objRemotoGestionUsuarios, direccionIpRMIRegistry, numPuertoRMIRegistry, "objServicioGestionUsuarios");            
           
        } catch (Exception e)
        {
            System.err.println("No fue posible Arrancar el NS o Registrar el objeto remoto" +  e.getMessage());
        }
        
        
    }
}
