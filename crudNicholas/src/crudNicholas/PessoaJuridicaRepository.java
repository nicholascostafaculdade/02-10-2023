package crudNicholas;

import java.util.ArrayList;
import java.util.List;

public class PessoaJuridicaRepository implements IPessoaRepository {
	List<PessoaJuridica> listaPessoaJuridica = new ArrayList<>();

	@Override
	public boolean insere(Pessoa pessoa) {
		boolean ok = false;
		try {
			PessoaJuridica pj = (PessoaJuridica) pessoa;

			ok = listaPessoaJuridica.add(pj);
		} catch (Exception e) {
			ok = false;
		}
		return ok;
	}

	@Override
	public List<?> retornaLista() {
		return this.listaPessoaJuridica;
	}

	@Override
	public boolean atualiza(Pessoa pessoa) {
		Boolean ok = false;

		try {
			PessoaJuridica pj = (PessoaJuridica) pessoa;
			for (int i = 0; i < listaPessoaJuridica.size(); i++) {
				if (listaPessoaJuridica.get(i).equals(pessoa)) {
					listaPessoaJuridica.set(i, pj);
				}
			}

			ok = true;
		} catch (Exception e) {
			ok = false;
		}
		return ok;
	}

	@Override
	public boolean deletePessoa(String id) {
		boolean ok = false;
		try {
			for (int i = 0; i < listaPessoaJuridica.size(); i++) {
				if (listaPessoaJuridica.get(i).getCnpj() == id) {
					listaPessoaJuridica.remove(i);
				}
			}

			ok = true;
		} catch (Exception e) {
			ok = false;
		}
		return ok;
	}

}
