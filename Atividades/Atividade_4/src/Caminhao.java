public final class Caminhao extends Veiculo {

    protected final Double capacidadeCargaToneladas;

    public Caminhao(Double capacidadeCargaToneladas, String placa, String marca, Double valorLocacaoDiaria, Integer anoFabricacao, Double precoFipe) {
        super(placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);
        this.capacidadeCargaToneladas = capacidadeCargaToneladas;
    }

    @Override
    public void alugarVeiculo(Double pesoCarga, Integer dias){
        Double total = (pesoCarga*dias);
        if(pesoCarga > capacidadeCargaToneladas){
            total += total*0.1;
        }
        else{
            total = total;
        }
        System.out.println("--------CAMINHÃO--------");
        System.out.println("Placa: " +placa);
        System.out.println("Marca: "+marca);
        System.out.println("Ano: "+ anoFabricacao);
        System.out.println("Preço: "+precoFipe);
        System.out.println("Total Aluguel: "+total);
    }

    @Override
    public void calcularIPVA() {

        Double ipva = precoFipe*0.015;

        System.out.println("IPVA: "+ipva);
        System.out.println("------------------------");
    }
}
