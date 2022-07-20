/* Faça um programa que leia um vetor de
 caracteres e diga quantas consoantes foram lidas. Imprima as consoantes*/

import java.sql.SQLOutput;
import java.util.Scanner;

public class LeitorConsoantes {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cont = 0;
        String[] caracter = new String[6];
        String[] consoantes = new String[6];

        for (int i=0;i<=(consoantes.length -1);i++){
            System.out.println(" Caractere nº"+ (i+1)+":");
            caracter[i] = ler.next();

            switch (caracter[i]){
                case "a":
                    consoantes[i]=null;
                    break;
                case "e":
                    consoantes[i]=null;
                    break;
                case "i":
                    consoantes[i]=null;
                    break;
                case "o":
                    consoantes[i]=null;
                    break;
                case "u":
                    consoantes[i]=null;
                    break;

                default:
                    consoantes[i]=caracter[i];
                    cont++;
                    break;
            }

        }

        System.out.println("O vetor possui "+cont+" consoantes! São elas:");
        for (int i=0;i< consoantes.length;i++){
            if(consoantes[i]!=null){
                System.out.println((i+1)+":"+consoantes[i]);
            }
        }

    }

}
