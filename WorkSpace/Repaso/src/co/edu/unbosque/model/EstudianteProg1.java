package co.edu.unbosque.model;

public class EstudianteProg1 {

	private String nombre;
	private int edad;
	private long cedula;
	private boolean esMujer;
	private int semestre;
	
	public EstudianteProg1() {
		// TODO Auto-generated constructor stub
	}
	
	public EstudianteProg1(String nombre, int edad, long cedula, boolean esMujer, int semestre) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.cedula = cedula;
		this.esMujer = esMujer;
		this.semestre = semestre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public long getCedula() {
		return cedula;
	}

	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

	public boolean isEsMujer() {
		return esMujer;
	}

	public void setEsMujer(boolean esMujer) {
		this.esMujer = esMujer;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	public String cancelarMateria(boolean perdida) {

	if (perdida) {
		return "Pos nada toco repetirla";
	}else {
		return "Venga esa programacion web";
	}
		
	}
	//PARA SACAR ESTO ES CON CONTROL ESPACIO
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
	StringBuilder cadena = new StringBuilder();
	cadena.append("Nombre: " + nombre + "\n");
	cadena.append("Edad: " + edad + "\n");
	cadena.append("Cedula: " + cedula + "\n");
	cadena.append("Genero: " + (esMujer?"mujer":"hombre") + "\n"); //operador ternario luego de la pregunta se presenta la verdadera, despues de ":" la falsa
	cadena.append("Semestre: " + semestre + "\n");
	
	return cadena.toString();
	}
	
}
