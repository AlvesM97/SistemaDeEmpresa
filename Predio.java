
package sistemadeempresaa;

import java.util.ArrayList;

public class Predio extends Empresa {
    private String CEPPredio;
    private int NumeroPredio;

    private int Andares;
    private ArrayList <Sala> Salas;

    public Predio(String CEPPredio, int Andares, ArrayList<Sala> Salas) {
        this.CEPPredio = CEPPredio;
        this.NumeroPredio = NumeroPredio;
        this.Salas = Salas;
        this.Andares = Andares;
        System.out.println();
        
    }

    public Predio(String CEPPredio, int Andares) {
        this.CEPPredio = CEPPredio;
        this.NumeroPredio = NumeroPredio;
        this.Salas = new ArrayList<>();
        this.Andares = Andares;
        
    }
    
    public String getCEPPredio() {
        return CEPPredio;
    }

    public void setCEPPredio(String CEPPredio) {
        this.CEPPredio = CEPPredio;
    }

    public int getNumeroPredio() {
        return NumeroPredio;
    }

    public void setNumeroPredio(int NumeroPredio) {
        this.NumeroPredio = NumeroPredio;
    }

    public int getNumeroSalas() {
        return this.Salas.size();
    }


    public int getAndares() {
        return Andares;
    }

    public void setAndares(int Andares) {
        this.Andares = Andares;
    }

    public ArrayList <Sala> getSalas() {
        return Salas;
    }

    public void setSalas(ArrayList <Sala> Salas) {
        this.Salas = Salas;
    }
    
    public boolean addSala(Sala s){
        if(this.Salas.add(s)){
            s.setPredio(this);
            return true;
        }
        return false;
        
    }
    
}
