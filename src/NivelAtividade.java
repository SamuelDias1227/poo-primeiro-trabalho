public enum NivelAtividade {
    MODERADO( "Moderado", "Exercícios regulares ou trabalho ativo"),
    INTENSO( "Intenso", "Treinamento físico intenso ou trabalho físico pesado"),
    EXTREMO("Extremo", "Atividade física de alto desempenho");

    private final String descricao;
    private final String detalhes;

    NivelAtividade(String descricao, String detalhes) {
        this.descricao = descricao;
        this.detalhes = detalhes;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDetalhes() {
        return detalhes;
    }
}
