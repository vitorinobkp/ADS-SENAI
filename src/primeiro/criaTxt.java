package primeiro;

import javax.swing.*;
import java.util.Formatter; //formatar arquivo
  
public class criaTxt{
    
  public static void main(String[] args){
    String nomeArq="C:/desenvolvimento/gerado.txt";
    //tentando criar arquivo
    try
    {
      Formatter saida = new Formatter(nomeArq);
      saida.format("Criando e Gravando dados em Txt com Java Veja como criar e gravar dados em arquivos texto (txt) usando o Java. Neste artigo, demonstramos na prática, como você pode gravar dados em arquivos de texto. Confira agora.");
      saida.close();
      JOptionPane.showMessageDialog(null,"Arquivo '"+nomeArq+"' criado!","Arquivo",1);
    }
    //mostrando erro em caso se nao for possivel gerar arquivo
    catch(Exception erro){
      JOptionPane.showMessageDialog(null,"Arquivo nao pode ser gerado!","Erro",0);
    }
  } 
}