import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<Libro> listaLibros = new ArrayList();
		ArrayList<Pelicula> listaPeliculas = new ArrayList();
		while (opcion != 4) {
			opcion = 0;
			while (opcion == 0) {
				System.out.println(
						"Introduzca la acción deseada:\n 1-Introducir datos adicionales\n 2-Mostrar Datos\n 3-Eliminar Datos\n 4-Exit");
				try {
					opcion = sc.nextInt();
				} catch (InputMismatchException ex) {
					System.out.println("Error la introduccion de la opcion debe ser un numero o distinto de 0");
					sc.nextLine();
				}
			}
			switch (opcion) {
			case 1:
				int añadir = 0;
				while (añadir == 0) {
					System.out.println("1-Añadir libro\n2-Añadir pelicula");
					try {
						añadir = sc.nextInt();
					} catch (InputMismatchException ex) {
						System.out.println("Error la introduccion de la opcion debe ser un numero o distinto de 0");
						sc.nextLine();
					}
				}
				switch (añadir) {
				case 1:
					Libro l = Libro.obtenerLibro();
					listaLibros.add(l);
					break;
					
				case 2:
					Pelicula p = Pelicula.obtenerPelicula();
					listaPeliculas.add(p);
					break;

				default:
					System.out.println("No existe esta opción");
					break;

				}
				break;

			case 2:
				for (Libro lib : listaLibros) {
					lib.mostrarDatos();
				}

				for (Pelicula pel : listaPeliculas) {
					pel.mostrarDatos();
				}
				break;

			case 3:
				int eliminar = 0;
				while (eliminar == 0) {
					System.out.println("1-Eliminar libro\n2-Eliminar pelicula");
					try {
						eliminar = sc.nextInt();
					} catch (InputMismatchException ex) {
						System.out.println("Error la introduccion de la opcion debe ser un numero o distinto de 0");
						sc.nextLine();
					}
				}
				switch (eliminar) {
				case 1:
					String nombreLib = Libro.obtenerTitulo();
					for (Libro lib : listaLibros) {
						if (lib.getTitulo().equals(nombreLib)) {
							listaLibros.remove(lib);
						}
					}
					for (Libro lib : listaLibros) {
						lib.mostrarDatos();
					}
					break;
					
				case 2:
					String nombrePel = Pelicula.obtenerTitulo();
					for (Pelicula pel : listaPeliculas) {
						if (pel.getTitulo().equals(nombrePel)) {
							listaPeliculas.remove(pel);
						}
					}
					for (Pelicula pel : listaPeliculas) {
						pel.mostrarDatos();
					}
					break;

				default:
					System.out.println("No existe esta opción");
					break;
				}

				break;

			case 4:
				System.out.println("Adios.");
				break;

			default:
				System.out.println("No existe esta opción");
				break;
			}
		}
		sc.close();
	}
}