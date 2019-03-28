package ProjetoClinica;

public class Clinica {
    public static void main(String args[]){
        //Criação do Paciente 1
        Paciente p1 = new Paciente("Pedro","Rua 01",225410);
        //Criação do Medico 1
        Medico m1 = new Medico("João","Rua 02",02541);
        //Criação do Atedimento Medico
        AtendimentoMedico al1 = new AtendimentoMedico("27/03/1999",90.00, p1, m1);
    }
}
