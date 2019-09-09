
package sistemadeempresaa;

public class Sala {
    private int QuantidadePessoas;
    private Sala Sala;
    private int Andar;
    private Predio Predio;
    
    public Sala(int QuantidadePessoas, int Andar, Predio Predio ,Sala Sala) {
        this.QuantidadePessoas = QuantidadePessoas;
        this.Sala = Sala;
        this.Andar = Andar;
        this.Predio = Predio;
    }
    public Sala(int QuantidadePessoas, int Andar) {
        this.QuantidadePessoas = QuantidadePessoas;
        

    }

    public Predio getPredio() {
        return Predio;
    }

    public void setPredio(Predio Predio) {
        this.Predio = Predio;
    }

    public int getQuantidadePessoas() {
        return QuantidadePessoas;
    }

    public void setQuantidadePessoas(int QuantidadePessoas) {
        this.QuantidadePessoas = QuantidadePessoas;
    }


    public Sala getSala() {
        return Sala;
    }

    public void setSala(Sala Sala) {
        this.Sala = Sala;
    }

    public int getAndar() {
        return Andar;
    }

    public void setAndar(int Andar) {
        this.Andar = Andar;
    }

    void getSala(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
