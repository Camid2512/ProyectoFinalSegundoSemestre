package co.edu.unbosque.model.persistence;

public interface CRUDOperation {

	public void create(String... attrbs);

	public String read();

}
