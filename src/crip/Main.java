package crip;

import org.mindrot.jbcrypt.BCrypt;
import java.util.Scanner;

public class Main {

	    public static void main(String[] args) {
	    	Scanner teclado = new Scanner(System.in);
	    	System.out.println("Informe a senha: ");
	        String senha = teclado.nextLine();
	        
	        // Hasheando
	        String senhaHash = BCrypt.hashpw(senha, BCrypt.gensalt(15)); // 15 é a quantidade de interações(custo), quanto maior mais lento e seguro
	        System.out.println("Senha hasheada: " + senhaHash);
	        
	        //String hash = "$2a$14$ou69z5SbDmZADkeh.pNq6OGSnSJ2m7anQmVpodiQQhIjL.6zve6T.";
	        
	        // Comparando Hashes
	        while(true){
	        System.out.println("Digite a senha para comparar: ");
	        String autenticar = teclado.nextLine();
	        String DB = senhaHash;
		        if (BCrypt.checkpw(autenticar, DB)) {// Companrando a senha digitada com a senha armazenada no BD
		            System.out.println("As senhas correspondem!");
		            break;
		        } else {
		            System.out.println("As senhas não correspondem.");
		        }
	        }
	       teclado.close();
	    }
	}

