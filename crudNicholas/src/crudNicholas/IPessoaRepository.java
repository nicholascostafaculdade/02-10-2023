package crudNicholas;

import java.util.List;

public interface IPessoaRepository {
	public boolean insere(Pessoa pessoa);

	public List<?> retornaLista();

	public boolean atualiza(Pessoa pessoa);

	public boolean deletePessoa(String id);
}
