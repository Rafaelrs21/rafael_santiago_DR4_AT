package q2;

public enum InvoiceType {
    SIMPLES("Simples", "Nota fiscal simples"),
    COM_IMPOSTO("Com imposto", "Nota fiscal com imposto"),
    FANTASMA("Fantasma", "Nota fiscal fantasma"),
    DESCONHECIDO("Desconhecido", "Tipo desconhecido");

    private final String descricaoTipo;
    private final String mensagem;

    InvoiceType(String descricaoTipo, String mensagem) {
        this.descricaoTipo = descricaoTipo;
        this.mensagem = mensagem;
    }

    public String getDescricaoTipo() {
        return descricaoTipo;
    }

    public String getMensagem() {
        return mensagem;
    }
}