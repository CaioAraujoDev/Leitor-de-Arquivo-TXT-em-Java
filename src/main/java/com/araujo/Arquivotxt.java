package com.araujo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Arquivotxt {
    public static void lerarquivo() {
        Path caminho = Path.of("src/main/resources/teste.txt");
        int t = 0;
        int l = 0;
        if (!Files.exists(caminho)){
            System.out.println("Arquivo inexistente por favor verifique se realmente colocou o arquivo no local certo e com o nome certo");
            System.exit(0);
        }
        try {
            List<String> texto = Files.readAllLines(caminho);
            int tamanho = texto.size();
            if(tamanho == 0){
                System.out.println("Arquivo vazio");
                System.exit(0);
            }
            for (String linha : texto){
                System.out.println(linha);
                if(!linha.isBlank()){
                    l += 1;
                }
                t += 1;
            }
            System.out.println("\n\n O numero total de linhas é de: " + t);
            System.out.println("O numero total de linhas escritas é: " + l);
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo");
            System.exit(0);
        }

    }
}
