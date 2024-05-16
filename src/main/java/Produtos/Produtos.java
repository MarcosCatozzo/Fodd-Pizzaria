package Produtos;

import jakarta.persistence.*;

@Entity
@Table(name="produtos")
public class Produtos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int Id;
	private String nome;
	private int preco;

	public Produtos(String nome, int preco){
		this.nome = nome;
		this.preco = preco;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}
}
