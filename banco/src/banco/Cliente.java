/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @Felipe Calderón Alegría
 */

public class Cliente {
    private String rut;
    private String nombre;
    private String email;
    private String tipoCta;

    public Cliente() {
    }

    public Cliente(String rut, String nombre, String email, String tipoCta) {
        this.rut = rut;
        this.nombre = nombre;
        this.email = email;
        this.tipoCta = tipoCta;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        if((rut.length()>=8) && Integer.parseInt(rut.substring(0, 8))>0){
        this.rut = rut;
        }
        else
        {
            System.out.println("Rut es menor a 8 digitos");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoCta() {
        return tipoCta;
    }

    public void setTipoCta(String tipoCta) {
        this.tipoCta = tipoCta;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", nombre=" + nombre + ", email=" + email + ", tipoCta=" + tipoCta + '}';
    }
    
     public void CambiarEmail(String a){
        System.out.println("Email exitosamente modificado");
        setEmail(a);
    }

}
    

