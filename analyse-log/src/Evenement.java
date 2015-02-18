import java.util.Date;


public class Evenement {

	public long id_event;
	
	public Date date;

	public Evenement (long id, Date d) {
		this.id_event=id;
		this.date=d;
	}

	public long getId_event() {
		return id_event;
	}

	public void setId_event(long id_event) {
		this.id_event = id_event;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
