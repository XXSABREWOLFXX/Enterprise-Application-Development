package br.com.fiap.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * T_IMOVEL	
 * 		*CD_IMOVEL (PK) (SEQUENCE SQ_T_IMOVEL)
 * 		*DS_TIPO (VARCHAR) (ENUM)
 * 		VL_AREA (NUMBER)
 * 		DT_CONSTRUCAO (DATE)
 *		*DS_LOGRADOURO (VARCHAR(100))
 */

	@Entity
	@Table(name="TB_IMOVEL")
	@SequenceGenerator(name="imovel",sequenceName="SQ_T_IMOVEL",allocationSize=1)
	
public class Imovel {
		
		@Id
		@Column(name="cd_imovel")
		@GeneratedValue(generator="imovel",strategy=GenerationType.SEQUENCE)
		private int codigo;
		
		@Enumerated(EnumType.STRING) //para utilizar String ao invés de número, coluna tipo VARCHAR
		@Column(name="ds_tipo", nullable = false)
		private Tipo tipo;
		
		@Column(name="vl_area")
		private int area;
		
		@Temporal(TemporalType.DATE)
		@Column(name="dt_construcao", nullable = false)
		private Date dataConstr;
		
		@Column(name="ds_logradouro", nullable = false, length=100)
		private String logradouro;

		public Imovel() {
			super();
		}

		public Imovel(int codigo, Tipo tipo, int area, Date dataConstr, String logradouro) {
			super();
			this.codigo = codigo;
			this.tipo = tipo;
			this.area = area;
			this.dataConstr = dataConstr;
			this.logradouro = logradouro;
		}

		public Imovel(Tipo tipo, int area, Date dataConstr, String logradouro) {
			super();
			this.tipo = tipo;
			this.area = area;
			this.dataConstr = dataConstr;
			this.logradouro = logradouro;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public Tipo getTipo() {
			return tipo;
		}

		public void setTipo(Tipo tipo) {
			this.tipo = tipo;
		}

		public int getArea() {
			return area;
		}

		public void setArea(int area) {
			this.area = area;
		}

		public Date getDataConstr() {
			return dataConstr;
		}

		public void setDataConstr(Date dataConstr) {
			this.dataConstr = dataConstr;
		}

		public String getLogradouro() {
			return logradouro;
		}

		public void setLogradouro(String logradouro) {
			this.logradouro = logradouro;
		}
	
		
}
