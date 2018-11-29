package assigment1;

public class Chocolate extends Product{
	public int weightchoco;
	
	public Chocolate(String naziv, int bar, double cenabezpdv,int weight){
		super(naziv,bar,cenabezpdv);
		weightchoco=weight;
	}
	public String toString () {
		String cena="Osnovna cena ovog proizvoda je: "+this.osnovnacena +" din";
		String naziv="Naziv proizvoda je: " +this.nazivproizvoda;
		String barkod="Bar kod proizvoda je: "+this.barkod;
		String tezina="Tezina proizvoda je : "+this.weightchoco +" grama";
		String cenaPDV="Cena ovog proizvoda sa PDV-om je: "+ this.createPrice()+ " din";
		String opis=(naziv+"\n"+ barkod +"\n"+ cena +"\n"+cenaPDV +"\n"+ tezina+"\n");
		return opis;
		}
	
}

