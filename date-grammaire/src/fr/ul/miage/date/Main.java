/**
 * Classe qui appelle le parser
 * La lecture du flux de carractère se fait sur l'entréee standard
 */
package fr.ul.miage.date;

import fr.ul.miage.date.generated.ParserCup;
import fr.ul.miage.date.generated.Yylex;

/**
 * @author Azim Roussanaly
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ParserCup parser = new ParserCup(new Yylex(System.in));
		try {
			parser.parse();
			System.out.println(parser.getTime());
		} catch (Exception e) {
			System.err.println("...Erreur de syntaxe ");
			System.exit(1);
		}
	}

}
