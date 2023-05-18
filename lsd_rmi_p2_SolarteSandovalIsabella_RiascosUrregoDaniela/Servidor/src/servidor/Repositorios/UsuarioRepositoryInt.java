
package servidor.Repositorios;

import java.util.ArrayList;
import java.util.List;
import servidor.DTO.UsuarioDTO;

public interface UsuarioRepositoryInt
{    
    public boolean registrarUsuario(UsuarioDTO objUsuario);

    public ArrayList<UsuarioDTO> listarUsuarios();
}


