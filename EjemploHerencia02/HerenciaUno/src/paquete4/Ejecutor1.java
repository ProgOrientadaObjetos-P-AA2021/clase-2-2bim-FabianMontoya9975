/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

public class Ejecutor1 {

    public static void main(String[] args) {

        // Creación de un objeto de tipo EstudianteDistancia
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;

        EstudianteDistancia estDistancia = new EstudianteDistancia(nombre,
                apellido, identificacion, edad);

        estDistancia.establecerCostoAsignatura(50.5);
        estDistancia.establecerNumeroAsginaturas(5);
        estDistancia.calcularMatriculaDistancia();

        //Creación de un objeto de tipo EstudiantePresencial
        String nombre2 = "Fabián";
        String apellido2 = "Montoya";
        String identificacion2 = "11223344";
        int edad2 = 19;

        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre2,
                apellido2, identificacion2, edad2);

        estPresencial.establecerNumeroCreditos(25);
        estPresencial.establecerCostoCredito(40.4);
        estPresencial.calcularMatriculaPresencial();

        System.out.println(estDistancia);
        System.out.println("-------------------------");
        System.out.println(estPresencial);
    }
}
