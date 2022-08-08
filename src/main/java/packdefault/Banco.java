package packdefault;
import java.util.List;

import lombok.Getter;
import lombok.Setter;



public class Banco {

	private @Getter @Setter String nome;
	private @Getter @Setter List<Conta> contas;


}
