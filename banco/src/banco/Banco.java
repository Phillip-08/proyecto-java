/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @Felipe Calderón Alegría
 */
public class Banco {
    
    public void menuCliente(){
        
            System.out.println("Seleccione una opcion");
            System.out.println("[1] Cliente numero 1");
            System.out.println("[2] Cliente numero 2");
            System.out.println("[3] Cliente numero 3");
            System.out.println("[4] Cliente numero 4");
            System.out.println("[5] Cliente numero 5");
            System.out.println("[6] Salir");
                  
    }
    public void menuCuenta(){
        
            System.out.println("Seleccione una opcion");
            System.out.println("--------------------------------------------------");
            System.out.println("[1] Mostrar informacion del cliente");
            System.out.println("[2] Status de la Cuenta");
            System.out.println("[3] Abonar Dinero");
            System.out.println("[4] Cambiar el email y el número telefónico");
            System.out.println("[5] Realizar el	cargo por mantención de	la cuenta");
            System.out.println("[6] Salir");
            
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn=new Scanner(System.in);
        Banco menu = new Banco();
        Cuenta cue = new Cuenta();
        
        Cliente dato1 = new Cliente();
        Cliente cli1,cli2,cli3,cli4,cli5;
        
        cli1 = new Cliente("15562595","Oscar papi",dato1.getEmail(),"CC");
        cli2 = new Cliente("54185553","Luis Support",dato1.getEmail(),"CV");
        cli3 = new Cliente("12355578","Felipe Hijo",dato1.getEmail(),"CC");
        cli4 = new Cliente("12556553","Vistor Vistima",dato1.getEmail(),"CV");
        cli5 = new Cliente("13332312","Jorge patamala",dato1.getEmail(),"CC");
        
    
        int saldo1 = 0;
        Cuenta cue1,cue2,cue3,cue4,cue5;
        cue1 = new Cuenta(77777777,cue.getTelefono(),cue.getSaldo());
        cue2 = new Cuenta(77777777,cue.getTelefono(),cue.getSaldo());
        cue3 = new Cuenta(77777777,cue.getTelefono(),cue.getSaldo());
        cue4 = new Cuenta(77777777,cue.getTelefono(),cue.getSaldo());
        cue5 = new Cuenta(77777777,cue.getTelefono(),cue.getSaldo());
        
        int respuesta = 0;
        while(respuesta != 6){
        menu.menuCliente();
        respuesta = sn.nextInt();
        if(respuesta ==1){
            int opcion = 0;
            while(opcion != 6){
            menu.menuCuenta();
            opcion = sn.nextInt();
            if(opcion ==1){cue1.infocta(cli1);}
            if(opcion ==2){cue1.StatusCta(cli1);}
            if(opcion ==3){
            System.out.println("Ingrese monto a depositar");
            int a = sn.nextInt();
            cue1.AbonarCta(a,saldo1);}
            if(opcion ==4){boolean telefono = false;
              do{System.out.println("Ingrese numero de telefono");
                String numero_telefono = sn.next();

                    if(numero_telefono.length() == 8){
                        telefono = true;
                        int n_telefono = Integer.parseInt(numero_telefono);
                        cue1.CambiarFono(n_telefono);}
                            else {System.out.println("Ingrese solo 8 digitos");}
                        }while(telefono != true);     
            System.out.println("Ingrese numero de correo");
            String a=sn.next();
            cli1.CambiarEmail(a);
            }
            if(opcion ==5){
                System.out.println("Cargo de $ "+ cue1.Mantencion()+" por mantencion de la cuenta realizada exitosamente");
            }}}
      
    if(respuesta ==2){
        menu.menuCliente();
        int opcion = 0;
        while(opcion != 6){
        menu.menuCuenta();
        opcion= sn.nextInt();
        if(opcion ==1){cue1.infocta(cli2);}
        if(opcion ==2){cue1.StatusCta(cli2);}
        if(opcion ==3){
            System.out.println("Ingrese monto a depositar");
            int a = sn.nextInt();
            cue1.AbonarCta(a,saldo1);}
            if(opcion ==4){boolean telefono = false;
                do{System.out.println("Ingrese numero de telefono");
                    String numero_telefono = sn.next();

        if(numero_telefono.length() == 8){
            telefono = true;
            int n_telefono = Integer.parseInt(numero_telefono);
            cue1.CambiarFono(n_telefono);}
                else {System.out.println("Ingrese solo 8 digitos");}
                }while(telefono != true);     
            System.out.println("Ingrese numero de correo");
            String a=sn.next();
            cli2.CambiarEmail(a);
            }
            if(opcion ==5){
                System.out.println("Cargo de $ "+ cue2.Mantencion()+" por mantencion de la cuenta realizada exitosamente");
            }}}
           
        if(respuesta ==3){
            menu.menuCliente();
            int opcion1 = 0;
            while(opcion1 != 6){
            menu.menuCuenta();
            opcion1 = sn.nextInt();
            if(opcion1 ==1){cue1.infocta(cli3);}
            if(opcion1 ==2){cue1.StatusCta(cli3);}
            if(opcion1 ==3){
                System.out.println("Ingrese monto a depositar");
                int a = sn.nextInt();
                cue1.AbonarCta(a,saldo1);}
            if(opcion1 ==4){boolean telefono = false;
                do{System.out.println("Ingrese numero de telefono");
                    String numero_telefono = sn.next();

            if(numero_telefono.length() == 8){
                telefono = true;
                int n_telefono = Integer.parseInt(numero_telefono);
                cue1.CambiarFono(n_telefono);}
                    else {System.out.println("Ingrese solo 8 digitos");}
                    }while(telefono != true);     
            System.out.println("Ingrese numero de correo");
            String a=sn.next();
            cli3.CambiarEmail(a);
            }
            if(opcion1 ==5){
                System.out.println("Cargo de $ "+ cue3.Mantencion()+" por mantencion de la cuenta realizada exitosamente");
            }}}
            
        if(respuesta ==4){
            menu.menuCliente();
            int opcion1 = 0;
            while(opcion1 != 6){
            menu.menuCuenta();
            opcion1 = sn.nextInt();
            if(opcion1 ==1){cue1.infocta(cli4);}//--.-
            if(opcion1 ==2){cue1.StatusCta(cli4);}
            if(opcion1 ==3){
                System.out.println("Ingrese monto a depositar");
                int a = sn.nextInt();
                cue1.AbonarCta(a,saldo1);}
            if(opcion1 ==4){boolean telefono = false;
                do{System.out.println("Ingrese numero de telefono");
                    String numero_telefono = sn.next();

                if(numero_telefono.length() == 8){
                    telefono = true;
                    int n_telefono = Integer.parseInt(numero_telefono);
                    cue1.CambiarFono(n_telefono);}
                    else {System.out.println("Ingrese solo 8 digitos");}
                }while(telefono != true);     
            System.out.println("Ingrese numero de correo");
            String a=sn.next();
            cli4.CambiarEmail(a);
            }
            if(opcion1 ==5){
                System.out.println("Cargo de $ "+ cue4.Mantencion()+" por mantencion de la cuenta realizada exitosamente");}
            }}
        
        if(respuesta ==5){
            menu.menuCliente();
            int opcion1 = 0;
            while(opcion1 != 6){
            menu.menuCuenta();
            opcion1 = sn.nextInt();
            if(opcion1 ==1){cue1.infocta(cli5);}//--.-
            if(opcion1 ==2){cue1.StatusCta(cli5);}
            if(opcion1 ==3){
                System.out.println("Ingrese monto a depositar");
                int a = sn.nextInt();
                cue1.AbonarCta(a,saldo1);}
            if(opcion1 ==4){boolean telefono = false;
                do{System.out.println("Ingrese numero de telefono");
                    String numero_telefono = sn.next();

                if(numero_telefono.length() == 8){
                    telefono = true;
                    int n_telefono = Integer.parseInt(numero_telefono);
                    cue1.CambiarFono(n_telefono);}
                    else {System.out.println("Ingrese solo 8 digitos");}
                    }while(telefono != true);     
            System.out.println("Ingrese numero de correo");
            String a=sn.next();
            cli5.CambiarEmail(a);
            }
            if(opcion1 ==5){
                System.out.println("Cargo de $ "+ cue5.Mantencion()+" por mantencion de la cuenta realizada exitosamente");}
            }}
        
        }
        }
        }
    


