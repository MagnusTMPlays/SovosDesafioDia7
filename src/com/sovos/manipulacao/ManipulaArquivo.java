package com.sovos.manipulacao;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;



public class ManipulaArquivo {

    public void ManipulaArquivo(){
            try {
                File arquivo = new File("arquivo.txt");
                if (arquivo.createNewFile()) {
                    System.out.println("Arquivo criado: " + arquivo.getName());
                } else {
                    System.out.println("Arquivo " + arquivo.getName() +" já existe.");
                }
            } catch (IOException erro) {
                System.out.println("Algo deu errado!");
                erro.printStackTrace();
            }
    }

    public void escreverTeste(){
        try {
            FileWriter escrever = new FileWriter("arquivo.txt");
            escrever.write("Teste foi criado com sucesso " +
                    "\nBolo de Fuba DLC\n"+
                    "\nINGREDIENTES\n" +
                    "3 ovos\n" +
                    "2 xícaras (chá) de açúcar\n" +
                    "2 xícaras (chá) de fubá\n" +
                    "3 colheres (sopa) rasas de farinha de trigo\n" +
                    "1/2 copo (americano) de óleo\n" +
                    "1 copo de leite\n" +
                    "1 colher (sopa) de fermento em pó\n" +
                    "\n" +
                    "MODO DE PREPARO\n" +
                    "Bata todos os ingredientes no liquidificador.\n" +
                    "\n" +
                    "Coloque em uma forma untada e enfarinhada.\n" +
                    "\n" +
                    "Leve ao forno preaquecido e deixe assar, por cerca de 40 minutos.");
            escrever.close();
            System.out.println("Teste de escrever no arquivo.txt ,foi executado com sucesso");
        } catch (IOException erro) {
            System.out.println("Algo deu errado!");
            erro.printStackTrace();
        }
    }

    public void lerTexto(){
        try {
            File arquivo = new File("arquivo.txt");
            Scanner lerTexto = new Scanner(arquivo);
            while (lerTexto.hasNextLine()) {
                String data = lerTexto.nextLine();
                System.out.println(data);
            }
            lerTexto.close();
        } catch (FileNotFoundException erro) {
            System.out.println("Algo deu errado!");
            erro.printStackTrace();
        }
    }

    public void teste(){
        final JFXPanel fxPanel = new JFXPanel();
        String uriString = new File("src/voz.mp3").toURI().toString();
        Media pick = new Media(uriString);
        MediaPlayer player = new MediaPlayer(pick);
        player.play();



    }

}
