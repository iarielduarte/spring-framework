package com.chromia.controller;

/**
 * @author Ariel Duarte
 * @since 29-Marzo-2014
 * @version 1.0.0
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.springframework.dao.DataAccessException;

import com.chromia.model.Articulo;
import com.chromia.service.IArticuloService;
import com.chromia.service.IGrupoService;
import com.chromia.service.IMarcaService;
import com.chromia.service.IPaisService;
import com.chromia.service.ITipoGrupoService;
import com.chromia.service.IUbicacionService;

@ManagedBean(name = "articuloMBean")
@ViewScoped
public class ArticuloManagedBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@ManagedProperty(value = "#{GrupoService}")
	private IGrupoService grupoService;
	
	@ManagedProperty(value = "#{TipoGrupoService}")
	private ITipoGrupoService tipoGrupoService;
	
	@ManagedProperty(value = "#{MarcaService}")
	private IMarcaService marcaService;
	
	@ManagedProperty(value = "#{UbicacionService}")
	private IUbicacionService ubicacionService;
	
	@ManagedProperty(value = "#{PaisService}")
	private IPaisService paisService;
	
	@ManagedProperty(value = "#{ArticuloService}")
	private IArticuloService articuloService;
	
	
	private String nombre;
	private Integer marca;
	private Integer grupo;
	private Integer tipoGrupo;
	private Integer pais;
	private Integer ubicacion;
	private String codigoBarra;
	private String nombreFactura;
	private String codigoOrigen;
	private String numeroPieza;
	private String codigoMarca;
	private Double precioActual;
	private Double precioAnterior;
	private Double precioVenta;
	private String tipoIva;
	private Integer stockMinimo;
	private String observaciones;
	private Integer iva;
	
	private List<Articulo> articulos;
	private List<Articulo> filteredArticulos;  
	private Articulo selectedArticulo; 
	
	@PostConstruct
	public void inicializar() {
    	articulos = getArticuloService().getArticulos();
		
	}
	
	/*TODO: Getters...and...Setters*/
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String name) {
		this.nombre = name;
	}

	public Integer getMarca() {
		return marca;
	}

	public void setMarca(Integer marca) {
		this.marca = marca;
	}

	public Integer getGrupo() {
		return grupo;
	}

	public void setGrupo(Integer grupo) {
		this.grupo = grupo;
	}

	public Integer getTipoGrupo() {
		return tipoGrupo;
	}

	public void setTipoGrupo(Integer tipoGrupo) {
		this.tipoGrupo = tipoGrupo;
	}

	public Integer getPais() {
		return pais;
	}

	public void setPais(Integer pais) {
		this.pais = pais;
	}

	public Integer getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Integer ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	public String getNombreFactura() {
		return nombreFactura;
	}

	public void setNombreFactura(String nombreFactura) {
		this.nombreFactura = nombreFactura;
	}

	public String getCodigoOrigen() {
		return codigoOrigen;
	}

	public void setCodigoOrigen(String codigoOrigen) {
		this.codigoOrigen = codigoOrigen;
	}

	public String getNumeroPieza() {
		return numeroPieza;
	}

	public void setNumeroPieza(String numeroPieza) {
		this.numeroPieza = numeroPieza;
	}

	public String getCodigoMarca() {
		return codigoMarca;
	}

	public void setCodigoMarca(String codigoMarca) {
		this.codigoMarca = codigoMarca;
	}

	public Double getPrecioActual() {
		return precioActual;
	}

	public void setPrecioActual(Double precioActual) {
		this.precioActual = precioActual;
	}

	public Double getPrecioAnterior() {
		return precioAnterior;
	}

	public void setPrecioAnterior(Double precioAnterior) {
		this.precioAnterior = precioAnterior;
	}

	public Double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public String getTipoIva() {
		return tipoIva;
	}

	public void setTipoIva(String tipoIva) {
		this.tipoIva = tipoIva;
	}

	public Integer getStockMinimo() {
		return stockMinimo;
	}

	public void setStockMinimo(Integer stockMinimo) {
		this.stockMinimo = stockMinimo;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Integer getIva() {
		return iva;
	}

	public void setIva(Integer iva) {
		this.iva = iva;
	}

	public IArticuloService getArticuloService() {
		return articuloService;
	}

	public void setArticuloService(IArticuloService articuloService) {
		this.articuloService = articuloService;
	}

	public IGrupoService getGrupoService() {
		return grupoService;
	}

	public void setGrupoService(IGrupoService grupoService) {
		this.grupoService = grupoService;
	}

	public ITipoGrupoService getTipoGrupoService() {
		return tipoGrupoService;
	}

	public void setTipoGrupoService(ITipoGrupoService tipoGrupoService) {
		this.tipoGrupoService = tipoGrupoService;
	}

	public IMarcaService getMarcaService() {
		return marcaService;
	}

	public void setMarcaService(IMarcaService marcaService) {
		this.marcaService = marcaService;
	}

	public IUbicacionService getUbicacionService() {
		return ubicacionService;
	}

	public void setUbicacionService(IUbicacionService ubicacionService) {
		this.ubicacionService = ubicacionService;
	}

	public IPaisService getPaisService() {
		return paisService;
	}

	public void setPaisService(IPaisService paisService) {
		this.paisService = paisService;
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}
	
	


	public Articulo getSelectedArticulo() {
		if(selectedArticulo==null)
			selectedArticulo = getArticuloService().getArticulos().get(0); 
		return selectedArticulo;
	}

	public void setSelectedArticulo(Articulo selectedArticulo) {
		this.selectedArticulo = selectedArticulo;
	}

	public List<Articulo> getFilteredArticulos() {
		return filteredArticulos;
	}

	public void setFilteredArticulos(List<Articulo> filteredArticulos) {
		this.filteredArticulos = filteredArticulos;
	}

//	TODO: Action Listener
	
	public void onCreate(ActionEvent actionEvent) {
		try {
			
			
		    if(getArticuloService().addArticulo(this.articuloAdd()))
		    {
		    	onReset();
		        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Exito : ",  "El articulo "+articuloAdd().getNombre()+" se guardo con éxito :)");
		        FacesContext.getCurrentInstance().addMessage(null, message);
		    }else{
		    	FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error : ",  "El articulo "+articuloAdd().getNombre()+" no se pudo guardo :(");
		        FacesContext.getCurrentInstance().addMessage(null, message);
		    }
		} catch (DataAccessException e) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error de Conexión: ",  "Error en el acceso a la base de datos, Detalle: "+e.getMessage()+" x(");
	        FacesContext.getCurrentInstance().addMessage(null, message);
		}

	}

	
	public void onEdit(ActionEvent actionEvent) {
		try {
			
		    if(getArticuloService().updateArticulo(getSelectedArticulo()))
		    {
		    	onReset();
		        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Exito : ",  "El articulo "+this.selectedArticulo.getNombre()+" se modifico con éxito :)");
		        FacesContext.getCurrentInstance().addMessage(null, message);
		    }else{
		    	FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error : ",  "El articulo "+this.selectedArticulo.getNombre()+" no se pudo modificar :(");
		        FacesContext.getCurrentInstance().addMessage(null, message);
		    }
		} catch (DataAccessException e) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error de Conexión : ",  "Error en el acceso a la base de datos, Detalle: "+e.getMessage()+" x(");
	        FacesContext.getCurrentInstance().addMessage(null, message);
		}
	}
	
	public void onDelete(ActionEvent actionEvent) {
	    try {
			
		    if(getArticuloService().deleteArticulo(getSelectedArticulo()))
		    {
		    	onReset();
		        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Exito : ",  "El articulo "+getSelectedArticulo().getNombre()+" fue eliminado con éxito :)");
		        FacesContext.getCurrentInstance().addMessage(null, message);
		    }else{
		    	FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error : ",  "El articulo "+getSelectedArticulo().getNombre()+" no se pudo eliminar :(");
		        FacesContext.getCurrentInstance().addMessage(null, message);
		    }
		} catch (DataAccessException e) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error de Conexión : ",  "Error en el acceso a la base de datos, Detalle: "+e.getMessage()+" x(");
	        FacesContext.getCurrentInstance().addMessage(null, message);
		}
	}
	
	public void onReset(){
		articulos = new ArrayList<Articulo>();
		articulos.addAll(getArticuloService().getArticulos());
		filteredArticulos  = new ArrayList<Articulo>();
		filteredArticulos.addAll(articulos);
	}
	
	public Articulo articuloAdd(){
		Articulo add = new Articulo();
		add.setNombre(getNombre());
		add.setGrupo(getGrupoService().getGrupoById(getGrupo()));
		add.setTipoGrupo(getTipoGrupoService().getTipoGrupoById(getTipoGrupo()));
		add.setMarca(getMarcaService().getMarcaById(getMarca()));
		add.setPais(getPaisService().getPaisById(getPais()));
		add.setUbicacion(getUbicacionService().getUbicacionById(getUbicacion()));
		add.setCodigoBarra(getCodigoBarra());
		add.setNombreFactura(getNombreFactura());
		add.setCodigoOrigen(getCodigoOrigen());
		add.setNumeroPieza(getNumeroPieza());
		add.setCodigoMarca(getCodigoMarca());
		add.setPrecioActual(getPrecioActual());
		add.setPrecioAnterior(getPrecioAnterior());
		add.setPrecioVenta(getPrecioVenta());
		add.setTipoIva(getTipoIva());
		add.setStockMinimo(getStockMinimo());
		add.setObservaciones(getObservaciones());
		add.setIva(getIva());
		
		return add;
	}

}
