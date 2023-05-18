/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servidor.controladores;
import cliente.controladores.ControladorCallBackInt;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author Isabella Solarte S
 */
public interface ControladorGestorAdministradoresInt extends Remote {
    public boolean registrarReferenciaRemota(ControladorCallBackInt referencia)throws RemoteException;
}
