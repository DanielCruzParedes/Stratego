package stratego;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class ControladorLogin {
    private String text;
    ControladorLogin controladorlogin;
    ArrayList<Usuario>listaUsuarios;
    public String UsuarioLogeado;
    
    public ControladorLogin(){
       listaUsuarios=new ArrayList<>();
    }
    
    
    public Usuario buscarUsuario(String nombreUser){
        for(int i=0;i<listaUsuarios.size();i++){
            Usuario usuario = listaUsuarios.get(i);
            if(usuario!=null){
                if(usuario.getUser().equals(nombreUser)){
                return usuario;
                    
                }
            }
        }
        
        return null;
    }
     
    public Usuario getContra(String nombreUser){
        for(int i=0;i<listaUsuarios.size();i++){
            Usuario usuario = listaUsuarios.get(i);
            Usuario contra = listaUsuarios.get(i);
            if(usuario!=null){
                if(usuario.getUser().equals(nombreUser)){
                return contra;
                    
                }
            }
        }
        
        return null;
    }
    
    public boolean agregarUsuario(Usuario usuario){
        Usuario aux = buscarUsuario(usuario.getUser());
        
        if(aux==null){
            listaUsuarios.add(usuario);
            return true;
        }
        return false;
        
    }
    
    public void eliminarCuenta(String nombreuser){
        listaUsuarios.remove(this.buscarUsuario(UsuarioLogeado));
    }
    
    
    
    
}
