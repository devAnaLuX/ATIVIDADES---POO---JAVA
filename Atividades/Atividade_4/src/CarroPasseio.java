public final class  CarroPasseio extends Veiculo{

    public CarroPasseio (String placa, String marca, Double valorLocacaoDiaria, Integer anoFabricacao,  Double precoFipe){
        super(placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);
    }

    @Override
    public void alugarVeiculo(Double pesoCarga, Integer dias){
        Double total = pesoCarga*dias;

        System.out.println("--------CARRO--------");
        System.out.println("Placa: " +placa);
        System.out.println("Marca: "+marca);
        System.out.println("Ano: "+ anoFabricacao);
        System.out.println("Preço: "+precoFipe);
        System.out.println("Total Aluguel: "+total);
    }

    @Override
    public void calcularIPVA() {
        Double ipva = precoFipe*0.04;

        System.out.println("IPVA: "+ipva);
        System.out.println("------------------------");

    }
}
