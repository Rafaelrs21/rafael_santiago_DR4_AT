package q2;

public class Invoice {
    private String clientName;
    private String clientEmail;
    private double amount;
    private InvoiceType type;

    public Invoice(String clientName, String clientEmail, double amount, InvoiceType type) {
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.amount = amount;
        this.type = type;
    }

    public void process() {
        if (!isEmailValid()) {
            System.out.println("Email inválido. Falha no envio.");
            return;
        }

        System.out.println(type.getMensagem());
        String nota = gerarNotaFiscal();
        System.out.println(nota);
        enviarPorEmail(clientEmail, nota);
    }

    private boolean isEmailValid() {
        return clientEmail != null && clientEmail.contains("@");
    }

    private String gerarNotaFiscal() {
        return """
               --- NOTA FISCAL ---
               Cliente: %s
               Valor: R$ %.2f
               Tipo: %s
               ---------------------
               """.formatted(clientName, amount, type.getDescricaoTipo());
    }

    private void enviarPorEmail(String email, String conteudo) {
        System.out.println("Enviando email para: " + email);
        System.out.println("Conteúdo:\n" + conteudo);
    }
}