package fcu.iecs.oop;

public class Main {

	public static void main(String[] args) {

		Psyduck duck1 = new Psyduck();
		int hp = 0;
		System.out.println("hp:" + hp);
		hp = duck1.powerup();
		System.out.println("hp:" + hp);
		duck1.setName("Àn½à");
		System.out.println(duck1.getName());

	}

}
