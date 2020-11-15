package com.company;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
	// write your code here

        menu();

    }
    public static void menu(){
        int select = -1;
        boolean entrada=true;
        do {
        String lectura = JOptionPane.showInputDialog(null,"**************************************\nElige opción:\n"+
                "1.- Registrar mascota\n" +
                "2.- Atender mascota\n" +
                "3.- Ver reportes\n" +
                "4.- Salir\n**************************************");
        select = Integer.parseInt(lectura);
        switch(select){
            case 1:
                registrarAnimal ();
                break;
            case 2:
                atenderAnimal();
                break;
            case 3:
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Adios!");
                entrada=false;
                break;
            default:
                JOptionPane.showMessageDialog(null,"Número no reconocido");break;
        }
        }
        while(true); // Display the menu until the user closes the program
    }

    public static void registrarAnimal (){
        String nombre =JOptionPane.showInputDialog(null,"Digite el nombre de la mascota");
        String tipo =JOptionPane.showInputDialog(null,"Digite el tipo de mascota");
        String fechaNacimiento =JOptionPane.showInputDialog(null,"Digite la edad de la mascota");
        String nombreDueno =JOptionPane.showInputDialog(null,"Digite el nombre del dueño de la mascota");
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNaci = LocalDate.parse(fechaNacimiento, fmt);
        Animal animal=new Animal(fechaNaci,nombre,nombreDueno,tipo);
        guardarAlumno(animal);

    }

    public static void atenderAnimal(){
        String nombre =JOptionPane.showInputDialog(null,"Digite el nombre de la mascota que desea atender");
        String[] options = {"Desparasitación", "Castración", "Vacunación", "Revisión general"};
        ImageIcon icon = new ImageIcon("src/images/turtle32.png");
        String n = (String)JOptionPane.showInputDialog(null, "Seleccione el servicio deseado",
                "Tipos de servicios", JOptionPane.QUESTION_MESSAGE, icon, options, options[2]);
        String medicamento =JOptionPane.showInputDialog(null,"Digite el medicamento de la mascota");
        Lectura leer = new Lectura();
        leer.atenderAnimal(nombre,medicamento);
    }

    public static void guardarAlumno(Animal animal) {
        Escritura escribir = new Escritura();
        escribir.agregarPersona(animal);
    }

    public static void cargarAnimal() {
        Lectura leer = new Lectura();
        leer.imprimirPersona();
    }

}
