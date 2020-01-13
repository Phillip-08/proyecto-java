/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @Felipe Calderón 
 */

public class Cuenta {
    private int numCta;
    private int telefono;
    private int saldo;

    public Cuenta() {
    }

    public Cuenta(int numCta, int telefono, int saldo) {
        this.numCta = numCta;
        this.telefono = telefono;
        this.saldo = saldo;
    }

    public int getNumCta() {
        return numCta;
    }

    public void setNumCta(int numCta) {
        this.numCta = numCta;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numCta=" + numCta + ", telefono=" + telefono + ", saldo=" + saldo + '}';
    }
    public void infocta(Cliente obj){
        String tipo;
        if("CC" ==(obj.getTipoCta())){
           tipo = "Cuenta Corriente";
        }else{tipo = "Cuenta Vista";}
        System.out.println("Informacion del Cliente");
        System.out.println("*************************************");
        System.out.println("Nombre: "+ obj.getNombre());
        System.out.println("Email: "+ obj.getEmail());
        System.out.println("Teléfono: +56 9 "+ getTelefono());
        System.out.println("Cuenta N°: "+ getNumCta());
        System.out.println("Tipo de Cuenta: "+tipo);
        System.out.println("Saldo de la cuenta: $"+getSaldo());
        System.out.println("*************************************");
    }
    
    public void StatusCta(Cliente obj){
        if(saldo>=0 && saldo<=999999 ){
            String status = "Cliente "+ obj.getNombre()+" posee una cuenta Normal"; 
            System.out.println(status);
        }
        if(saldo>=1000000 && saldo<=1499999 ){
            String status = "Cliente "+ obj.getNombre()+" posee una cuenta Premium"; 
            System.out.println(status);
        }
        if(saldo>=1500000){
            String status = "Cliente "+ obj.getNombre()+" posee una cuenta PLatinum";
            System.out.println(status);
        }
    }
    
    public void AbonarCta(int a, int b)
    {
        int c=0;
        c=a+getSaldo();
        System.out.println("Monto abonado exitosamente.");
        setSaldo(c);
    }
    
    public void CambiarFono(int a)
    {
        System.out.println("Telefono modificado exitosamente");
        setTelefono(a); 
    }
    
    public int Mantencion(){
        int total = 0;                             
        total =((this.saldo)/100);
        int a = saldo-total;
        setSaldo(a);
        return total;
    }
   
}
 