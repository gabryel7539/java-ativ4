package br.edu.etec.SistemaNotificacoes.model;

public abstract class Notificacao {
    public static enum TipoNotificacao{
        EMAIL, SMS , PUSH
    }
    
    protected String destinatario;
    protected String mensagem;
    protected TipoNotificacao tipo;
    
    public Notificacao(String destinatario, String mensagem, TipoNotificacao tipo){
        this.destinatario = destinatario;
        this.mensagem = mensagem;
        this.tipo = tipo;
    }
    
    public void preparar(){
        System.out.println("Preparando notificacao para: " + this.destinatario);
    }
    
    public abstract void enviar();
}
