
public class French {
	public String addArticle(String country) {
		/*
		 * if starts with vowel
		 * 		if exception
		 * 			les
		 * 		else		
		 * 			l'
		 * else if end with e
		 * 		if exception
		 * 			masculine
		 * 		else 
		 * 			feminine
		 * else
		 * 		masculine
		 */

		if (country.equals("Etats-Unis") ||
			country.equals("Pays-Bas"))
		{
			return "les " + country;
		} else if (country.startsWith("A") ||
				country.startsWith("E") ||
				country.startsWith("I") ||
				country.startsWith("O") ||
				country.startsWith("U"))
		{
			return "l'" + country;
		} else if (country.endsWith("e")) {
			if (country.equals("Belize") ||
				country.equals("Cambodge") ||
				country.equals("Mexique") ||
				country.equals("Mozambique") ||
				country.equals("Zaïre") ||
				country.equals("Zimbabwe"))
			{
				return "le " + country;
			} else {
				return "la " + country;
			}
		} else {
			return "le " + country;
		}
		
	}
}
