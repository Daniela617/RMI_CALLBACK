/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor.controladores;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import servidor.DTO.UsuarioDTO;
import servidor.Repositorios.UsuarioRepositoryInt;

/**
 *
 * @author Isabella Solarte S
 */
public class ControladorGestorUsuariosImpl extends UnicastRemoteObject implements ControladorGestorUsuariosInt{
    private final UsuarioRepositoryInt objUsuarioRepository;
    private final ControladorGestorAdministradoresImpl objRemotoAdministradores;
    public ControladorGestorUsuariosImpl(UsuarioRepositoryInt objUsuarioRepository,ControladorGestorAdministradoresImpl objRemotoAdministradores) throws RemoteException
    {
        super(); //se asigna un puerto de escucha al OR
        this.objUsuarioRepository= objUsuarioRepository;
        this.objRemotoAdministradores= objRemotoAdministradores;
    }  

    @Override
    public boolean registrarUsuario(UsuarioDTO objUsuario) throws RemoteException {
        objRemotoAdministradores.notificarAdministradores(objUsuario);
        return this.objUsuarioRepository.registrarUsuario(objUsuario);
    }

    @Override
    public ArrayList<UsuarioDTO> listarUsuarios() throws RemoteException {
       return this.objUsuarioRepository.listarUsuarios();
    }
    
}
