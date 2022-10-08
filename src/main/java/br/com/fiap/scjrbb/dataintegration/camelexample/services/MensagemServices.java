package br.com.fiap.scjrbb.dataintegration.camelexample.services;

import br.com.fiap.scjrbb.dataintegration.camelexample.beans.Mensagem;

public class MensagemServices {
    public static void exemplo(Mensagem mensagem){
        mensagem.setName("Mensagem processada");
        mensagem.setId(mensagem.getId()+1);
    }
}
