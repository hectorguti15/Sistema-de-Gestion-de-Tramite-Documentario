package modelos;

import Enums.TipoIdentificacion;

public class User extends Persona {

    //Si es trabajador ingresara su código ulima, sino su dni, y si es institución su RUC
    private TipoIdentificacion tipoIdentificacion;
    private int numeroIdentificacion;
    private int numeroExpediente;

    public User( String nombre, String apellido, String correoElectronico, TipoIdentificacion tipoIdentificacion, int numeroIdentificacion, int numeroExpediente) {
        super(nombre, apellido, correoElectronico);
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.numeroExpediente = numeroExpediente;

    }

    public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;

    }
    public void setNumeroExpediente(int numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }
    public int getNumeroExpediente(){
        return numeroExpediente;
    }
}


