public class Usuario extends Persona{
             
    private String nombreUsuario;    
    private String contraseña;      

    public Usuario(String nombre, String nombreUsuario, String contraseña){
        super(nombre);
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public String getNombreUsuario(){
        return nombreUsuario;
    }

    public boolean verificarContraseña(String contraseña){
        return  this.contraseña.equals(contraseña);
    }

}
