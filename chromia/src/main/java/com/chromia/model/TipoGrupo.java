package com.chromia.model;

/**
 * @author Ariel Duarte
 * @since 23-Oct-2013
 * @version 1.0.0
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity
@Table(name="TIPO_GRUPO")
@NamedQueries(
		{
			@NamedQuery(name=TipoGrupo.GET_TIPO_GRUPO_BY_ID, query=TipoGrupo.GET_TIPO_GRUPO_BY_ID_QUERY),
			@NamedQuery(name=TipoGrupo.GET_ALL_TIPO_GRUPOS, query=TipoGrupo.GET_ALL_TIPO_GRUPOS_QUERY)
		}
)
public class TipoGrupo {

	static final String GET_TIPO_GRUPO_BY_ID_QUERY = "SELECT t FROM TipoGrupo t LEFT JOIN FETCH t.grupo where t.id = :id"; 
	public static final String GET_TIPO_GRUPO_BY_ID = "GET_TIPO_GRUPO_BY_ID"; 
	
	static final String GET_ALL_TIPO_GRUPOS_QUERY = "SELECT t FROM TipoGrupo t LEFT JOIN FETCH t.grupo"; 
	public static final String GET_ALL_TIPO_GRUPOS = "GET_ALL_TIPO_GRUPOS";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "tg_codigo")
	private Integer id;
	
	@Column(name="tg_nombre")
	private String nombre;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="gru_codigo")
    private Grupo grupo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
//	@OneToMany(mappedBy="tipoGrupo", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
//  private List<Articulo> articulos = new ArrayList<Articulo>();
	
}
