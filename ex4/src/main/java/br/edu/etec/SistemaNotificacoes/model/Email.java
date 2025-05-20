package br.edu.etec.SistemaNotificacoes.model;

public class Email extends Notificacao {
    
    public Email(String destinatario, String mensagem){
        super(destinatario, mensagem, TipoNotificacao.EMAIL);
    }
    
    @Override
    public void enviar(){
        System.out.println("Enviando EMAIL para: " + this.destinatario + ":" + this.mensagem);
    }
}
