/*- Um cadinho de tudo
Exercício: Sistema de Veículos.
Detalhes:
Criar interface Fretavel com metodo alugarVeiculo(pesoCarga, dias)
Criar interface Tributavel com metodo calcularIpva()
Criar classe mãe abstract sealed Veiculo (final placa, final marca, valorLocacaoDiaria,
final anoFabricacao, precoFipe) implementa Fretavel e Tributavel.
Criar classe filha Caminhao (final capacidadeCargaToneladas).
Criar classe filha CarroPasseio.
Regra de Negócio:
- Ao calcular o valor da locação através do método alugarVeiculo(pesoCarga, dias), caso
o peso da carga informado seja maior que a capacidade máxima do caminhão, deverá
ser aplicado um acréscimo de 10% sobre o valor total das diárias como taxa de
sobrecarga.
- Regra do Governo: Veículos com mais de 20 anos de fabricação são isentos de IPVA
(retornam 0.0). Se for mais novo, o CarroPasseio paga 4% do valor de tabela e o
Caminhao paga 1.5%.
- Deverá ser tratada exceções para criação dos objetos(construtores) e exceções nas
chamadas dos metodos, qualquer parametro inválido deve ser lançada uma exeção e
tratada no metodo main*/

public  class Main {
    public static void main(String[] args) {

        try {
            Caminhao caminhao1 = new Caminhao(50.0, "WERT6453", "Mercedes", 500.0, 2005, 350000.0);
            CarroPasseio carro1 = new CarroPasseio("ANAO1234", "Hyundai", 200.0, 2018, 50000.0);

            caminhao1.alugarVeiculo(49.0, 15);
            caminhao1.calcularIPVA();

            carro1.alugarVeiculo(10.0, 20);
            carro1.calcularIPVA();

        } catch (VeiculoException e) {
            System.err.println("[ERRO]: " + e.getMessage());
        }
    }
}