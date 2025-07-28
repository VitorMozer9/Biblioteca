package view;

import java.util.Scanner;

public class PrincipalView {
    Scanner leituraDados = new Scanner(System.in);
    
    public int mostraOpcoesMenuPrincial(){
        System.out.println("Digite para onde quer ser direcionado: ");
        System.out.println("1 - Cadastro Cliente");
        System.out.println("2 - Cadastro Livro");
        System.out.println("3 - Cadastro Autor");
        System.out.println("4 - Informar Empréstimo");
        System.out.println("5 - Navegar pela biblioteca");
        System.out.println("6 - encerrar aplicação\n");
        
        return leituraDados.nextInt();
    }
    
}
