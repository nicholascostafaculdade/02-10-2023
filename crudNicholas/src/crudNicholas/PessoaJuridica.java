package crudNicholas;

public class PessoaJuridica extends Pessoa {
	private String cnpj;

	public PessoaJuridica(String nome) {
		super(nome);
	}

	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
