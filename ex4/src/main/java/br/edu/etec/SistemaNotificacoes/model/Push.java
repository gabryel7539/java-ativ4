package br.edu.etec.SistemaNotificacoes.model;

public class Push extends Notificacao {

    public Push(String destinatario, String mensagem) {
        super(destinatario, mensagem, TipoNotificacao.PUSH);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando PUSH para " + destinatario + ": " + mensagem);
    }
}