package ProjetoCarro;

public class Main {
    public static void main(String args[]){
        Carro meuCarro = new Carro();
        meuCarro.cor = "Azul";
        meuCarro.ano = 2017;
        meuCarro.chassi = "5321231";
        meuCarro.marca = "Fiat";
        meuCarro.modelo = "Palio";
        meuCarro.nMarcha = 5;
        meuCarro.nPortas = 5;
        meuCarro.VelocidadeMaxima = 250;

        meuCarro.VolumeCombstivel = 10;
        meuCarro.marchatual = 2;
        meuCarro.VelocidadeAtual = 20;

        System.out.println(meuCarro.VelocidadeAtual);
        meuCarro.acelera();;
        meuCarro.acelera();;
        System.out.println(meuCarro.VelocidadeAtual);

    }
}
