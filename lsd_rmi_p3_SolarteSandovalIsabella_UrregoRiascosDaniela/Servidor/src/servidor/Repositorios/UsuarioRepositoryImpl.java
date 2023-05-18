/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor.Repositorios;

import java.util.ArrayList;
import servidor.DTO.UsuarioDTO;

/**
 *
 * @author Isabella Solarte S
 */
public class UsuarioRepositoryImpl implements UsuarioRepositoryInt{
    
    
    private final ArrayList<UsuarioDTO> misUsuarios;
    public UsuarioRepositoryImpl(){
        this.misUsuarios= new ArrayList();
    }
    
    
    @Override
    public boolean registrarUsuario(UsuarioDTO objUsuario) {
        System.out.println("Entrando a registrar");   
        System.out.println("Se ha registrado exitosamente el usuario: "+objUsuario.getNombres());   
        return this.misUsuarios.add(objUsuario);
   
    }

    @Override
    public ArrayList<UsuarioDTO> listarUsuarios() {
        System.out.println("Se listo exitosamente el Usuario");	
        return this.misUsuarios;
    }
    
}
