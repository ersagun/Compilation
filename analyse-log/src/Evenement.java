import java.util.Date;


public class Evenement {

	public long id_event;
	
	public long date;

	public Evenement (long id, long d) {
		this.id_event=id;
		this.date=d;
	}

	public long getId_event() {
		return id_event;
	}

	public void setId_event(long id_event) {
		this.id_event = id_event;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}
}
