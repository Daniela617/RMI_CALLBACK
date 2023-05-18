/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor.Repositorios;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import servidor.DTO.UsuarioDTO;

/**
 *
 * @author Usuario
 */
public class usuarioRepositoryImpl implements UsuarioRepositoryInt{
    private final ArrayList<UsuarioDTO> misUsuarios;
    public usuarioRepositoryImpl(){
        this.misUsuarios= new ArrayList();
    }
    @Override
    public boolean registrarUsuario(UsuarioDTO objUsuario) {
            System.out.println("Se registro exitosamente el Usuario "+objUsuario.getNombres());			
            return this.misUsuarios.add(objUsuario);
    }

    @Override
    public ArrayList<UsuarioDTO> listarUsuarios() {
            System.out.println("Se listo exitosamente el Usuario");			
            return this.misUsuarios;
        }
    
}
