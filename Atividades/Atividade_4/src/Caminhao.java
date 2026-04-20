public final class Caminhao extends Veiculo {

    protected final Double capacidadeCargaToneladas;

    public Caminhao(Double capacidadeCargaToneladas, String placa, String marca, Double valorLocacaoDiaria, Integer anoFabricacao, Double precoFipe) {
        super(placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);
        this.capacidadeCargaToneladas = capacidadeCargaToneladas;

        if (capacidadeCargaToneladas == null || capacidadeCargaToneladas<0){
            throw new VeiculoException("Capacidade inválida.");
        }
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
        double isento = 2026 - anoFabricacao;
        Double ipva;

        if (isento<20){
            ipva = precoFipe*0.015;
        }else {
            ipva = 0.0;
        }

        System.out.println("IPVA: "+ipva);
        System.out.println("------------------------");
    }
}
