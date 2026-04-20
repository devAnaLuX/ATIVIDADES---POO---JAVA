public abstract sealed class Veiculo implements Fretavel,Tributavel permits Caminhao, CarroPasseio{

    protected final String placa;
    protected final String marca;
    protected Double valorLocacaoDiaria;
    protected final Integer anoFabricacao;
    protected Double precoFipe;

    public Veiculo (String placa, String marca, Double valorLocacaoDiaria, Integer anoFabricacao,  Double precoFipe){

        if(placa == null){
            throw new VeiculoException("Placa inválida.");
        }
        if(marca == null){
            throw new VeiculoException("Marca inválida.");
        }
        if(valorLocacaoDiaria == null || valorLocacaoDiaria<0){
            throw new VeiculoException("Valor da locação diária inválido.");
        }
        if(anoFabricacao == null){
            throw new VeiculoException("Ano de fabricação inválido.");
        }
        if(precoFipe == null || precoFipe<0){
            throw new VeiculoException("Preço Fipe inválido.");
        }
        this.placa = placa;
        this.marca = marca;
        this.valorLocacaoDiaria = valorLocacaoDiaria;
        this.anoFabricacao = anoFabricacao;
        this.precoFipe = precoFipe;
    }


}
