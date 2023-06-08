/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import java.util.Locale;
import java.util.Scanner;
import herencia1.*;

/**
 *
 * @author reroes
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        // Ingresar por teclado
        // un objeto de tipo Estudiante Distancia si el usuario ingresa 1 como 
        // opción
        // un objeto de tipo Estudiante Presencial si el usuario ingresa 2 como 
        // opción
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int opc;
        do {

            System.out.println("Ingrese 1 para crear estudiante a Distancia");
            System.out.println("Ingrese 2 para crear estudiante prescencial");
            System.out.println("Ingrese 0 para salir");
            opc = entrada.nextInt();
            entrada.nextLine();
            if (opc == 1) {
                System.out.println("Ingrese nombres");
                String nombres = entrada.nextLine();
                System.out.println("Ingrese apellidos");
                String apellidos = entrada.nextLine();
                System.out.println("Ingrese identificación");
                String identificacion = entrada.nextLine();
                System.out.println("Ingrese edad");
                int edad = entrada.nextInt();
                System.out.println("Ingrese número de asignaturas");
                int asignaturas = entrada.nextInt();
                System.out.println("Ingrese costo asignatura");
                double costoAsignatura = entrada.nextDouble();
                EstudianteDistancia estudiante = new EstudianteDistancia();

                estudiante.establecerNombresEstudiante(nombres);
                estudiante.establecerApellidoEstudiante(apellidos);
                estudiante.establecerEdadEstudiante(edad);
                estudiante.establecerIdentificacionEstudiante(identificacion);
                estudiante.establecerNumeroAsginaturas(asignaturas);
                estudiante.establecerCostoAsignatura(costoAsignatura);
                estudiante.calcularMatriculaDistancia();

                System.out.printf("%s\n", estudiante);

            } else {
                if (opc == 2) {

                    EstudiantePresencial e1 = new EstudiantePresencial();
                    System.out.println("Ingrese nombres");
                    String nombres = entrada.nextLine();
                    System.out.println("Ingrese apellidos");
                    String apellidos = entrada.nextLine();
                    System.out.println("Ingrese identificación");
                    String identificacion = entrada.nextLine();
                    System.out.println("Ingrese edad");
                    int edad = entrada.nextInt();
                    System.out.println("Ingrese número de Creditos");
                    int creditos = entrada.nextInt();
                    System.out.println("Ingrese costo de creditos");
                    double costoCreditos = entrada.nextDouble();

                    e1.establecerNombresEstudiante(nombres);
                    e1.establecerApellidoEstudiante(apellidos);
                    e1.establecerIdentificacionEstudiante(identificacion);
                    e1.establecerEdadEstudiante(edad);
                    e1.establecerNumeroCreditos(creditos);
                    e1.establecerCostoCredito(costoCreditos);
                    e1.calcularMatriculaPresencial();

                    System.out.printf("%s\n", e1);
                }

            }
        } while (opc != 0);

    }
}
