package br.javamagazine.cadastro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import android.annotation.SuppressLint;
import android.widget.Toast;
import br.javamagazine.cadastro.Carro;
import br.javamagazine.cadastro.RepositorioCarro;

/**
 * Implementa��o "Fake"
 * 
 * @author ricardo
 *
 */
@SuppressLint("ShowToast")
public class RepositorioCarroFake implements RepositorioCarro {
  private static final Map<Long, Carro> map = new HashMap<Long, Carro>();
  private static long nextId = 0;
  JSONObject carroJson = new JSONObject();

  static {
    RepositorioCarroFake rep = new RepositorioCarroFake();
    try {
		rep.salvar(new Carro("Carro 1", "ABC-1011", 2009));
		rep.salvar(new Carro("Carro 2", "ABC-1012", 2009));
		rep.salvar(new Carro("Carro 3", "ABC-1013", 2009));
		rep.salvar(new Carro("Carro 4", "ABC-1014", 2009));
		rep.salvar(new Carro("Carro 5", "ABC-1015", 2009));
		rep.salvar(new Carro("Carro 6", "ABC-1011", 2009));
		rep.salvar(new Carro("Carro 7", "ABC-1012", 2009));
		rep.salvar(new Carro("Carro 8", "ABC-1013", 2009));
		rep.salvar(new Carro("Carro 9", "ABC-1014", 2009));
		rep.salvar(new Carro("Carro 10", "ABC-1015", 2009));
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   
  }

  @Override
  public Carro getCarro(Long id) {
    return map.get(id);
  }

  @Override
  public Carro buscarCarroPorNome(String nome) {
    List<Carro> carros = listarCarros();
    for (Carro carro : carros) {
      if (carro.getNome().equals(nome)) { return carro; }
    }
    return null;
  }

  @Override
  public boolean deletar(Carro carro) {
    map.remove(carro.getId());
    return true;
  }

  @Override
  public List<Carro> listarCarros() {
    Collection<Carro> carros = map.values();
    List<Carro> lista = new ArrayList<Carro>(carros);
    return lista;
  }

  @Override
  public boolean salvar(Carro carro) throws JSONException {
    if (carro.getId() == null) {
      // Se � um novo carro, incrementa um novo id
      carro.setId(++nextId);
      carroJson.put("Carro", carro);
    }
    // Atualiza o carro, ou insere um novo com o pr�ximo id
    map.put(carro.getId(), carro);
    carroJson.put("Carro", carro);
    return true;
  }
  
  public String retornoJSON(JSONObject carroJson2){
	 return carroJson2.toString();
  }

@Override
public String retorno() {
	return carroJson.toString();
}
}
