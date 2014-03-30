package com.chromia.model;

/**
 * @author Ariel Duarte
 * @since 29-Marzo-2014
 * @version 1.0.0
 */


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.Table;
import javax.persistence.NamedQuery;



@Entity
@Table(name="PAIS")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@NamedQueries(
		{
			@NamedQuery(name=Pais.GET_PAIS_BY_ID, query=Pais.GET_PAIS_BY_ID_QUERY),
			@NamedQuery(name=Pais.GET_ALL_PAISES, query=Pais.GET_ALL_PAISES_QUERY)
		}
)
public class Pais {

	static final String GET_PAIS_BY_ID_QUERY = "from Pais p where p.id = :id"; 
	public static final String GET_PAIS_BY_ID = "GET_PAIS_BY_ID"; 
	
	static final String GET_ALL_PAISES_QUERY = "from Pais"; 
	public static final String GET_ALL_PAISES = "GET_ALL_PAISES";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "pais_codigo")
	private Integer id;
	
	@Column(name="pais_nombre")
	private String nombre;
	
	@Column(name="pais_gentilicio")
	private String gentilicio;

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

	public String getGentilicio() {
		return gentilicio;
	}

	public void setGentilicio(String gentilicio) {
		this.gentilicio = gentilicio;
	}
	
	
	
//	@OneToMany(mappedBy="grupo", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
//    private List<Articulo> articulos = new ArrayList<Articulo>();

	
	
	
	
	
}
