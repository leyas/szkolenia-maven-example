import pl.szymonleyk.zadania.Zadania;

class Kursanci {

	public static void main(String[] args){
		Kursant karol = new Kursant("Karol", Zadania.getZadanie1());

		System.out.println(karol);
	}
}