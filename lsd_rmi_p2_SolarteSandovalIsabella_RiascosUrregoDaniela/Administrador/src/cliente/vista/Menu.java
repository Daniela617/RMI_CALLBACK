package cliente.vista;

import cliente.utilidades.UtilidadesConsola;
import java.rmi.RemoteException;
import java.util.ArrayList;
import servidor.DTO.UsuarioDTO;
import servidor.controladores.ControladorGestorUsuariosInt;

public class Menu {
    
    private final ControladorGestorUsuariosInt objRemoto;//ubi del objRemoto
    
    public Menu( ControladorGestorUsuariosInt objRemoto)
    {
        this.objRemoto=objRemoto;
    }
    
    public void ejecutarMenuPrincipal()
    {
        int opcion = 0;
        do
        {
            System.out.println("==Menu==");
            System.out.println("1. Registrar Usuario");			
            System.out.println("2. Listar Usuarios");
            System.out.println("3. Salir");

            opcion = UtilidadesConsola.leerEntero();

            switch(opcion)
            {
                case 1:
                        Opcion1();
                        break;
                case 2:
                        Opcion2();
                        break;	

                case 3:
                        System.out.println("Salir...");
                        break;
                default:
                        System.out.println("Opción incorrecta");
            }

        }while(opcion != 3);
    }

    private void Opcion1() 
    {
        try
        {
                System.out.println("==Registro del usuario==");
                System.out.println("==Digite el tipo Identificacion==");
                String tipoIdentificacion=UtilidadesConsola.leerCadena();
                System.out.println("==Digite el numero de identificacion==");
                String identificacion=UtilidadesConsola.leerCadena();
                System.out.println("==Digite sus nombres==");
                String nombres=UtilidadesConsola.leerCadena();
                System.out.println("==Digite sus apellidos==");
                String apellidos=UtilidadesConsola.leerCadena();
                System.out.println("==Digite la edad==");
                int edad=UtilidadesConsola.leerEntero();
                UsuarioDTO objUsuarioDTO= new UsuarioDTO(tipoIdentificacion, identificacion, nombres,apellidos, edad);
                boolean bandera=objRemoto.registrarUsuario(objUsuarioDTO);
                if(bandera)
                        System.out.println("Registro realizado satisfactoriamente...");
                else
                        System.out.println("no se pudo realizar el registro...");
        }
        catch(RemoteException e)
        {
                System.out.println("La operacion no se pudo completar, intente nuevamente...");
        }
    }




    private void Opcion2() 
    {   
        
        
        try
        {
            System.out.println("==Listar Usuarios==");
            ArrayList<UsuarioDTO> objUsuario=objRemoto.listarUsuarios();
            for (int i=0; i<objUsuario.size();i++){
                System.out.println("=========USUARIO "+(i+1)+"==========");
                System.out.println("Tipo de identificacion: "+objUsuario.get(i).getTipoIdentificacion());
                System.out.println("Identificacion: "+objUsuario.get(i).getIdentificacion());
                System.out.println("Nombres: "+objUsuario.get(i).getNombres());
                System.out.println("Apellidos: "+objUsuario.get(i).getApellidos());
                System.out.println("Edad: "+objUsuario.get(i).getEdad());
            }
        }
        catch(RemoteException e)
        {
                System.out.println("La operacion no se pudo completar, intente nuevamente...");
        }
    }
}
