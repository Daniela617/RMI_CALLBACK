/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor.controladores;
import cliente.controladores.ControladorCallBackInt;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import servidor.DTO.UsuarioDTO;
/**
 *
 * @author Isabella Solarte S
 */
public class ControladorGestorAdministradoresImpl extends UnicastRemoteObject implements ControladorGestorAdministradoresInt{

    private final ArrayList<ControladorCallBackInt>listaReferencias;
    public ControladorGestorAdministradoresImpl()throws RemoteException
    {
        super();
        this.listaReferencias =new ArrayList();
    }
    @Override
    public boolean registrarReferenciaRemota(ControladorCallBackInt referencia) throws RemoteException {
        return this.listaReferencias.add(referencia);
    }
    
    public void notificarAdministradores(UsuarioDTO objUsuario) throws RemoteException{
        for(ControladorCallBackInt listasReferencia : listaReferencias){
            listasReferencia.notificarRegistroUsuario(objUsuario);
        }
    }
    
}
