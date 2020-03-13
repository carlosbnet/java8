package apploja;


import java.util.ArrayList;
import java.util.List;



public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	
	
	
	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
		
	}
	
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

}
