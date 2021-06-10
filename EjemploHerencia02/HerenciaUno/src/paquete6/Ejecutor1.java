/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

public class Ejecutor1 {

    public static void main(String[] args) {

        // Creación de un objeto de tipo EstudianteDistancia
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        int numAsignaturas = 5;
        double costoAsig = 50.5;
        EstudianteDistancia estDistancia = new EstudianteDistancia(nombre,
                apellido, identificacion, edad, numAsignaturas, costoAsig);

        estDistancia.calcularMatriculaDistancia();

        // Creación de un objeto de tipo EstudianteDistancia
        String nombre2 = "Fabián";
        String apellido2 = "Montoya";
        String identificacion2 = "123456";
        int edad2 = 19;
        int numACredito2 = 40;
        double costoCredito2 = 22.3;

        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre2,
                apellido2, identificacion2, edad2, numACredito2,
                costoCredito2);

        estPresencial.calcularMatriculaPresencial();

        System.out.println(estDistancia);
        System.out.println("-------------------------");
        System.out.println(estPresencial);
    }
}
