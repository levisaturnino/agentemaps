package br.com.agentemaps.model;
// Generated 26/09/2016 16:25:14 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Familia generated by hbm2java
 */
@Entity
@Table(name = "familia", catalog = "agentemaps")
public class Familia implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3571751494842141719L;
	private Integer id;
	private String uf;
	private String logradouro;
	private String numero;
	private String bairro;
	private String cep;
	private String codigoMunicipio;
	private String segmento;
	private String area;
	private String microarea;
	private Date data;
	private TratamentoAgua tratamentoAgua;
	private AbastecimentoAgua abastecimentoAgua;
	private DestinoFezes destinoFezes;
	private TipoCasa tipoCasa;
	private DestinoLixo destinoLixo;

	public Familia() {
	}

	public Familia(String uf, String logradouro, String numero, String bairro, String cep, String codigoMunicipio,
			String segmento, String area, String microarea, Date data, TratamentoAgua tratamentoAgua,
			AbastecimentoAgua abastecimentoAgua, DestinoFezes destinoFezes, TipoCasa tipoCasa,
			DestinoLixo destinoLixo) {
		this.uf = uf;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.codigoMunicipio = codigoMunicipio;
		this.segmento = segmento;
		this.area = area;
		this.microarea = microarea;
		this.data = data;
		this.tratamentoAgua = tratamentoAgua;
		this.abastecimentoAgua = abastecimentoAgua;
		this.destinoFezes = destinoFezes;
		this.tipoCasa = tipoCasa;
		this.destinoLixo = destinoLixo;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "uf", length = 2)
	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Column(name = "logradouro")
	public String getLogradouro() {
		return this.logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	@Column(name = "numero", length = 2)
	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Column(name = "bairro", length = 100)
	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Column(name = "cep", length = 10)
	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Column(name = "codigo_municipio", length = 7)
	public String getCodigoMunicipio() {
		return this.codigoMunicipio;
	}

	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	@Column(name = "segmento", length = 2)
	public String getSegmento() {
		return this.segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	@Column(name = "area", length = 3)
	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "microarea", length = 2)
	public String getMicroarea() {
		return this.microarea;
	}

	public void setMicroarea(String microarea) {
		this.microarea = microarea;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "data", length = 10)
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "familia")
	public TratamentoAgua getTratamentoAgua() {
		return this.tratamentoAgua;
	}

	public void setTratamentoAgua(TratamentoAgua tratamentoAgua) {
		this.tratamentoAgua = tratamentoAgua;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "familia")
	public AbastecimentoAgua getAbastecimentoAgua() {
		return this.abastecimentoAgua;
	}

	public void setAbastecimentoAgua(AbastecimentoAgua abastecimentoAgua) {
		this.abastecimentoAgua = abastecimentoAgua;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "familia")
	public DestinoFezes getDestinoFezes() {
		return this.destinoFezes;
	}

	public void setDestinoFezes(DestinoFezes destinoFezes) {
		this.destinoFezes = destinoFezes;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "familia")
	public TipoCasa getTipoCasa() {
		return this.tipoCasa;
	}

	public void setTipoCasa(TipoCasa tipoCasa) {
		this.tipoCasa = tipoCasa;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "familia")
	public DestinoLixo getDestinoLixo() {
		return this.destinoLixo;
	}

	public void setDestinoLixo(DestinoLixo destinoLixo) {
		this.destinoLixo = destinoLixo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((abastecimentoAgua == null) ? 0 : abastecimentoAgua.hashCode());
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((codigoMunicipio == null) ? 0 : codigoMunicipio.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((destinoFezes == null) ? 0 : destinoFezes.hashCode());
		result = prime * result + ((destinoLixo == null) ? 0 : destinoLixo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((logradouro == null) ? 0 : logradouro.hashCode());
		result = prime * result + ((microarea == null) ? 0 : microarea.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((segmento == null) ? 0 : segmento.hashCode());
		result = prime * result + ((tipoCasa == null) ? 0 : tipoCasa.hashCode());
		result = prime * result + ((tratamentoAgua == null) ? 0 : tratamentoAgua.hashCode());
		result = prime * result + ((uf == null) ? 0 : uf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Familia other = (Familia) obj;
		if (abastecimentoAgua == null) {
			if (other.abastecimentoAgua != null)
				return false;
		} else if (!abastecimentoAgua.equals(other.abastecimentoAgua))
			return false;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (codigoMunicipio == null) {
			if (other.codigoMunicipio != null)
				return false;
		} else if (!codigoMunicipio.equals(other.codigoMunicipio))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (destinoFezes == null) {
			if (other.destinoFezes != null)
				return false;
		} else if (!destinoFezes.equals(other.destinoFezes))
			return false;
		if (destinoLixo == null) {
			if (other.destinoLixo != null)
				return false;
		} else if (!destinoLixo.equals(other.destinoLixo))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (logradouro == null) {
			if (other.logradouro != null)
				return false;
		} else if (!logradouro.equals(other.logradouro))
			return false;
		if (microarea == null) {
			if (other.microarea != null)
				return false;
		} else if (!microarea.equals(other.microarea))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (segmento == null) {
			if (other.segmento != null)
				return false;
		} else if (!segmento.equals(other.segmento))
			return false;
		if (tipoCasa == null) {
			if (other.tipoCasa != null)
				return false;
		} else if (!tipoCasa.equals(other.tipoCasa))
			return false;
		if (tratamentoAgua == null) {
			if (other.tratamentoAgua != null)
				return false;
		} else if (!tratamentoAgua.equals(other.tratamentoAgua))
			return false;
		if (uf == null) {
			if (other.uf != null)
				return false;
		} else if (!uf.equals(other.uf))
			return false;
		return true;
	}
	
	

}
