package workshop3.subway.view;

import java.util.Scanner;

import workshop3.subway.controller.SubwayController;
import workshop3.subway.entity.*;

public class SubwayView {
	public static void main(String[] args) {
		SubwayController sc = new SubwayController();
		System.out.print("[교통카드에 충전할 금액을 입력하세요] : ");
		int input = getUserInput();
		Card card = new Card(input);
		Station[] stationArray = {
				new Station("A1105", "합정", 0),
				new Station("A1106", "홍대입구", 10),
				new Station("A1107", "신촌", 15),
				new Station("A1108", "이대", 20),
				new Station("A1109", "아현", 30),
				new Station("A1110", "충정로", 35),
				new Station("A1111", "시청", 40),
				new Station("A1112", "을지로입구", 50),
				new Station("A1113", "을지로3가", 58),
				new Station("A1114", "을지로4가", 67),
				new Station("A1115", "동대문운동장", 77)
		};
		printStationList(stationArray);
		int start = selectNumber(stationArray, "승차");
		if (input < 800) {
			printFail();
			return ;
		}
		printStationList(stationArray);
		int end = selectNumber(stationArray, "하차");
		int res = sc.chargeFee(card, stationArray[start], stationArray[end]);
		if (res >= 0)
			printSuccess(card, stationArray[start], stationArray[end], res);
		else
			printFail();
	}
	
	public static void printStationList(Station[] stations) {
		System.out.println("====================================");
		
		for (int i = 0; i < stations.length; i++ ) {
			System.out.printf("%d. %s\n", i+1, stations[i].getName());
		}
		
		System.out.println("====================================");
	}
	
	public static void printSuccess(Card card, Station start, Station end, int chargedFee) {
		System.out.println("정상 처리되었습니다.");
		System.out.printf("승차역은 %s 역이고, 하차역은 %s 역입니다.\n", start.getName(), end.getName());
		System.out.printf("요금은 %d원이며, 잔액은 %d원입니다.", chargedFee, card.getBalance());
	}
	
	public static void printFail() {
		System.out.println("잔액부족입니다.\n직원에게 문의하세요.");
	}
	

	public static int selectNumber(Station[] station, String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("%s역을 선택하세요. 1 ~ 11 : ", msg);
		int input = scan.nextInt();
		return input - 1;
	}
	
	public static int getUserInput() {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		return input;
	}
	
}
