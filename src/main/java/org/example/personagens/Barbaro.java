package org.example.personagens;

import org.example.util.DadoUtil;

public class Barbaro extends Personagem {
    public Barbaro() {
        super(13,6,1,1,3, "Barbaro");
    }

    @Override
    public int calcularFatorDeDano() {
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD6() + dadoUtil.rollD6() + getPontosDeForca();
    }
}