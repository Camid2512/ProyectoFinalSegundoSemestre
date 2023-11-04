package co.edu.unbosque.model.persistence;

import java.time.LocalDate;
import java.util.ArrayList;

import co.edu.unbosque.model.AdmitidoDTO;

public class AdmitidoDAO implements OperacionDAO {

	private ArrayList<AdmitidoDTO> lista;

	public AdmitidoDAO() {

		lista = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(String... args) {

		long numDocumentoTemp = Long.parseLong(args[0]);
		String nombreCompletoTemp = args[1];
		int diaNacimientoTemp = Integer.parseInt(args[2]);
		int mesNacimientoTemp = Integer.parseInt(args[3]);
		int anoNacimientoTemp = Integer.parseInt(args[4]);
		String paisTemp = args[5];
		String ciudadOrigenTemp = args[6];
		int diaEntradaTemp = Integer.parseInt(args[7]);
		int mesEntradaTemp = Integer.parseInt(args[8]);
		int anoEntradaTemp = Integer.parseInt(args[9]);
		int horaEntradaTemp = Integer.parseInt(args[10]);
		int minutoEntradaTemp = Integer.parseInt(args[11]);
		int diasEstadiaTemp = Integer.parseInt(args[12]);
		LocalDate fechaSalidaTemp = LocalDate.parse(args[13]);
		int edadTemp = Integer.parseInt(args[14]);

		lista.add(new AdmitidoDTO(numDocumentoTemp, nombreCompletoTemp, diaNacimientoTemp, mesNacimientoTemp,
				anoNacimientoTemp, paisTemp, ciudadOrigenTemp, diaEntradaTemp, mesEntradaTemp, anoEntradaTemp,
				horaEntradaTemp, minutoEntradaTemp, diasEstadiaTemp, fechaSalidaTemp, edadTemp));

		// TODO Auto-generated method stub

	}

	@Override
	public boolean eliminar(int index) {

		if (index < 0 || index >= lista.size()) {
			return false;
		} else {
			lista.remove(index);
			return true;
		}
		// TODO Auto-generated method stub
	}

	@Override
	public boolean actualizar(int index, String... args) {
		// TODO Auto-generated method stub
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
			lista.get(index).setDiaEntrada(Integer.parseInt(args[7]));
			lista.get(index).setMesEntrada(Integer.parseInt(args[8]));
			lista.get(index).setAnoEntrada(Integer.parseInt(args[9]));
			lista.get(index).setHoraEntrada(Integer.parseInt(args[10]));
			lista.get(index).setMinutoEntrada(Integer.parseInt(args[11]));
			lista.get(index).setDiasEstadia(Integer.parseInt(args[12]));
			lista.get(index).setFechaSalida(LocalDate.parse(args[13]));
			lista.get(index).setEdad(Integer.parseInt(args[14]));
			return true;
		}

	}

	@Override
	public String mostrar() {

		String salida = "";
		for (AdmitidoDTO admitidoDTO : lista) {

			salida += admitidoDTO.toString();

		}
		// TODO Auto-generated method stub
		return salida;
	}

}
