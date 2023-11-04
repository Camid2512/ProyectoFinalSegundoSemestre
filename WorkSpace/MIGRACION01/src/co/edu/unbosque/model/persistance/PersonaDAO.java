package co.edu.unbosque.model.persistance;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import co.edu.unbosque.model.PersonaDTO;

public class PersonaDAO implements OperacionDAO{
	
	private ArrayList<PersonaDTO> lista;

	public PersonaDAO() {

		lista = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(String... args) {
		// TODO Auto-generated method stub

		long numDocumentoTemp = Long.parseLong(args[0]);
		String nombreCompletoTemp = args[1];
		int diaNacimientoTemp = Integer.parseInt(args[2]);
		int mesNacimientoTemp = Integer.parseInt(args[3]);
		int anoNacimientoTemp = Integer.parseInt(args[4]);
		String paisTemp = args[5];
		String ciudadOrigenTemp = args[6];

		lista.add(new PersonaDTO(numDocumentoTemp, nombreCompletoTemp, diaNacimientoTemp, mesNacimientoTemp,
				anoNacimientoTemp, paisTemp, ciudadOrigenTemp));

	}

	@Override
	public boolean eliminar(int index) {
		// TODO Auto-generated method stub
		if (index < 0 || index >= lista.size()) {
			return false;
		} else {
			lista.remove(index);
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, String... args) {
		if (index < 0 || index >= lista.size()) {
			return false;
		} else {
			lista.get(index).setNumDocumento(Integer.parseInt(args[0]));
			lista.get(index).setNombreCompleto(args[1]);
			lista.get(index).setDia(Integer.parseInt(args[2]));
			lista.get(index).setMes(Integer.parseInt(args[3]));
			lista.get(index).setAno(Integer.parseInt(args[4]));
			lista.get(index).setPais(args[5]);
			lista.get(index).setCiudadOrigen(args[6]);
			return true;
		}
		// TODO Auto-generated method stub
	}

	@Override
	public String mostrar() {

		String salida = "";
		for (PersonaDTO personaDTO : lista) {

			salida += personaDTO.toString();

		}

		// TODO Auto-generated method stub
		return salida;
	}

	public String calcularEdad(int dia, int mes, int ano) {

		LocalDate fechaActual = LocalDate.now();
		LocalDate fechaNacimiento = LocalDate.of(ano, mes, dia);

		Period edad = Period.between(fechaNacimiento, fechaActual);

		return String.format("%d anos, %d meses, % dias", edad.getYears(), edad.getMonths(), edad.getDays());
	}

}
