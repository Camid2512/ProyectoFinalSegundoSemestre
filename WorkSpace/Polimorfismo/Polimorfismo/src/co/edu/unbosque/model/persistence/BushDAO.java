package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.BushDTO;

public class BushDAO implements CRUDOperation {

	private ArrayList<BushDTO> shrubbery;

	public BushDAO() {

		shrubbery = new ArrayList<>();

	}

	@Override
	public void create(String... strs) {

		BushDTO temp = new BushDTO();

		temp.setName(strs[0]);
		temp.setScientificName(strs[1]);
		temp.setFloral(Boolean.parseBoolean(strs[2]));
		temp.setPoisonous(Boolean.parseBoolean(strs[3]));

		shrubbery.add(temp);
	}

	@Override
	public void create(Object o) {

		shrubbery.add((BushDTO) o);

	}

	int index = 0;

	@Override
	public String readAll() {

		index = 0;
		StringBuilder sb = new StringBuilder();
		shrubbery.forEach(shrubberry -> {
			sb.append(index + "->" + (shrubberry.toString()));
			index++;
		});
		return sb.toString();
	}

	@Override
	public boolean update(int index, String... newData) {

		if (index < 0 || index >= shrubbery.size()) {
			return false;
		} else {
			if (!newData[0].isBlank() || newData[0] != null || !newData[0].isEmpty() || !newData[0].equals("")) {

				shrubbery.get(index).setName(newData[0]);

			}
			if (!newData[1].isBlank() || newData[1] != null || !newData[1].isEmpty() || !newData[1].equals("")) {
				shrubbery.get(index).setScientificName(newData[1]);
			}
			if (!newData[2].isBlank() || newData[2] != null || !newData[2].isEmpty() || !newData[2].equals("")) {
				shrubbery.get(index).setFloral(Boolean.parseBoolean(newData[2]));
			}
			if (!newData[3].isBlank() || newData[3] != null || !newData[3].isEmpty() || !newData[3].equals("")) {
				shrubbery.get(index).setPoisonous(Boolean.parseBoolean(newData[3]));
			}
			return true;
		}

	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= shrubbery.size()) {
			return false;
		} else {
			shrubbery.remove(index);
			return true;
		}
	}

	@Override
	public boolean delete(Object o) {
		if (o == null) {
			return false;
		} else if (shrubbery.remove((BushDTO) o)) {
			return true;
		} else {
			return false;
		}
	}
}
