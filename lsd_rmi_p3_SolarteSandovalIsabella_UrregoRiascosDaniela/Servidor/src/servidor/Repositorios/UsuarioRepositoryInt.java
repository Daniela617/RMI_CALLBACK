/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servidor.Repositorios;

import java.util.ArrayList;
import servidor.DTO.UsuarioDTO;

/**
 *
 * @author Isabella Solarte S
 */
public interface UsuarioRepositoryInt {
    public boolean registrarUsuario(UsuarioDTO objUsuario);
    public ArrayList<UsuarioDTO> listarUsuarios();
    
}
