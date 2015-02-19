import java.util.ArrayList;
import java.util.Date;


public class Sessions {
	
	public static int id_session=0;

	public ArrayList<Session> list;

	public void add(int ip, long timestamp) {
		int sess_id=-1;
		//parcours de la liste des sessions
		for (Session s : list) {	
			//on verifie si l'ip correspond a la session
			if (s.getIp()==ip) {
				// on verifie si l'evenement est dans les temps de la session
				if (s.isDateOk(timestamp)) {
					sess_id=s.getId_session();
					// on ajoute l'evenement
					s.add(new Evenement(ip,timestamp));
				}
			}
		}
		if (sess_id==-1) {
			//on crée un nouvelle session si l'ip de l'evenement n'est pas dans les temps d'une session ou n'appartient a aucune session
			list.add(new Session(ip,id_session++));
		}
	}
	
	public int getNbSession () {
		return list.size();
	}
}