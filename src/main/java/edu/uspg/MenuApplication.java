package edu.uspg;

import java.util.Iterator;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MenuApplication {

	public static void main(String[] args) {
		SpringApplication.run(MenuApplication.class, args);
		
		//ingrese nombres:
		//ingrese apellidos:
		//ingrese telefono:
		
		//id	nombres 	apellidos	 telefono
		//1		marco		polo		 34165806
		
		Scanner scn = new Scanner(System.in);
		
		int opcion = 0;
		//int cantidad = 0;
		String[] nombres = new String[1];
		String[] apellidos = new String[1];
		int[] telefono = new int[1];
		
		
		
		do {
			
			System.out.println(" ");
			System.out.println("\t ---Menú para registrar datos---");
			System.out.println("Escriba el número de la acción a realizar");
			System.out.println("1. Ingresar datos Alumnos");
			System.out.println("2. Listado Alumnos");
			System.out.println("3. Actualizar datos");
			System.out.println("4. Salir");
			System.out.print("--Opción:");
			opcion = scn.nextInt();
			
			switch (opcion) {
			
			case 1:
				
				System.out.println("Por favor ingrese los datos solicitados:");
				
				for (int i = 0; i < 1; i++) {
					System.out.print("Nombre: ");
					nombres[i] = scn.next();
					System.out.print("Apellido: ");
					apellidos[i] = scn.next();
					System.out.print("Telefono: ");
					telefono[i] = scn.nextInt();										
				}
				
				break;
				
			case 2:
				
				System.out.println("\t---Listado---");
				
				for (int i = 0; i < telefono.length; i++) {
					
					System.out.println("Nombres \t Apellidos \t Telefonos");
					System.out.println(nombres[i]+" \t\t "+apellidos[i]+" \t  "+telefono[i]);
					
				}
				
				break;
				
			case 3:
				
				System.out.println("---Modificar Datos---");
				
			}
			
			
			
		} while (opcion != 4);
		
		
	}

}
