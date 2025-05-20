package br.edu.etec.SistemaNotificacoes.teste;

import br.edu.etec.SistemaNotificacoes.model.Email;
import br.edu.etec.SistemaNotificacoes.model.Notificacao;
import br.edu.etec.SistemaNotificacoes.model.Push;
import br.edu.etec.SistemaNotificacoes.model.SMS;

public class Ex4 {

   public static void main(String[] args) {

        Notificacao[] notificacao = new Notificacao[] {
            new Email("joao@email.com", "Olá João, tudo bem?"),
            new SMS("11999999999", "Mensagem curta de SMS"),
            new SMS("11988888888", "A felicidade não é uma estação a que se chega, mas um estado de espírito que se alcança através do trabalho, do amor, do conhecimento, da fé e, principalmente, da capacidade de amar a vida e as pessoas que nos rodeiam."),
            new Push("usuarioApp123", "Você recebeu uma nova mensagem no app.")
        };

        for (Notificacao n : notificacao) {
            n.preparar();
            n.enviar();
            System.out.println();
        }
    } 
}


