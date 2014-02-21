package br.javamagazine.cadastro;

/**
 * Factory para o repositorio do carro
 * 
 * @author ricardo
 *
 */
public class RepositorioFactory {

  private static RepositorioCarro repositorio;

  public static RepositorioCarro getRepositorioCarro() {
    if (repositorio == null) {
      repositorio = new RepositorioCarroHttp();
    }
    return repositorio;
  }
}
