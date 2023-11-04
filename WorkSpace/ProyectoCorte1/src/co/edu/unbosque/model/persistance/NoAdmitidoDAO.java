package co.edu.unbosque.model.persistance;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;

import co.edu.unbosque.model.NoAdmitidoDTO;
import co.edu.unbosque.model.PersonaDTO;

public class NoAdmitidoDAO implements OperacionesDAO {

	private ArrayList<NoAdmitidoDTO> lista;

	public NoAdmitidoDAO() {

		lista = new ArrayList<NoAdmitidoDTO>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(String... args) {
		// TODO Auto-generated method stub

		LocalDate hoy = LocalDate.now();
		// es necesario crear una variable LocalDate que tiene la fecha de hoy
		// ya que a partir de esta se puede conocer el intervalo entre la fecha de
		// nacimiento y la fecha de hoy
		String documentoTemp = args[0];
		String fechaNacimientoTemp = args[1];
		LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoTemp);
		int edadExactaTemp = Period.between(fechaNacimiento, hoy).getYears();
		// con period.between obtenemos el intervalo entre las fechas ingresadas
		String[] palabras = args[2].split(" ");
		int numeroPalabras = palabras.length;
		String nombreCompletoTemp = "";
		String paisOrigenTemp = "";
		String ciudadOrigenTemp = "";
		if (numeroPalabras >= 6) {
		} else {

			// lo anterior está hecho para crear un array que contiene el String ingresado,
			// luego con la funcion Split busca cuantos espacios en blanco hay para así
			// saber cuantas palabras hay

			nombreCompletoTemp = Arrays.toString(palabras);// se guarda el array en un toString y luego en un
															// String
			paisOrigenTemp = args[3];
			ciudadOrigenTemp = args[4];

		}
		String ciudadExpulsionTemp = args[5];
		String fechaExpulsionTemp = args[6];
		LocalDate fechaExpulsion = LocalDate.parse(args[6]);

		String motivoExpulsionTemp = args[7];

		lista.add(new NoAdmitidoDTO(documentoTemp, fechaNacimientoTemp, edadExactaTemp, nombreCompletoTemp,
				paisOrigenTemp, ciudadOrigenTemp, ciudadExpulsionTemp, fechaExpulsionTemp, motivoExpulsionTemp));

	}

	@Override
	public boolean eliminar(int index) {
		// TODO Auto-generated method stub
		if (index < 0 || index >= lista.size()) {
			return false;

		} else {
			lista.remove(index);
		}
		return true;

	}

	@Override
	public void actualizar(int index, String... args) {
		// TODO Auto-generated method stub
		LocalDate hoy = LocalDate.now();

		lista.get(index).setDocumento(args[0]);
		lista.get(index).setFechaNacimiento(args[1]);
		lista.get(index).setEdadExacta(Period.between(LocalDate.parse(args[1]), hoy).getYears());

		String[] palabras = args[2].split(" ");
		int numeroPalabras = palabras.length;
		if (numeroPalabras >= 6) {
		}
		String nombreCompletoTemp = Arrays.toString(palabras);

		lista.get(index).setNombreCompleto(nombreCompletoTemp);
		lista.get(index).setPaisOrigen(args[3]);
		lista.get(index).setCiudadOrigen(args[4]);
		lista.get(index).setCiudadExpulsion(args[5]);
		lista.get(index).setFechaExpulsion(args[6]);
		lista.get(index).setMotivoExpulsion(args[7]);

	}

	@Override
	public String mostrar() {
		// TODO Auto-generated method stub
		String salida = "";
		for (PersonaDTO PersonaDTO : lista) {
			salida += PersonaDTO.toString();

		}
		return super.toString() + salida;
	}

}
