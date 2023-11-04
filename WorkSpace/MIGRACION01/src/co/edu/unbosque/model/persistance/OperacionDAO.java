package co.edu.unbosque.model.persistance;

public interface OperacionDAO {
	
	public void crear(String... args);

	public boolean eliminar(int index);

	public boolean actualizar(int index, String... args);

	public String mostrar();

}
