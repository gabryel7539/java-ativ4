package br.edu.etec.SistemaNotificacoes.model;

public class SMS extends Notificacao {
    
    public SMS(String destinatario, String mensagem){
        super(destinatario, mensagem, TipoNotificacao.SMS);
        if(this.mensagem.length() > 160){
            this.mensagem = this.mensagem.substring(0 , 160);
        }
    }
    
    @Override
    public void enviar(){
        System.out.println("Enviando SMS para: " + this.destinatario + ":" + this.mensagem);
    }
}
