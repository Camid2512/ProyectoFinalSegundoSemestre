package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.DesertTreeDTO;
import co.edu.unbosque.model.InvernalTreeDTO;
import co.edu.unbosque.model.TreeDTO;

public class TreeDAO implements CRUDOperation {
	private ArrayList<TreeDTO> trees;

	public TreeDAO() {
		trees = new ArrayList<>();
	}

	@Override
	public void create(String... strs) {
		TreeDTO temp = new TreeDTO();
		temp.setName(strs[0]);
		temp.setScientificName(strs[1]);
		temp.setFloral(Boolean.parseBoolean(strs[2]));
		temp.setLogWidth(Float.parseFloat(strs[3]));
		trees.add(temp);
	}

	@Override
	public void create(Object o) {
		trees.add((TreeDTO) o);
	}

	int index = 0;

	@Override
	public String readAll() {
		index = 0;
		StringBuilder sb = new StringBuilder();
		trees.forEach(tree -> {
			sb.append(index + "->" + (tree.toString()));
			index++;
		});
		return sb.toString();
	}

	@Override
	public boolean update(int index, String... newData) {
		if (index < 0 || index >= trees.size()) {
			return false;
		} else {
			if (!newData[0].isBlank() || newData[0] != null) {
				trees.get(index).setName(newData[0]);
			}
			if (!newData[1].isBlank() || newData[1] != null) {
				trees.get(index).setScientificName(newData[1]);
			}
			if (!newData[2].isBlank() || newData[2] != null) {

				trees.get(index).setFloral(Boolean.valueOf(newData[2]));
			}
			if (!newData[3].isBlank() || newData[3] != null) {

				trees.get(index).setLogWidth(Float.parseFloat(newData[3]));
			}
			return true;
		}

	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= trees.size()) {
			return false;
		} else {
			trees.remove(index);
			return true;
		}
	}

	@Override
	public boolean delete(Object o) {
		if (o == null) {
			return false;
		} else if (trees.remove((TreeDTO) o)) {
			return true;
		} else {
			return false;
		}
	}

	public String readAllWithInvernalTree() {
		String printable = "";
		for (int i = 0; i < trees.size(); i++) {
			TreeDTO temp = trees.get(i);
			if (temp instanceof InvernalTreeDTO) {
				InvernalTreeDTO invernalTemp = (InvernalTreeDTO) temp;
				printable += invernalTemp.toString();
			} else if (temp instanceof TreeDTO) {
				printable += temp.toString();
			}
		}
		return printable;
	}

	public String readInvernalTreeAndDesertTree() {

		String printable = "";

		for (int i = 0; i < trees.size(); i++) {

			TreeDTO temp = trees.get(i);
			if (temp instanceof InvernalTreeDTO) {

				InvernalTreeDTO invernalTemp = (InvernalTreeDTO) temp;
				printable += invernalTemp.toString();

			} else if (temp instanceof DesertTreeDTO) {

				DesertTreeDTO desertTemp = (DesertTreeDTO) temp;
				printable += desertTemp.toString();

			}

		}
		return printable;

	}

}
