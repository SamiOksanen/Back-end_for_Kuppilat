package arvostelut.bean;

public class Arvostelu {
	private int id;
	private String paikka;
	private String paiva;
	private String arvosana;
	private String kuvaus;
	
	public Arvostelu() {
		super();
	}
	
	public Arvostelu(int id, String paikka, String paiva, String arvosana, String kuvaus) {
		super();
		this.id = id;
		this.paikka = paikka;
		this.paiva = paiva;
		this.arvosana = arvosana;
		this.kuvaus = kuvaus;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPaikka() {
		return paikka;
	}
	public void setPaikka(String paikka) {
		this.paikka = paikka;
	}
	public String getPaiva() {
		return paiva;
	}
	public void setPaiva(String paiva) {
		this.paiva = paiva;
	}
	public String getArvosana() {
		return arvosana;
	}
	public void setArvosana(String arvosana) {
		this.arvosana = arvosana;
	}
	public String getKuvaus() {
		return kuvaus;
	}
	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}

	@Override
	public String toString() {
		return "Arvostelu [id=" + id + ", paikka=" + paikka + ", paiva=" + paiva + ", arvosana=" + arvosana
				+ ", kuvaus=" + kuvaus + "]";
	}

}
