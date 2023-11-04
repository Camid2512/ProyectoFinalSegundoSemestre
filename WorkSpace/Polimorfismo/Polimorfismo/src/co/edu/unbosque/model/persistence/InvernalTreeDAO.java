package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.InvernalTreeDTO;

public class InvernalTreeDAO implements CRUDOperation {
	private ArrayList<InvernalTreeDTO> invernalTrees;

	public InvernalTreeDAO() {
		invernalTrees = new ArrayList<>();
	}

	@Override
	public void create(String... strs) {
		InvernalTreeDTO temp = new InvernalTreeDTO();
		temp.setName(strs[0]);
		temp.setScientificName(strs[1]);
		temp.setFloral(Boolean.parseBoolean(strs[2]));
		temp.setLogWidth(Float.parseFloat(strs[3]));
		temp.setMinTemperature(Float.parseFloat(strs[4]));
		invernalTrees.add(temp);
	}

	@Override
	public void create(Object o) {
		invernalTrees.add((InvernalTreeDTO) o);
	}

	int index = 0;

	@Override
	public String readAll() {
		index = 0;
		StringBuilder sb = new StringBuilder();
		invernalTrees.forEach(invernalTree -> {
			sb.append(index + "->" + (invernalTree.toString()));
			index++;
		});
		return sb.toString();
	}

	@Override
	public boolean update(int index, String... newData) {
		if (index < 0 || index >= invernalTrees.size()) {
			return false;
		} else {
			if (!newData[0].isBlank() || newData[0] != null) {
				invernalTrees.get(index).setName(newData[0]);
			}
			if (!newData[1].isBlank() || newData[1] != null) {
				invernalTrees.get(index).setScientificName(newData[1]);
			}
			if (!newData[2].isBlank() || newData[2] != null) {
				invernalTrees.get(index).setFloral(Boolean.parseBoolean(newData[2]));
			}
			if (!newData[3].isBlank() || newData[3] != null) {
				invernalTrees.get(index).setLogWidth(Float.parseFloat(newData[3]));
			}
			if (!newData[3].isBlank() || newData[3] != null) {
				invernalTrees.get(index).setMinTemperature(Float.parseFloat(newData[4]));
			}

			return true;
		}

	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= invernalTrees.size()) {
			return false;
		} else {
			invernalTrees.remove(index);
			return true;
		}
	}

	@Override
	public boolean delete(Object o) {
		if (o == null) {
			return false;
		} else if (invernalTrees.remove((InvernalTreeDTO) o)) {
			return true;
		} else {
			return false;
		}
	}

}
