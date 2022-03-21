public class Principal {
    public static void main(String[] args){
        CadastroBrinquedo brinquedos = new CadastroBrinquedo(5);

        Carro carropqn = new Carro(50, 10);
        Carro hotweels = new Carro(40, 5);
        Barco barcogrande = new Barco(20,6);
        Barco barcopequeno = new Barco(40,10);
        Aviao aviaorosa = new Aviao(20,3);

        brinquedos.adicionarBrinquedos(carropqn);
        brinquedos.adicionarBrinquedos(hotweels);
        brinquedos.adicionarBrinquedos(barcogrande);
        brinquedos.adicionarBrinquedos(barcopequeno);
        brinquedos.adicionarBrinquedos(aviaorosa);

        brinquedos.todoMundoSeMovendo();

    }
}
