package ar.edu.uade.controller;

import java.util.List;

import ar.edu.uade.dto.ColegioDTO;
import ar.edu.uade.dto.CursoDTO;
import ar.edu.uade.dto.PreInscripcionDTO;
import ar.edu.uade.dto.ReporteDTO;
import ar.edu.uade.dto.UsuarioDTO;
import ar.edu.uade.model.Colegio;
import ar.edu.uade.model.Curso;
import ar.edu.uade.model.PreInscripcion;
import ar.edu.uade.model.Usuario;

public class SistemaInscripciones {

	private static SistemaInscripciones instance = null;
	private List<Colegio> colegios;
	private List<Usuario> usuarios;
	private List<PreInscripcion> preInscripciones;
	private PreInscripcion preInscripcionActual;
	private Usuario usuarioActual;
	
	public static SistemaInscripciones getInstance() {
		if (instance == null) 
			instance = new SistemaInscripciones();
		return instance;
	}
	
	public int guardarPreInscripcion(PreInscripcionDTO dto) {
		return 0;
		
	}
	
	public List<PreInscripcionDTO> asignarVacantes() {
		return null;
	}
	
	public List<PreInscripcionDTO> getPreInscripcionesSinAsignacion() {
		return null;
	}
	
	public void validarPreInscripcion(int codigoPreInscripcion) {
		
	}
	
	public List<CursoDTO> sugerirCursos(String direccion, int grado) {
		return null;
	}
	
	public void modificarPreInscripcion(PreInscripcionDTO preInsc) {
		
	}
	
	public PreInscripcionDTO cargarPreInscripcionPorCodigo(String codigo) {
		return null;
	}
	
	public ColegioDTO cargarColegioPorUsuario() {
		return null;
	}
	
	public void guardarUsuario(UsuarioDTO usuario) {
		
	}
	
	public void bajausuario(String nombreUsuario) {
		
	}
	
	public int guardarColegio(ColegioDTO colegio) {
		return 0;
	}
	
	public void modificarColegio(ColegioDTO colegio) {
		
	}
	
	public void bajaColegio(int codigoColegio) {
		
	}
	
	public void modificarVacantes(ColegioDTO colegio) {
		
	}
	
	public ReporteDTO generarReportePorColegio() {
		return null;
	}
	
	public ReporteDTO generarReporteGeneral() {
		return null;
	}
	
	private List<Curso> buscarColegiosCercanos(String direccion, int grado) {
		return null;
	}
	
	private PreInscripcion buscarPreInscripcionPorCodigo(int codigo)  {
		return null;
	}
	
	private Colegio buscarColegioPorCodigo(int codigo) {
		return null;
	}

	public List<Colegio> getColegios() {
		return colegios;
	}

	public void setColegios(List<Colegio> colegios) {
		this.colegios = colegios;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<PreInscripcion> getPreInscripciones() {
		return preInscripciones;
	}

	public void setPreInscripciones(List<PreInscripcion> preInscripciones) {
		this.preInscripciones = preInscripciones;
	}

	public PreInscripcion getPreInscripcionActual() {
		return preInscripcionActual;
	}

	public void setPreInscripcionActual(PreInscripcion preInscripcionActual) {
		this.preInscripcionActual = preInscripcionActual;
	}

	public Usuario getUsuarioActual() {
		return usuarioActual;
	}

	public void setUsuarioActual(Usuario usuarioActual) {
		this.usuarioActual = usuarioActual;
	}

	public static void setInstance(SistemaInscripciones instance) {
		SistemaInscripciones.instance = instance;
	}

	public Colegio buscarColegioPorCodigoDeCurso(int codigo) {
		for(Colegio colegio : colegios) {
			for(Curso curso : colegio.getCursos()){
				if (curso.getCodigo() == codigo){
					return colegio;
				}
			}
		}
		return null;
	}
}


