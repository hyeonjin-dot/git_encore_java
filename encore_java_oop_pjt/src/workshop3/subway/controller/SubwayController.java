package workshop3.subway.controller;

import workshop3.subway.entity.*;


public class SubwayController implements SubwayService {
	
	public static final int BASIC_FEE = 800;

	public int chargeFee(Card card, Station station, Station end) {
		int res = BASIC_FEE;
		int bf = card.getBalance();
		int loc = getDistance(station, end);
		if (loc <= 12)
			res += 0;
		else if (loc > 12 && loc <= 42)
			res += (loc / 6 - 1) * 100;
		else
			res += 500 + ((loc-30) / 12) * 100;
		boolean rtn = subtractBalance(card, res);
		if (rtn)
			return res;
		else
			return -1;
	}
	
	public boolean subtractBalance(Card card, int amount) {
		int res = card.getBalance() - amount;
		if (res > 0) {
			card.setBalance(res);
			return true;
		}
		else
			return false;
	}
	
	public int getDistance(Station station, Station end) {
		int sl = station.getLocation();
		int el = end.getLocation();
		int loc = (sl - el < 0) ? el - sl : sl - el;
		return loc;
	}
	
}
