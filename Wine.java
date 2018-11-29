package assigment1;

public class Wine extends Product{
	public final int extrapdv=10;
	public int botle;
	
	public double createPrice() {
		double cena = osnovnacena*(100+pdv)/100;
		cena=cena*(100+extrapdv)/100;
		return cena;
	}
	public Wine (String naziv,int bar, double cenabezpdv, int botle){
		super(naziv,bar,cenabezpdv);
		this.botle=botle;
		
	}
	public String toString () {
		String cena="Osnovna cena ovog proizvoda je: "+this.osnovnacena +" din";
		String naziv="Naziv proizvoda je: " +this.nazivproizvoda;
		String barkod="Bar kod proizvoda je: "+this.barkod;
		String zapremina="Zapremina proizvoda je : "+this.botle +" L";
		String cenaPDV="Cena ovog proizvoda sa PDV-om je: "+ this.createPrice()+ " din";
		String opis=(naziv+"\n"+ barkod +"\n"+ cena +"\n"+cenaPDV +"\n"+ zapremina +"\n");
		return opis;
		}
	

}
