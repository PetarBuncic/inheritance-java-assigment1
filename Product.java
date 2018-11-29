package assigment1;

public abstract class Product {
	
	public String nazivproizvoda;
	public int barkod;
	public double osnovnacena;
	public final int pdv=20;
	
	Product(String naziv, int bar, double cena){
		this.nazivproizvoda=naziv;
		this.barkod=bar;
		this.osnovnacena=cena;
	}

	public double createPrice() {
		double cena =this.osnovnacena*(100+pdv)/100;
		return cena;
	}

}

