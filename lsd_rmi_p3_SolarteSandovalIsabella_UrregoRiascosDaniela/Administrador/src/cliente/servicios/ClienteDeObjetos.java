package cliente.servicios;

import cliente.controladores.ControladorCallBackImpl;
import cliente.utilidades.UtilidadesRegistroC;

import java.rmi.RemoteException;
import servidor.controladores.ControladorGestorAdministradoresInt;
/**
 *
 * @author Isabella Solarte S
 */
public class ClienteDeObjetos
{

   

    public static void main(String[] args) throws RemoteException
    {
        int numPuertoRMIRegistry = 0;
        String direccionIpRMIRegistry = "";        

        System.out.println("Cual es el la dirección ip donde se encuentra  el rmiregistry ");
        direccionIpRMIRegistry = cliente.utilidades.UtilidadesConsola.leerCadena();
        System.out.println("Cual es el número de puerto por el cual escucha el rmiregistry ");
        numPuertoRMIRegistry = cliente.utilidades.UtilidadesConsola.leerEntero(); 

       ControladorCallBackImpl objRemoto= new ControladorCallBackImpl();
       ControladorGestorAdministradoresInt ObjRemotoServidor= (ControladorGestorAdministradoresInt)
               UtilidadesRegistroC.obtenerObjRemoto(direccionIpRMIRegistry, numPuertoRMIRegistry,"ObjetoServicioGestionAdministradores");
       ObjRemotoServidor.registrarReferenciaRemota(objRemoto);
       
        System.out.println("Esperando notificaciones ");

    }
	
}

