import java.util.Scanner;

public class Pelicula extends Libro {
	private String actoresDestacados;
	private String Director;
	
	public Pelicula(String Titulo, String Director, String actoresDestacados, String fechadePublicacion ) {
		this.setTitulo(Titulo);
		this.setFechadePublicacion(fechadePublicacion);
		this.setAutor(Director);;
		this.actoresDestacados=actoresDestacados;
	}
	
	public String getActoresDestacados() {
		return actoresDestacados;
	}
	
	public void setActoresDestacados(String actoresDestacados) {
		this.actoresDestacados = actoresDestacados;
	}
	
	public String getDirector() {
		return Director;
	}
	
	public void setDirector(String director) {
		Director = director;
	}
	
	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.printf("Actores Destacados:%s\n",actoresDestacados);
	}
	
	public static Pelicula obtenerPelicula() {
		Pelicula p;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los datos de la pelicula");
		System.out.println("Titulo: ");
		String titulo = sc.nextLine();
		System.out.println("Director: ");
		String Autor = sc.nextLine();
		System.out.println("Fecha de estreno: ");
		String fechadePublicacion = sc.nextLine();
		System.out.println("Actores destacados: ");
		String actoresDestacados = sc.nextLine();

		p = new Pelicula(titulo, Autor, fechadePublicacion, actoresDestacados);
		return p;
	}

}