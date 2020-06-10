class Kursant {
	private String imie;
	private String zadanie;

	public Kursant(String imie, String zadanie) {
		super();
		this.imie = imie;
		this.zadanie = zadanie;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getZadanie() {
		return zadanie;
	}

	public void setZadanie(String zadanie) {
		this.zadanie = zadanie;
	}

	@Override
	public String toString() {
		return "Kursant [imie=" + imie + ", zadanie=" + zadanie + "]";
	}

}