package fruttivendolofuncs;

public class Cesto<F> {
	private F[] cesto;
	private int top;
	private int peso;
	private final float pesoMax=50.0f;
	public Cesto(F frutto){
		this.nuovoCesto(frutto);
	}
	public F[] getCesto() {
		return cesto;
	}
	@SuppressWarnings("unchecked")
	public void nuovoCesto(F frutto) {
	this.cesto= (F[]) new Object[30];
	}
	public void aggiungi(F frutto) throws Exception {
		if(((Frutta)frutto).getPeso()+peso<pesoMax) {
			if(top>=1) {
				try {
					if(frutto.getClass()==this.cesto[0].getClass()) {
						this.cesto[top++]=frutto;
						this.peso+=((Frutta) frutto).getPeso();
						System.out.println("frutto aggiunto");
					}
					else {
						throw new Exception("puoi inserire solo un tipo di frutta alla volta");
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			else {
				try {
					this.cesto[top++]=frutto;
					this.peso+=((Frutta) frutto).getPeso();
					System.out.println("frutto aggiunto");
					}catch(Exception e) {
						e.printStackTrace();
						System.out.println(".....");
					}
			}
		}else {
			throw new Exception("hai superato il peso massimo");
		}
	}
}

