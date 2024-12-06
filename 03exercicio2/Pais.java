class Pais {
    private String nome;
    private String capital;
    private double dimensao;

    public Pais(String nome, String capital, double dimensao) {
        this.nome = nome;
        this.capital = capital;
        this.dimensao = dimensao;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCapital() {
        return this.capital;
    }

    public String getDimensao() {
        return this.dimensao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }


}