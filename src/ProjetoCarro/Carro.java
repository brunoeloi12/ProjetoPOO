package ProjetoCarro;

public class Carro {

    String modelo,cor,marca,chassi;
    double VelocidadeMaxima, VelocidadeAtual,
    VolumeCombstivel;
    int ano, nPortas, nMarcha, marchatual;
    Proprietario proprietario;

    void acelera(){
        VelocidadeAtual +=1;
    }
    void freia(){
        VelocidadeAtual =0;
    }
    void tracarMarcha(int marcha){
        marchatual = marcha;
    }
    void  redizirMarcha(){

    }

}
