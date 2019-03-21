package ClassesObjeto;

public class ProjetoPraia {
    public static void main(String args[]){
        Crianca c1 = new Crianca();
        c1.altura = 1.50;
        c1.corpele = "Branco(a)";
        c1.corcabelo = "Ruivo";
        c1.idade = 8;
        c1.brinca();

        Crianca c2 = new Crianca();
        c2.altura = 1.55;
        c2.corcabelo = "loiro";
        c2.corpele = "branco(a)";
        c2.idade = 19;
        c2.correr(10);
        System.out.println(c2.Sorrir());
    }

}
