/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor.controladores;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import servidor.Repositorios.UsuarioRepositoryInt;
import servidor.DTO.UsuarioDTO;

/**
 *
 * @author Usuario
 */
public class ControladorGestorUsuariosImpl extends UnicastRemoteObject implements ControladorGestorUsuariosInt {
    
    //la clase unicastR.. asigna u puerto al objRemoto
    private final UsuarioRepositoryInt objRepositorio;
    public ControladorGestorUsuariosImpl(UsuarioRepositoryInt objRepositorio) throws RemoteException{
        super();
        //e asigna el puerto de escucha mediante el constructor 
        this.objRepositorio=objRepositorio;
    }

    @Override
    public boolean registrarUsuario(UsuarioDTO objUsuario) throws RemoteException {
        return this.objRepositorio.registrarUsuario(objUsuario);
    }

    @Override
    public ArrayList<UsuarioDTO> listarUsuarios() throws RemoteException {
        return this.objRepositorio.listarUsuarios();
    }

    
}
