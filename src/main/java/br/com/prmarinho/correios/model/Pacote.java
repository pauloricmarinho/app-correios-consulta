package br.com.prmarinho.correios.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import br.com.prmarinho.correios.enums.CategoriaPacote;
import br.com.prmarinho.correios.enums.StatusPacote;

@Entity
@Table(name = "tbl_pacote")
public class Pacote {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="Campo Código é Obrigatório.")
	@Size(max = 13, min=10 , message = "Tamanho do Código Inválido.")
	private String codigo;
	
	@NotEmpty(message="Campo Descrição é Obrigatório.")
	@Size(max=150, message="A Descrição não deve conter mais de 150 caracteres")
	private String descricao;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	@NotNull(message = "O Campo Data da Compra não pode ser Nulo.")
	private Date dataCompra;
	
	@Temporal(TemporalType.DATE)
	@CreationTimestamp
	private Date dataCadastro;
	
	@NotNull(message = "O Campo Valor não pode ser Nulo.")
	@DecimalMin(value="0.01", message = "Valor não pode ser menor que 0,01")
	@DecimalMax(value="9999.99", message = "Valor não pode ser maior que 9999,99")
	@NumberFormat(pattern="#,##0.00")
	private BigDecimal valor;
	
	@Enumerated(EnumType.STRING)
	private StatusPacote status;
	
	@Enumerated(EnumType.STRING)
	private CategoriaPacote categoria;
	
	public boolean isPendente() {
		return StatusPacote.PENDENTE.equals(this.status);
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCategoria(CategoriaPacote categoria) {
		this.categoria = categoria;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public StatusPacote getStatus() {
		return status;
	}

	public void setStatus(StatusPacote status) {
		this.status = status;
	}

	public CategoriaPacote getCategoria() {
		return categoria;
	}

	public void setCatetoria(CategoriaPacote categoria) {
		this.categoria = categoria;
	}
	
	
	
}
