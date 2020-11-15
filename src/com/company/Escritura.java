package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escritura {
    private String NOMBRE_ARCHIVO = "Archivo.txt";
    public void agregarPersona(Animal animal) {
        try {
            FileWriter writer = new FileWriter(NOMBRE_ARCHIVO, true);
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write(animal.agregarComa());
            buffer.newLine();
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
