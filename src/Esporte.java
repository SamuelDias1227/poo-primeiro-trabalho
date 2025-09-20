public enum Esporte {
    FUTEBOL("Futebol"),
    BASQUETE("Basquete"),
    VOLEI("Vôlei"),
    TENIS("Tênis"),
    NATACAO("Natação"),
    CICLISMO("Ciclismo"),
    CORRIDA("Corrida"),
    GINASTICA("Ginástica"),
    MUSCULACAO("Musculação"),
    SURFE("Surfe"),
    ESCALADA("Escalada");

    private final String descricao;

    Esporte(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
