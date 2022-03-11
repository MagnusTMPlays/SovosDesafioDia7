package com.sovos.main;

import com.sovos.manipulacao.ManipulaArquivo;

public class Main {
    public static void main(String[] args) {

        ManipulaArquivo manipulaArquivo = new ManipulaArquivo();
        manipulaArquivo.ManipulaArquivo();
        manipulaArquivo.escreverTeste();
        manipulaArquivo.lerTexto();

        manipulaArquivo.teste();
    }
}
