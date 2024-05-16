package CadastroCliente;

import jakarta.persistence.*;

@Entity
@Table(name="cadastro")
public class Cadastro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	@Column(name="nome")
	private String Nome;
	@Column(name="telefone")
	private String Telefone;
	@Column(name="endereco")
	private String Endereco;

	public Cadastro(){}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
}
