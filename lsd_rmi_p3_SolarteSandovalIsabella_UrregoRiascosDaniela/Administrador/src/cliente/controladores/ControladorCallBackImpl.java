/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente.controladores;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import servidor.DTO.UsuarioDTO;


/**
 *
 * @author Isabella Solarte S
 */
public class ControladorCallBackImpl extends UnicastRemoteObject implements ControladorCallBackInt{
    public ControladorCallBackImpl() throws RemoteException{
        super(); 
    }

    @Override
    public void notificarRegistroUsuario(UsuarioDTO objUsuario) throws RemoteException {
        System.out.println("Usuario nuevo registrado");
        System.out.println("Tipo de identificacion:"+objUsuario.getTipoIdentificacion());
        System.out.println("Identificacion:"+objUsuario.getIdentificacion());
        System.out.println("Nombres: "+objUsuario.getNombres());
        System.out.println("Apellidos: "+objUsuario.getApellidos());
        System.out.println("Edad: "+objUsuario.getEdad());
        System.out.println("---------------------------------------");
    }
}
