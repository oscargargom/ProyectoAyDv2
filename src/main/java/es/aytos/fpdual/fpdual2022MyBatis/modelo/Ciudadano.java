package es.aytos.fpdual.fpdual2022MyBatis.modelo;

import es.aytos.fpdual.fpdual2022MyBatis.Utilidades.Utilidades;

public class Ciudadano {

	private String id;
	private String nombre;
	private String direccion;
	private String facturacionAnual;
	private String paisResidencia;
	private String diasPermanencia;
	private String diasResidenciaSpain;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFacturacionAnual() {
		return facturacionAnual;
	}

	public void setFacturacionAnual(String facturacionAnual) {
		this.facturacionAnual = facturacionAnual;
	}

	public String getPaisResidencia() {
		return paisResidencia;
	}

	public void setPaisResidencia(String paisResidencia) {
		this.paisResidencia = paisResidencia;
	}

	public String getDiasResidenciaSpain() {
		return diasResidenciaSpain;
	}

	public void setDiasResidenciaSpain(String diasResidenciaSpain) {
		this.diasResidenciaSpain = diasResidenciaSpain;
	}

	public String traducirASqlValues() {

		return this.getId() + "," + Utilidades.sqlTratarTexto(this.getNombre()) + ","
				+ Utilidades.sqlTratarTexto(this.getDireccion()) + ","
				+ Utilidades.sqlTratarTexto(this.getFacturacionAnual()) + ","
				+ Utilidades.sqlTratarTexto(this.getPaisResidencia()) + ","
				+ Utilidades.sqlTratarTexto(this.getDiasPermanencia());
	}

	public String getDiasPermanencia() {
		return diasPermanencia;
	}

	public void setDiasPermanencia(String diasPermanencia) {
		this.diasPermanencia = diasPermanencia;
	}
}
