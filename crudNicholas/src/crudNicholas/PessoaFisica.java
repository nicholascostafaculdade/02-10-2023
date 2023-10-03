package crudNicholas;

public class PessoaFisica extends Pessoa {
	private String cpf;

	public PessoaFisica(String nome) {
		super(nome);
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
