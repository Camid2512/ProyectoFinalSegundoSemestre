package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.NoAdmitidoDTO;

public class NoAdmitidoDAO implements OperacionDAO {

	private ArrayList<NoAdmitidoDTO> lista;

	public NoAdmitidoDAO() {

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
		String ciudadDevolucionTemp = args[7];
		int diaDevolucionTemp = Integer.parseInt(args[8]);
		int mesDevolucionTemp = Integer.parseInt(args[9]);
		int anoDevolucionTemp = Integer.parseInt(args[10]);
		String motivoExpulsionTemp = args[11];

		lista.add(new NoAdmitidoDTO(numDocumentoTemp, nombreCompletoTemp, diaNacimientoTemp, mesNacimientoTemp,
				anoNacimientoTemp, paisTemp, ciudadOrigenTemp, ciudadDevolucionTemp, diaDevolucionTemp,
				mesDevolucionTemp, anoDevolucionTemp, motivoExpulsionTemp));

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
			lista.get(index).setCiudadDevolucion(args[7]);
			lista.get(index).setDiaExpulsion(Integer.parseInt(args[8]));
			lista.get(index).setMesExpulsion(Integer.parseInt(args[9]));
			lista.get(index).setAnoExpulsion(Integer.parseInt(args[10]));
			lista.get(index).setMotivoExpulsion(args[11]);
			return true;
		}
	}

	@Override
	public String mostrar() {

		String salida = "";

		for (NoAdmitidoDTO noAdmitidoDTO : lista) {

			salida += noAdmitidoDTO.toString();

		}

		// TODO Auto-generated method stub
		return salida;
	}

}
