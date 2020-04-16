package edu.eci.cvds.bean;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.services.ServicesBancoProyecto;

import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;

@ManagedBean
@SessionScoped
public class RegistroBean {
    @Inject
    private ServicesBancoProyecto servicesBancoProyecto;

    public void nuevoUsuario(String nombre, int documento, String contrasena, String tipoUsuario, String email){
        Usuario usuario= new Usuario(nombre, documento, contrasena, tipoUsuario, email);
        servicesBancoProyecto.insertarUsuario(usuario);
    }

    public Usuario consultarUsuario(String passwd){
        return servicesBancoProyecto.consultarUsuario(passwd);
    }

}
