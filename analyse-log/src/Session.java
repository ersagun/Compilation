import java.util.ArrayList;
import java.util.Date;

/**
 * Classe a pour l'objectif de gerer les sessions
 * @author Ersagun
 *
 */
public class Session {
	
	public static ArrayList<Evenement> list_e= new ArrayList<Evenement>();
	public int id_session;
	public int ip;
	
	public Date getDate() {
		return null;
	}
	
	public long getFirst() {
		return (int) (list_e.get(0).getId_event());
	}
	
	public int getLast() {
		//sie ou -1 ta vu
		return (int) (list_e.get(list_e.size()).getId_event());
	}

	
	
	
}
