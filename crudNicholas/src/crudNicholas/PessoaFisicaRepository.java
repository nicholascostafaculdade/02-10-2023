package crudNicholas;

import java.util.ArrayList;
import java.util.List;

public class PessoaFisicaRepository implements IPessoaRepository {
	List<PessoaFisica> listaPessoaFisica = new ArrayList<>();

	@Override
	public boolean insere(Pessoa pessoa) {
		boolean ok = false;
		try {
			PessoaFisica pf = (PessoaFisica) pessoa;

			ok = listaPessoaFisica.add(pf);
		} catch (Exception e) {
			ok = false;
		}
		return ok;
	}

	@Override
	public List<PessoaFisica> retornaLista() {
		return this.listaPessoaFisica;
	}

	@Override
	public boolean atualiza(Pessoa pessoa) {
		boolean ok = false;
		try {
			PessoaFisica pf = (PessoaFisica) pessoa;
			for (int i = 0; i < listaPessoaFisica.size(); i++) {
				if (listaPessoaFisica.get(i).equals(pessoa)) {
					listaPessoaFisica.set(i, pf);
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
			for (int i = 0; i < listaPessoaFisica.size(); i++) {
				if (listaPessoaFisica.get(i).getCpf() == id) {
					listaPessoaFisica.remove(i);
				}
			}

			ok = true;
		} catch (Exception e) {
			ok = false;
		}
		return ok;
	}

}
