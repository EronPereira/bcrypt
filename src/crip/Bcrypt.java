package crip;

import org.mindrot.jbcrypt.BCrypt;

public class Bcrypt {
	
	public void hash(String senha) {
		String senhaHash = BCrypt.hashpw(senha, BCrypt.gensalt(15));
		
		
	}
	
	public void comparandoHash(String senha) {
		
		
		if (BCrypt.checkpw(senha, )) {// Comparando a senha digitada com a senha armazenada no BD
            System.out.println("As senhas correspondem!");
            break;
        } else {
            System.out.println("As senhas não correspondem.");
        }
	}
}
