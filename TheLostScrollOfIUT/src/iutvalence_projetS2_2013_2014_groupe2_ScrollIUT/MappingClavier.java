package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Classe permettant de d�finir les touches de d�placements du personnage.
 *
 */
public class MappingClavier {
	/** Mapping d'une touche */
	private final Map<String, Mouvement> mappings;

	
	
	/* Peut-�tre qu'il faudra ajouter des touches pour s�lectionn� en jeu. 
	 * Est-ce que l'on propose au joueur de choisir les touches � utiliser ou non avant le d�but d'une partie ?
	 */
	
	/** D�finition du mapping des touches. */
	public MappingClavier() {
		this.mappings = new HashMap<String, Mouvement>(4);
		mappings.put("z", Mouvement.HAUT);
		mappings.put("q", Mouvement.GAUCHE);
		mappings.put("s", Mouvement.BAS);
		mappings.put("d", Mouvement.DROITE);
		/*mappings.put("VK_RIGHT", Mouvement.DROITE);*/
		

	}

	/**
	 * @return Permet de v�rifier si la touche taper est valide pour un
	 *         d�placement.
	 */
	public Mouvement parseMouvement(String nextLine) {
		Mouvement mvt = mappings.get(nextLine);
		return mvt == null ? Mouvement.FIXE : mvt;
	}
}
