/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servidor.controladores;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import servidor.DTO.UsuarioDTO;


/**
 *
 * @author Isabella Solarte S
 */
public interface ControladorGestorUsuariosInt extends Remote {
    public boolean registrarUsuario(UsuarioDTO objUsuario) throws RemoteException;
    public ArrayList<UsuarioDTO>listarUsuarios() throws RemoteException;
            

}
