package model;

public class Reservation {

	Client client;
	long reservationId;
	int startTime;
	int numberOfPeople;
	Table table;
	Bill bill;
	
	Reservation(Client c, long r, int st, int nop,Table table){
		this.client = c;
		this.startTime = st;
		this.numberOfPeople = nop;
		this.reservationId = r;
		this.table = table;
	}

	@Override
	public String toString() {
		return "Reservation [client=" + client.toString() + ",\n reservationId=" + reservationId + ",\n startTime=" + startTime
				+ ",\n numberOfPeople=" + numberOfPeople + ",\n table=" + table + ",\n bill=" + bill.toString() + "]";
	}
	
}
