package com.project.iphone;

import com.project.navegador.Navegador;
import com.project.reprodutormusical.ReprodutorMusical;
import com.project.telefone.Telefone;

public class Iphone implements Navegador, ReprodutorMusical, Telefone {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina na internet...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica..");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica...");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando para contato...");
    }

    @Override
    public void atender() {
        System.out.println("atendendo ligacao...");

    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
