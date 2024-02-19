package workshop5.hrsystem.view;

import workshop5.hrsystem.entity.Person;

public class PersonManager {

	public PersonManager() {}
	
	public static void main(String[] args) {
		PersonManager m = new PersonManager();
		
		m.printTitle("title");
		m.printTitleLine();
		
		Person[] persons = { 
			new Person("이성호","000101-3111111","우리집", "032-392-2932"),
			new Person("김하늘","000101-4111111","우리집", "02-362-1932"),
			new Person("박명수","990101-1111111","우리집", "02-887-1542"),
			new Person("나인수","000101-3111111","우리집", "032-384-2223"),
			new Person("홍정수","000101-3111111","우리집", "02-158-7333"),
			new Person("이미숙","000101-4111111","우리집", "02-323-1934"),
			new Person("박성구","000101-3111111","우리집", "032-327-2202"),
			new Person("유성미","000101-4111111","우리집", "02-452-0939"),
			new Person("황채현","000101-3111111","우리집", "032-327-2202"),
			new Person("최철수","000101-3111111","우리집", "032-122-7832")
		};
		
		m.showPersons(persons);
		m.printTitleLine();
	}
	
	public void showPersons(Person[] persons) {
		for (int i = 0; i < 10; i++) {
			System.out.print("[이름]");
			System.out.print(persons[i].getName());
			System.out.print("  [성별]");
			persons[i].setGender();
			System.out.print(persons[i].getGender());
			System.out.print("  [전화번호]");
			System.out.println(persons[i].getPhone());
			if (i != 9)
				this.printItemLine();
		}
	}
	
	public void printTitle(String title) {
		System.out.println("\n@@@ 인물정보조회시스템@@@\n");
	}
	
	public void printTitleLine() {
		System.out.println(" ===========================================================");
	}
	
	public void printItemLine() {
		System.out.println("---------------------------------------");
	}
}
