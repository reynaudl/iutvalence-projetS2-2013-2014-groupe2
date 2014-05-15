package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Classe permettant de définir les touches de déplacements du personnage.
 *
 */
public class MappingClavier {
	/** Mapping d'une touche */
	private final Map<String, Mouvement> mappings;

	
	
	/* Peut-être qu'il faudra ajouter des touches pour sélectionné en jeu. 
	 * Est-ce que l'on propose au joueur de choisir les touches à utiliser ou non avant le début d'une partie ?
	 */
	
	/** Définition du mapping des touches. */
	public MappingClavier() {
		this.mappings = new HashMap<String, Mouvement>(4);
		mappings.put("z", Mouvement.HAUT);
		mappings.put("q", Mouvement.GAUCHE);
		mappings.put("s", Mouvement.BAS);
		mappings.put("d", Mouvement.DROITE);
		/*mappings.put("VK_RIGHT", Mouvement.DROITE);*/
		

	}

	/**
	 * @return Permet de vérifier si la touche taper est valide pour un
	 *         déplacement.
	 */
	public Mouvement parseMouvement(String nextLine) {
		Mouvement mvt = mappings.get(nextLine);
		return mvt == null ? Mouvement.FIXE : mvt;
	}
}
