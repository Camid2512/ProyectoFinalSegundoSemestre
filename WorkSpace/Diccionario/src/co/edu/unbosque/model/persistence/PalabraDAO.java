package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.PalabraDTO;

public class PalabraDAO implements CRUDOperation {

	private ArrayList<PalabraDTO> listaPalabras;

	public PalabraDAO() {
		// TODO Auto-generated constructor stub

		listaPalabras = new ArrayList<PalabraDTO>();

	}

	@Override
	public void create(String... attrbs) {
		// TODO Auto-generated method stub
		PalabraDTO nuevaPalabra = new PalabraDTO();

		nuevaPalabra.setPalabra(attrbs[0]);
		nuevaPalabra.setSignificado(attrbs[1]);

		listaPalabras.add(nuevaPalabra);
	}

	int index = 0;

	@Override
	public String read() {

		index = 0;
		StringBuilder sb = new StringBuilder();
		listaPalabras.forEach(palabra -> {
			sb.append(index + " --> " + (palabra.toString() + "\n"));
			index++;
		});

		return sb.toString();
	}

	public String searchAndReadByIndex(int index) {

		String nombreS = "";
		String significadoS = "";
		String nombreP = "";
		String significadoP = "";
		String nombreL = "";
		String significadoL = "";
		String nombreG = "";
		String significadoG = "";
		String nombreE = "";
		String significadoE = "";
		if (index > listaPalabras.size() || index <= 0 || index > 40) {
			return "OUT OF BOUNDS";

		} else {
			nombreS = listaPalabras.get(index - 1).getPalabra();
			significadoS = listaPalabras.get(index - 1).getSignificado();
			nombreP = listaPalabras.get(index + 39).getPalabra();
			significadoP = listaPalabras.get(index + 39).getSignificado();
			nombreL = listaPalabras.get(index + 79).getPalabra();
			significadoL = listaPalabras.get(index + 79).getSignificado();
			nombreG = listaPalabras.get(index + 119).getPalabra();
			significadoG = listaPalabras.get(index + 119).getSignificado();
			nombreE = listaPalabras.get(index + 159).getPalabra();
			significadoE = listaPalabras.get(index + 159).getSignificado();
			return nombreS + ":" + significadoS + "\n" + nombreP + ":" + significadoP + "\n" + nombreL + ":"
					+ significadoL + "\n" + nombreG + ":" + significadoG + "\n" + nombreE + ":" + significadoE;
		}
	}
}
