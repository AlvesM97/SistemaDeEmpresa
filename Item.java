package sistemadeempresaa;

public abstract class Item {
    private String Nome;
    private String Decricao;
    private int AnoDeCompra;
    private float ValorCompado;
    private float Depreciacao;
    private Sala Sala;
    private Predio Predio; 

    public Item(String Nome, String Decricao, int AnoDeCompra, float ValorCompado, Sala Sala, Predio Predio) {
        this.Nome = Nome;
        this.Decricao = Decricao;
        this.AnoDeCompra = AnoDeCompra;
        this.ValorCompado = ValorCompado;
        this.Sala = Sala;
        this.Predio = Predio;
    }

    public Predio getPredio() {
        return Predio;
    }

    public void setPredio(Predio Predio) {
        this.Predio = Predio;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDecricao() {
        return Decricao;
    }

    public void setDecricao(String Decricao) {
        this.Decricao = Decricao;
    }

    public int getAnoDeCompra() {
        return AnoDeCompra;
    }

    public void setAnoDeCompra(int AnoDeCompra) {
        this.AnoDeCompra = AnoDeCompra;
    }

    public float getValorCompado() {
        return ValorCompado;
    }

    public void setValorCompado(float ValorCompado) {
        this.ValorCompado = ValorCompado;
    }

    public float getDepreciacao() {
        return Depreciacao;
    }

    public void setDepreciacao(float Depreciacao) {
        this.Depreciacao = Depreciacao;
    }

    public Sala getSala() {
        return Sala;
    }

    public void setSala(Sala Sala) {
        this.Sala = Sala;
    }
    
}
