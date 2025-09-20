//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pessoa amigo1 = new Pessoa();
        amigo1.setNome("José Cláudio");
        amigo1.setPeso(65);
        amigo1.setAltura(1.77);

        Pessoa eu = new Pessoa();
        eu.setNome("Samuel Dias");
        eu.setPeso(80);
        eu.setAltura(1.65);

        Pessoa amigo2 = new Pessoa("Isaque Nunes", 55, 1.70);
        Atleta amigo3 = new Atleta("Rafael Veiga", 60, 1.74, Esporte.FUTEBOL, NivelAtividade.INTENSO);

        Atleta amigo4 = new Atleta();
        amigo4.setNome("Augusto Mercado");
        amigo4.setPeso(78);
        amigo4.setAltura(1.85);
        amigo4.setEspotePraticado(Esporte.BASQUETE);
        amigo4.setNivelAtividade(NivelAtividade.EXTREMO);

        Pessoa amigo5 = new Atleta("Higor Pereira",57, 1.73, Esporte.BASQUETE, NivelAtividade.MODERADO);
        Atleta amigo6 = new Atleta("Luiz Gabriel", 57, 1.73, Esporte.MUSCULACAO, NivelAtividade.INTENSO);
        Pessoa amigo7 = new Pessoa("Thiago Araujo", 64, 1.75);

        System.out.println(amigo1.toString());
        System.out.printf("MCI: %.2f\n", amigo1.obterImc());
        System.out.println(eu.toString());
        System.out.printf("MCI: %.2f\n", eu.obterImc());
        System.out.println(amigo2.toString());
        System.out.printf("MCI: %.2f\n", amigo2.obterImc());
        System.out.println(amigo3.toString());
        System.out.printf("MCI: %.2f\n", amigo3.obterImc());
        System.out.println(amigo4.toString());
        System.out.printf("MCI: %.2f\n", amigo4.obterImc());
        System.out.println(amigo5.toString());
        System.out.printf("MCI: %.2f\n", amigo5.obterImc());
        System.out.println(amigo6.toString());
        System.out.printf("MCI: %.2f\n", amigo6.obterImc());
        System.out.println(amigo7.toString());
        System.out.printf("MCI: %.2f\n", amigo7.obterImc());

    }
}