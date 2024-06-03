package fruttivendolofuncs;

public class Test {

	public static void main(String[] args) {
		try {
			Pesca p=new Pesca(1.9f);
			Mela m=new Mela(10.3f);
			Melone ml=new Melone(20.0f);
			Cesto<Frutta> cesto2=new Cesto<Frutta>(ml);
			cesto2.aggiungi(ml);
			cesto2.aggiungi(m);
			Cesto<Frutta> cesto=new Cesto<Frutta>(p);
			cesto.aggiungi(p);
			cesto.aggiungi(p);
			cesto.aggiungi(p);
			Cesto<Frutta> cesto1=new Cesto<Frutta>(m);
			cesto1.aggiungi(m);
			cesto1.aggiungi(p);
			cesto1.aggiungi(m);
			cesto1.aggiungi(m);
			cesto1.aggiungi(m);
			cesto1.aggiungi(m);
			System.out.println("fatto");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("continua");
	}

}
