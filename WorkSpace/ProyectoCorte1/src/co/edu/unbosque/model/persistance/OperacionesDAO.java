package co.edu.unbosque.model.persistance;

public interface OperacionesDAO {

	public void crear(String... args);

	public boolean eliminar(int index);

	public void actualizar(int index, String... args);

	public String mostrar();

}
