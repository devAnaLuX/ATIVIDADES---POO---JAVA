public abstract sealed class Veiculo implements Fretavel,Tributavel permits Caminhao, CarroPasseio{

    protected final String placa;
    protected final String marca;
    protected Double valorLocacaoDiaria;
    protected final Integer anoFabricacao;
    protected Double precoFipe;

    public Veiculo (String placa, String marca, Double valorLocacaoDiaria, Integer anoFabricacao,  Double precoFipe){
        this.placa = placa;
        this.marca = marca;
        this.valorLocacaoDiaria = valorLocacaoDiaria;
        this.anoFabricacao = anoFabricacao;
        this.precoFipe = precoFipe;
    }


}
