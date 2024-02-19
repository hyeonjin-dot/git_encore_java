package workshop3.subway.controller;

import workshop3.subway.entity.Card;
import workshop3.subway.entity.Station;

public interface SubwayService {
	//1. constance
	int x = 10;
	
	public int chargeFee(Card card, Station start, Station end);
	public boolean subtractBalance(Card card, int amount);
	
	public int getDistance(Station start, Station end);
}
