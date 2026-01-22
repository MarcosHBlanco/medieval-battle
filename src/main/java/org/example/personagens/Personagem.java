package org.example.personagens;

import org.example.exception.DanoInvalidoException;
import org.example.util.DadoUtil;

public abstract class Personagem {
    private int pontosDeVida;
    private int pontosDeDefesa;
    private int pontosDeForca;
    private int pontosDeAtaque;
    private int pontosDeAgilidade;



    private String classe;

    public Personagem(int pontosDeVida, int pontosDeForca, int pontosDeAtaque, int pontosDeDefesa,
                      int pontosDeAgilidade,String classe) {
        this.pontosDeVida = pontosDeVida;
        this.pontosDeForca = pontosDeForca;
        this.pontosDeAtaque = pontosDeAtaque;
        this.pontosDeAgilidade = pontosDeAgilidade;
        this.pontosDeDefesa = pontosDeDefesa;
        this.classe = classe;

    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }



    public int getPontosDeForca() {
        return pontosDeForca;
    }

    public int getPontosDeAtaque() {
        return pontosDeAtaque;
    }

    public int getPontosDeAgilidade() {
        return pontosDeAgilidade;
    }
    public String getClasse() {
        return classe;
    }

    public abstract int calcularFatorDeDano();

    public int calcularIniciativa(){
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD10() + pontosDeAgilidade;

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personagem{");
        sb.append("pontosDeVida=").append(pontosDeVida);
        sb.append(", classe='").append(classe).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int calcularFatorDeAtaque() {
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD10() + pontosDeAgilidade + pontosDeForca;
    }

    public int calcularFatorDeDefesa() {
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD10() + pontosDeAgilidade + pontosDeDefesa;
    }
    public void sofrerDano(int dano) {
        if(dano <= 0){
            //throw new IllegalArgumentException("DAno não pode ser menor do q zero");
            throw  new DanoInvalidoException("Dano Nao pode ser menor q zero");
        }
        this.pontosDeVida -= dano;

    }
}
