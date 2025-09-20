public class Atleta extends Pessoa{

    private Esporte espotePraticado;
    private NivelAtividade nivelAtividade;

    public Atleta() {
    }

    public Atleta(String nome, double peso, double altura, Esporte espotePraticado, NivelAtividade nivelAtividade) {
        super(nome, peso, altura);
        this.espotePraticado = espotePraticado;
        this.nivelAtividade = nivelAtividade;
    }

    public Esporte getEspotePraticado() {
        return espotePraticado;
    }
    public void setEspotePraticado(Esporte espotePraticado) {
        this.espotePraticado = espotePraticado;
    }

    public NivelAtividade getNivelAtividade() {
        return nivelAtividade;
    }
    public void setNivelAtividade(NivelAtividade nivelAtividade) {
        this.nivelAtividade = nivelAtividade;
    }

    @Override
    public double obterImc() {
        double imcSimples = super.obterImc();
        if (nivelAtividade == NivelAtividade.INTENSO || nivelAtividade == NivelAtividade.EXTREMO) {
            return  imcSimples - (imcSimples * (5.0/100.0));
        }
        return imcSimples;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", espotePraticado=" + espotePraticado +
                ", nivelAtividade=" + nivelAtividade +
                '}';
    }
}
