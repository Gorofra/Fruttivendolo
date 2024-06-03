package fruttivendolofuncs;

public abstract class Frutta {
    private float peso;

    public Frutta(float peso) throws Exception{
        this.setPeso(peso);
    }
    private void setPeso(float peso)throws Exception {
        try {
            if (peso <= 0) {
                throw new Exception();
            } else {
                this.peso = peso;
            }
        }catch (Exception e){
            System.out.println("il peso deve essere maggiore di 0");
        }
    }

    public float getPeso(){
            return peso;
    }

}
