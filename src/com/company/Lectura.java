package com.company;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Lectura {
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

    public String[] imprimirPersona() {
        ArrayList<Animal> personas = new ArrayList<>();
        String datos = null;
        String []datos1=null;
        String[] pers =null;
        try
        {
            FileReader reader = new FileReader(NOMBRE_ARCHIVO);
            BufferedReader buffer = new BufferedReader(reader);
            datos=buffer.readLine();
            while((datos = buffer.readLine()) != null) // Ciclo que imprime cada una de las lineas, que se almacenan en la variable datos.
            {
                pers = datos.split(",");
                Animal persona1;
                persona1=new Animal(LocalDate.parse(pers[0]),pers[1],pers[2],pers[3]);
                personas.add(persona1);
                datos1=new String[personas.size()];
            }
            int i = 0;
            for (Animal obj : personas)
                datos1[i] = obj.toString();
            System.out.printf(datos1[i]);
            i++;


            reader.close();//se cierra el reader.
        }
        catch(IOException e)
        {
            e.printStackTrace();//se imprime la pila de llamadas para ver d�nde est� el error.
        }
        return datos1;

    }

    public void atenderAnimal(String id,String medicamento){
        ArrayList<Animal> personas = new ArrayList<>();
        String datos ;
        String []datos1=null;
        String[] pers =null;

        try
        {
            FileReader reader = new FileReader(NOMBRE_ARCHIVO);

            BufferedReader buffer = new BufferedReader(reader);
            while((datos = buffer.readLine()) != null) // Ciclo que imprime cada una de las lineas, que se almacenan en la variable datos.
            {
                pers = datos.split(",");
                Animal persona1;
                String fechaP=pers[4];
                if(fechaP.equals("null")){
                    persona1=new Animal(LocalDate.parse(pers[0]),pers[1],pers[2],pers[3]);
                }else{
                    persona1=new Animal(LocalDate.parse(pers[0]),pers[1],pers[2],pers[3],LocalDate.parse(pers[4]),pers[5]);
                }

                personas.add(persona1);
            }

            for (Animal obj : personas){
                if(obj.getNombre().equals(id)){
                    obj.setFecha(LocalDate.now());
                    obj.setMedicamento(medicamento);
                }

            }FileWriter fWriter = new FileWriter(NOMBRE_ARCHIVO);

            reader.close();//se cierra el reader.
            actualizar(personas);
        }
        catch(IOException e)
        {
            e.printStackTrace();//se imprime la pila de llamadas para ver d�nde est� el error.
        }
    }

    public void actualizar(ArrayList<Animal>animals){
        for (Animal obj : animals){
            agregarPersona(obj);

        }
    }
}
