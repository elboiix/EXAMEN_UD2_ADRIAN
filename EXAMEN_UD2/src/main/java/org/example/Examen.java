package org.example;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.Random;

public class Examen {
    public void ejercicio1() {

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        String eleccion;
        int p = 0, a = 0, t = 0,ia, p_ia = 0, a_ia = 0, t_ia = 0, longitud, usuario = 0, pc = 0, ronda = 1;

        while (true) {
            System.out.println("Ronda " + ronda);
            ia = aleatorio.nextInt(3)+1;
            switch (ia) {

                case 1:
                    p_ia = 1;
                    break;
                case 2:
                    a_ia = 1;
                    break;
                case 3:
                    t_ia = 1;
                    break;
            }
            System.out.print("¿Piedra papel o tijera? (p/a/t):");
            eleccion = entrada.nextLine();
            switch (eleccion) {

                case "p":
                    p = 1;
                    break;
                case "a":
                    a = 1;
                    break;
                case "t":
                    t = 1;
                    break;
                default:
                    System.out.println("Error al introducir la opción. Vuelve a intentarlo...");
                    continue;
            }
            switch (ia) {

                case 1:
                    System.out.println("El ordenador ha elegido: Piedra");
                    break;
                case 2:
                    System.out.println("El ordenador ha elegido: Papel");
                    break;
                case 3:
                    System.out.println("El ordenador ha elegido: Tijera");
                    break;
            }

            if (p == 1 && p_ia == 1 || a == 1 && a_ia == 1 || t == 1 && t_ia == 1){
                System.out.println("¡Empate!");

            }else if (p == 1 && t_ia == 1 || a == 1 && p_ia == 1 || t == 1 && a_ia == 1){
                System.out.println("¡Has ganado!");
                ronda += 1;
                usuario += 1;
            }else{
                System.out.println("Has perdido");
                ronda += 1;
                pc += 1;
            }
            System.out.println("Marcador actual (PC-usuario): " + usuario + "-" + pc);
            p = 0;
            a = 0;
            t = 0;
            p_ia = 0;
            a_ia = 0;
            t_ia = 0;

            if (ronda == 4){
                if (usuario > pc) {
                    System.out.println("¡GANA EL USUARIO!");
                    break;
                }else if (usuario == pc){
                    System.out.println("¡EMPATE!");
                }else{
                    System.out.println("¡GANA EL ORDENADOR!");
                    break;
                }
            }
        }
    }
    public void ejercicio2(){

        Scanner entrada = new Scanner(System.in);

        String año_naciminto;
        int año_nacimiento_int, edad;

        LocalDateTime hoy = LocalDateTime.now();


        while (true){

            System.out.print("Dame tu año de nacimiento: ");
            año_naciminto = entrada.nextLine();

            try{
                año_nacimiento_int = Integer.parseInt(año_naciminto);

            }catch(NumberFormatException err) {
                System.out.println("Error al introducir el año de nacimiento. Vuelve a intentarlo...");
                continue;
            }
            if (año_nacimiento_int < 1900 || año_nacimiento_int > +hoy.getYear()){
                System.out.println("Error, Introduce un año de nacimiento mayor a 1900 y menor al año actual. Vuelve a intentarlo...");
                continue;
            }
            edad = +hoy.getYear() - año_nacimiento_int;

            for(int i= 0; i <= edad; i++){
                System.out.println(año_nacimiento_int + "–edad: " + i );
                año_nacimiento_int += 1;
            }
            break;
        }


    }
}


