package co.edu.unbosque.controller;

import co.edu.unbosque.model.DesertTreeDTO;
import co.edu.unbosque.model.InvernalTreeDTO;
import co.edu.unbosque.model.persistence.BushDAO;
import co.edu.unbosque.model.persistence.DesertTreeDAO;
import co.edu.unbosque.model.persistence.InvernalTreeDAO;
import co.edu.unbosque.model.persistence.TreeDAO;
import co.edu.unbosque.view.Console;

public class Controller {
	private TreeDAO tdao;
	private InvernalTreeDAO invtreedao;
	private DesertTreeDAO destreedao;
	private Console con;
	private BushDAO bushdao;

	public Controller() {
		tdao = new TreeDAO();
		invtreedao = new InvernalTreeDAO();
		destreedao = new DesertTreeDAO();
		con = new Console();
		bushdao = new BushDAO();

	}

	public void run() {

		mainloop: while (true) {

			con.impresionConSalto("-----PLANT ENCYCLOPEDIA------");
			con.impresionConSalto("");
			con.impresionConSalto("1. TREE");
			con.impresionConSalto("2. BUSH");
			con.impresionConSalto("3. EXIT");

			int opc = con.leerEntero();

			switch (opc) {
			case 1: {

				treeloop: while (true) {

					con.impresionConSalto("TREE MENU");
					con.impresionConSalto("1. TREE (GENERAL)");
					con.impresionConSalto("2. INVERNAL TREE");
					con.impresionConSalto("3. DESERT TREE");
					con.impresionConSalto("4. READ ALL TREES WITH INVERNAL TREES");
					con.impresionConSalto("5. READ ALL INVERNAL TREES AND DESERT TREES");
					con.impresionConSalto("6. BACK");

					int opctree = con.leerEntero();

					switch (opctree) {
					case 1: {

						generaltreeloop: while (true) {

							con.impresionConSalto("TREE IN GENERAL");
							con.impresionConSalto("1.CREATE");
							con.impresionConSalto("2.READ");
							con.impresionConSalto("3.UPDATE");
							con.impresionConSalto("4.DELETE");
							con.impresionConSalto("5.BACK");

							int opcgtree = con.leerEntero();

							switch (opcgtree) {
							case 1: {

								con.impresionConSalto("Please insert the name of the tree");
								con.quemarLinea();
								String name = con.leerLineaCompleta();
								con.impresionConSalto("Please insert the Scientific name of the tree");
								String scientificName = con.leerLineaCompleta();
								con.impresionConSalto("Please insert if it's floral (Y/N)");
								String isFloralTemp = con.leerLineaCompleta();
								boolean isFloral = true;
								if (isFloralTemp.equalsIgnoreCase("y") || isFloralTemp.equalsIgnoreCase("yes")) {
									isFloral = true;
								} else {
									isFloral = false;
								}
								con.impresionConSalto("Please insert the width of the log");
								float logWidth = con.leerFloat();

								tdao.create(name, scientificName, Boolean.toString(isFloral), Float.toString(logWidth));
								con.impresionConSalto("Tree created successfully");
								con.impresionConSalto("");

								break;
							}
							case 2: {

								con.impresionConSalto("All the trees");
								con.impresionConSalto(tdao.readAll());
								con.impresionConSalto("");

								break;
							}
							case 3: {

								con.impresionConSalto("Please insert the position of the tree you want to update");
								int index = con.leerEntero();

								con.impresionConSalto("Please insert the new name of the tree");
								con.quemarLinea();
								String name = con.leerLineaCompleta();
								con.impresionConSalto("Please insert the new Scientific name of the tree");
								String scientificName = con.leerLineaCompleta();
								con.impresionConSalto("Please insert if it's floral (Y/N)");
								String isFloralTemp = con.leerLineaCompleta();
								boolean isFloral = true;
								if (isFloralTemp.equalsIgnoreCase("y") || isFloralTemp.equalsIgnoreCase("yes")) {
									isFloral = true;
								} else {
									isFloral = false;
								}
								con.impresionConSalto("Please insert the new width of the log");
								float logWidth = con.leerFloat();

								tdao.update(index, name, scientificName, Boolean.toString(isFloral),
										Float.toString(logWidth));

								con.impresionConSalto("Tree updated successfully");
								con.impresionConSalto("");

								break;
							}
							case 4: {

								con.impresionConSalto("Please insert the position of the tree you want to delete");
								int index = con.leerEntero();
								tdao.delete(index);
								con.impresionConSalto("Tree deleted successfully");
								con.impresionConSalto("");
								break;
							}
							case 5: {

								con.impresionConSalto("");
								break generaltreeloop;
							}
							default:
								con.impresionConSalto("NOT A VALID OPTION BUDDY");
								break;

							}

						}
						break;
					}
					case 2: {
						invernaltreeloop: while (true) {

							con.impresionConSalto("INVERNAL TREE");
							con.impresionConSalto("1.CREATE");
							con.impresionConSalto("2.READ");
							con.impresionConSalto("3.UPDATE");
							con.impresionConSalto("4.DELETE");
							con.impresionConSalto("5.BACK");

							int opcgtree = con.leerEntero();

							switch (opcgtree) {
							case 1: {

								con.impresionConSalto("Please insert the name of the invernal tree");
								con.quemarLinea();
								String name = con.leerLineaCompleta();
								con.impresionConSalto("Please insert the Scientific name of the invernal tree");
								String scientificName = con.leerLineaCompleta();
								con.impresionConSalto("Please insert if it's floral (Y/N)");
								String isFloralTemp = con.leerLineaCompleta();
								boolean isFloral = true;
								if (isFloralTemp.equalsIgnoreCase("y") || isFloralTemp.equalsIgnoreCase("yes")) {
									isFloral = true;
								} else {
									isFloral = false;
								}
								con.impresionConSalto("Please insert the width of the log");
								float logWidth = con.leerFloat();
								con.impresionConSalto("Please insert the minimum temperature that the tree supports");
								float minTemperature = con.leerFloat();

								invtreedao.create(name, scientificName, Boolean.toString(isFloral),
										Float.toString(logWidth), Float.toString(minTemperature));

								InvernalTreeDTO nuevoI = new InvernalTreeDTO(name, scientificName, isFloral, logWidth,
										minTemperature);

								tdao.create(nuevoI);

								con.impresionConSalto("Invernal Tree created successfully");
								con.impresionConSalto("");

								break;
							}
							case 2: {

								con.impresionConSalto("All the invernal trees");
								con.impresionConSalto(invtreedao.readAll());
								con.impresionConSalto("");

								break;
							}
							case 3: {

								con.impresionConSalto(
										"Please insert the position of the invernal tree you want to update");
								int index = con.leerEntero();

								con.impresionConSalto("Please insert the name of the invernal tree");
								con.quemarLinea();
								String name = con.leerLineaCompleta();
								con.impresionConSalto("Please insert the Scientific name of the invernal tree");
								String scientificName = con.leerLineaCompleta();
								con.impresionConSalto("Please insert if it's floral (Y/N)");
								String isFloralTemp = con.leerLineaCompleta();
								boolean isFloral = true;
								if (isFloralTemp.equalsIgnoreCase("y") || isFloralTemp.equalsIgnoreCase("yes")) {
									isFloral = true;
								} else {
									isFloral = false;
								}
								con.impresionConSalto("Please insert the width of the log");
								float logWidth = con.leerFloat();
								con.impresionConSalto("Please insert the minimum temperature that the tree supports");
								float minTemperature = con.leerFloat();

								invtreedao.update(index, name, scientificName, Boolean.toString(isFloral),
										Float.toString(logWidth), Float.toString(minTemperature));

								con.impresionConSalto("Invernal Tree updated successfully");
								con.impresionConSalto("");

								break;
							}
							case 4: {

								con.impresionConSalto(
										"Please insert the position of the Invernal tree you want to delete");
								int index = con.leerEntero();
								invtreedao.delete(index);
								con.impresionConSalto("Invernal tree deleted successfully");
								con.impresionConSalto("");
								break;
							}
							case 5: {

								con.impresionConSalto("");
								break invernaltreeloop;
							}
							default:
								con.impresionConSalto("NOT A VALID OPTION BUDDY");
								break;

							}

						}

						break;
					}
					case 3: {
						deserttreeloop: while (true) {

							con.impresionConSalto("DESERT TREE");
							con.impresionConSalto("1.CREATE");
							con.impresionConSalto("2.READ");
							con.impresionConSalto("3.UPDATE");
							con.impresionConSalto("4.DELETE");
							con.impresionConSalto("5.BACK");

							int opcgtree = con.leerEntero();

							switch (opcgtree) {
							case 1: {

								con.impresionConSalto("Please insert the name of the desert tree");
								con.quemarLinea();
								String name = con.leerLineaCompleta();
								con.impresionConSalto("Please insert the Scientific name of the desert tree");
								String scientificName = con.leerLineaCompleta();
								con.impresionConSalto("Please insert if it's floral (Y/N)");
								String isFloralTemp = con.leerLineaCompleta();
								boolean isFloral = true;
								if (isFloralTemp.equalsIgnoreCase("y") || isFloralTemp.equalsIgnoreCase("yes")) {
									isFloral = true;
								} else {
									isFloral = false;
								}
								con.impresionConSalto("Please insert the width of the log");
								float logWidth = con.leerFloat();
								con.impresionConSalto("Please insert the maximum temperature that the tree supports");
								float maxTemperature = con.leerFloat();

								destreedao.create(name, scientificName, Boolean.toString(isFloral),
										Float.toString(logWidth), Float.toString(maxTemperature));

								DesertTreeDTO nuevoD = new DesertTreeDTO(name, scientificName, isFloral, logWidth,
										maxTemperature);

								tdao.create(nuevoD);

								con.impresionConSalto("Desert Tree created successfully");
								con.impresionConSalto("");

								break;
							}
							case 2: {

								con.impresionConSalto("All the desert trees");
								con.impresionConSalto(destreedao.readAll());
								con.impresionConSalto("");

								break;
							}
							case 3: {

								con.impresionConSalto(
										"Please insert the position of the desert tree you want to update");
								int index = con.leerEntero();

								con.impresionConSalto("Please insert the name of the desert tree");
								con.quemarLinea();
								String name = con.leerLineaCompleta();
								con.impresionConSalto("Please insert the Scientific name of the desert tree");
								String scientificName = con.leerLineaCompleta();
								con.impresionConSalto("Please insert if it's floral (Y/N)");
								String isFloralTemp = con.leerLineaCompleta();
								boolean isFloral = true;
								if (isFloralTemp.equalsIgnoreCase("y") || isFloralTemp.equalsIgnoreCase("yes")) {
									isFloral = true;
								} else {
									isFloral = false;
								}
								con.impresionConSalto("Please insert the width of the log");
								float logWidth = con.leerFloat();
								con.impresionConSalto("Please insert the minimum temperature that the tree supports");
								float maxTemperature = con.leerFloat();

								destreedao.update(index, name, scientificName, Boolean.toString(isFloral),
										Float.toString(logWidth), Float.toString(maxTemperature));

								con.impresionConSalto("Desert Tree updated successfully");
								con.impresionConSalto("");

								break;
							}
							case 4: {

								con.impresionConSalto(
										"Please insert the position of the Desert tree you want to delete");
								int index = con.leerEntero();
								destreedao.delete(index);
								con.impresionConSalto("Desert tree deleted successfully");
								con.impresionConSalto("");
								break;
							}
							case 5: {

								con.impresionConSalto("");
								break deserttreeloop;
							}
							default:
								con.impresionConSalto("NOT A VALID OPTION BUDDY");
								break;

							}

						}

						break;
					}
					case 4: {
						con.impresionConSalto("Here are all the Trees and Invernal trees");
						con.impresionConSalto(tdao.readAllWithInvernalTree());

						break;
					}
					case 5: {
						con.impresionConSalto("Here are all the Invernal trees and Desert trees");
						con.impresionConSalto(tdao.readInvernalTreeAndDesertTree());
						break;
					}

					case 6: {
						con.impresionConSalto("Getting back");
						break treeloop;

					}

					default:

						con.impresionConSalto("NOT A VALID OPTION BUDDY");
						break;

					}

				}
				break;
			}
			case 2: {
				bushloop: while (true) {

					con.impresionConSalto("BUSH");
					con.impresionConSalto("1.CREATE");
					con.impresionConSalto("2.READ");
					con.impresionConSalto("3.UPDATE");
					con.impresionConSalto("4.DELETE");
					con.impresionConSalto("5.BACK");

					int opcbush = con.leerEntero();

					switch (opcbush) {
					case 1: {

						con.impresionConSalto("Please insert the name of the bush");
						con.quemarLinea();
						String name = con.leerLineaCompleta();
						con.impresionConSalto("Please insert the Scientific name of the bush");
						String scientificName = con.leerLineaCompleta();
						con.impresionConSalto("Please insert if it's floral (Y/N)");
						String isFloralTemp = con.leerLineaCompleta();
						boolean isFloral = true;
						if (isFloralTemp.equalsIgnoreCase("y") || isFloralTemp.equalsIgnoreCase("yes")) {
							isFloral = true;
						} else {
							isFloral = false;
						}
						con.impresionConSalto("Please insert if it's venomous (Y/N)");
						String isPoisonousTemp = con.leerLineaCompleta();
						boolean isPoisonous = true;
						if (isPoisonousTemp.equalsIgnoreCase("y") || isPoisonousTemp.equalsIgnoreCase("yes")) {
							isPoisonous = true;
						} else {
							isPoisonous = false;
						}

						bushdao.create(name, scientificName, Boolean.toString(isFloral), Boolean.toString(isPoisonous));

						con.impresionConSalto("Bush created successfully");
						con.impresionConSalto("");

						break;
					}
					case 2: {

						con.impresionConSalto("All the shrubbery");
						con.impresionConSalto(bushdao.readAll());
						con.impresionConSalto("");

						break;
					}
					case 3: {

						con.impresionConSalto("Please insert the position of the bush you want to update");
						int index = con.leerEntero();

						con.impresionConSalto("Please insert the name of the bush");
						con.quemarLinea();
						String newName = con.leerLineaCompleta();
						con.impresionConSalto("Please insert the Scientific name of the bush");
						String newScientificName = con.leerLineaCompleta();
						con.impresionConSalto("Please insert if it's floral (Y/N)");
						String isFloralTemp = con.leerLineaCompleta();
						boolean newIsFloral = true;
						if (isFloralTemp.equalsIgnoreCase("y") || isFloralTemp.equalsIgnoreCase("yes")) {
							newIsFloral = true;
						} else {
							newIsFloral = false;
						}
						con.impresionConSalto("Please insert if it's venomous (Y/N)");
						String isPoisonousTemp = con.leerLineaCompleta();
						boolean newIsPoisonous = true;
						if (isPoisonousTemp.equalsIgnoreCase("y") || isPoisonousTemp.equalsIgnoreCase("yes")) {
							newIsPoisonous = true;
						} else {
							newIsPoisonous = false;
						}

						bushdao.update(index, newName, newScientificName, Boolean.toString(newIsFloral),
								Boolean.toString(newIsPoisonous));

						con.impresionConSalto("Bush updated successfully");
						con.impresionConSalto("");
						break;
					}
					case 4: {

						con.impresionConSalto("Please insert the position of the bush you want to delete");
						int index = con.leerEntero();
						bushdao.delete(index);
						con.impresionConSalto("Bush deleted successfully");
						con.impresionConSalto("");
						break;
					}
					case 5: {

						con.impresionConSalto("");
						break bushloop;
					}
					default:
						con.impresionConSalto("NOT A VALID OPTION BUDDY");
						break;

					}

				}
				break;
			}

			case 3: {
				con.impresionConSalto("Thanks for using the encyclopedia");
				con.impresionConSalto("GOODBYE");
				break mainloop;
			}
			default:

				con.impresionConSalto("Sorry buddy not a valida option");
				break;

			}

		}

	}

}
