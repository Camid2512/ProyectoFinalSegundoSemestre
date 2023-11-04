package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.DesertTreeDTO;

public class DesertTreeDAO implements CRUDOperation {

	private ArrayList<DesertTreeDTO> desertTrees;

	public DesertTreeDAO() {

		desertTrees = new ArrayList<DesertTreeDTO>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create(String... strs) {
		// TODO Auto-generated method stub

		DesertTreeDTO temp = new DesertTreeDTO();
		temp.setName(strs[0]);
		temp.setScientificName(strs[1]);
		temp.setFloral(Boolean.parseBoolean(strs[2]));
		temp.setLogWidth(Float.parseFloat(strs[3]));
		temp.setMaxTemperature(Float.parseFloat(strs[4]));
		desertTrees.add(temp);

	}

	@Override
	public void create(Object o) {
		// TODO Auto-generated method stub

		desertTrees.add((DesertTreeDTO) o);

	}

	int index = 0;

	@Override
	public String readAll() {
		// TODO Auto-generated method stub
		index = 0;
		StringBuilder sb = new StringBuilder();
		desertTrees.forEach(desertTree -> {
			sb.append(index + "->" + (desertTree.toString()));
			index++;
		});
		return sb.toString();
	}

	@Override
	public boolean update(int index, String... newData) {
		if (index < 0 || index >= desertTrees.size()) {
			return false;
		} else {
			if (!newData[0].isBlank() || newData[0] != null) {
				desertTrees.get(index).setName(newData[0]);
			}
			if (!newData[1].isBlank() || newData[1] != null) {
				desertTrees.get(index).setScientificName(newData[1]);
			}
			if (!newData[2].isBlank() || newData[2] != null) {
				desertTrees.get(index).setFloral(Boolean.parseBoolean(newData[2]));
			}
			if (!newData[3].isBlank() || newData[3] != null) {
				desertTrees.get(index).setLogWidth(Float.parseFloat(newData[3]));
			}
			if (!newData[3].isBlank() || newData[3] != null) {
				desertTrees.get(index).setMaxTemperature(Float.parseFloat(newData[4]));
			}

			return true;
		}
	}

	@Override
	public boolean delete(int index) {
		// TODO Auto-generated method stub
		if (index < 0 || index >= desertTrees.size()) {
			return false;
		} else {

			desertTrees.remove(index);
			return true;

		}

	}

	@Override
	public boolean delete(Object o) {
		// TODO Auto-generated method stub
		if (o == null) {
			return false;
		} else if (desertTrees.remove((DesertTreeDTO) o)) {
			return true;
		} else {

			return false;
		}

	}

}
