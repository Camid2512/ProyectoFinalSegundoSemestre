package co.edu.unbosque.model.persistence;

public interface CRUDOperation {

	public void create(String... strs);

	public void create(Object o);

	public String readAll();

	public boolean update(int index, String... newData);

	public boolean delete(int index);

	public boolean delete(Object o);

}
