package com.predial.servicio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import com.predial.modelo.AbonosModelo;   
import com.predial.modelo.AbonosOtrosModelo;   
import com.predial.modelo.AbonosPredialModelo;   
import com.predial.modelo.AcuerdoVigenciasModelo;   
import com.predial.modelo.AlivioAvaluosDetModelo;   
import com.predial.modelo.AlivioAvaluosModelo;   
import com.predial.modelo.AlivioOtrosModelo;   
import com.predial.modelo.AnoModelo;   
import com.predial.modelo.ArchivosPlanosModelo;   
import com.predial.modelo.AutorizacionesModelo;   
import com.predial.modelo.avaluosCuotaModelo;   
import com.predial.modelo.AvaluosModelo;   
import com.predial.modelo.BancosModelo;   
import com.predial.modelo.BancosOtrosCobrosModelo;   
import com.predial.modelo.BarrasModelo;   
import com.predial.modelo.BDME1Modelo;   
import com.predial.modelo.BDME2Modelo;   
import com.predial.modelo.BDME3Modelo;   
import com.predial.modelo.BDME4Modelo;   
import com.predial.modelo.BDME5Modelo;   
import com.predial.modelo.Car_CarteraGeneral_aval_ajusteModelo;   
import com.predial.modelo.Car_CarteraGeneral_avalModelo;   
import com.predial.modelo.Car_CarteraGeneral_OtrosModelo;   
import com.predial.modelo.Car_CarteraGeneralModelo;   
import com.predial.modelo.Car_ClasificacionDeudoresModelo;   
import com.predial.modelo.CAR_PagoFinanciablesModelo;   
import com.predial.modelo.Car_PeriodosModelo;   
import com.predial.modelo.CategoriasSCHIPModelo;   
import com.predial.modelo.CGNENTIDADModelo;   
import com.predial.modelo.CoactivoModelo;   
import com.predial.modelo.ColumnasModelo;   
import com.predial.modelo.ConceptosCobrosModelo;   
import com.predial.modelo.ConceptosDetalleModelo;   
import com.predial.modelo.ConceptosFinanciablesModelo;   
import com.predial.modelo.ConceptosModelo;   
import com.predial.modelo.ConceptosPredialModelo;   
import com.predial.modelo.ConfiguracionCntFinModelo;   
import com.predial.modelo.ConfiguracionContableModelo;   
import com.predial.modelo.ConsultasModelo;   
import com.predial.modelo.ControlFormularioModelo;   
import com.predial.modelo.CuotasModelo;   
import com.predial.modelo.DescuentosModelo;   
import com.predial.modelo.DestinoEconomicoModelo;   
import com.predial.modelo.Det_ResolucionModelo;   
import com.predial.modelo.Det_Tabla_ResolucionModelo;   
import com.predial.modelo.DevolucionesModelo;   
import com.predial.modelo.devolucionesotrosModelo;   
import com.predial.modelo.devolucionFinanciablesModelo;   
import com.predial.modelo.DoblesPagosModelo;   
import com.predial.modelo.DoblesPagosOtrosModelo;   
import com.predial.modelo.docParametroModelo;   
import com.predial.modelo.DocumentosModelo;   
import com.predial.modelo.DocumentsTblModelo;   
import com.predial.modelo.EstadoCarteraModelo;   
import com.predial.modelo.EstadosModelo;   
import com.predial.modelo.EstratosModelo;   
import com.predial.modelo.ExcencionesModelo;   
import com.predial.modelo.ExcencionOtrosModelo;   
import com.predial.modelo.ExcencionPredialModelo;   
import com.predial.modelo.FinanciablesModelo;   
import com.predial.modelo.GruposFormularioModelo;   
import com.predial.modelo.GruposFormulariosModelo;   
import com.predial.modelo.GruposModelo;   
import com.predial.modelo.HistoricosPrediosModelo;   
import com.predial.modelo.IGAC_CamModelo;   
import com.predial.modelo.IGACModelo;   
import com.predial.modelo.InteresesModelo;   
import com.predial.modelo.InteresesPorAnosModelo;   
import com.predial.modelo.MenusModelo;   
import com.predial.modelo.Mes_PredialModelo;   
import com.predial.modelo.MesesCuotasModelo;   
import com.predial.modelo.MesesInteresesModelo;   
import com.predial.modelo.MesesModelo;   
import com.predial.modelo.Minutas2Modelo;   
import com.predial.modelo.mod010_estratosOtrosCobrosModelo;   
import com.predial.modelo.mod010_insolvenciaAvaluosModelo;   
import com.predial.modelo.mod010_insolvenciaModelo;   
import com.predial.modelo.mod010_insolvenciaOtrosModelo;   
import com.predial.modelo.mod010_porMaximoModelo;   
import com.predial.modelo.mod010_recaudosAvaluosModelo;   
import com.predial.modelo.mod010_recaudosOtrosModelo;   
import com.predial.modelo.mod010_tarifasOtrosCobrosModelo;   
import com.predial.modelo.ModificacionesModelo;   
import com.predial.modelo.ModificacionTipoModelo;   
import com.predial.modelo.ModulosModelo;   
import com.predial.modelo.MorososSCHIPModelo;   
import com.predial.modelo.NovedadRecaudosModelo;   
import com.predial.modelo.NuevosModelo;   
import com.predial.modelo.OpcionesModelo;   
import com.predial.modelo.otrosCobrosCuotaModelo;   
import com.predial.modelo.OtrosCobrosModelo;   
import com.predial.modelo.PagoFinanciablesModelo;   
import com.predial.modelo.ParametroModelo;   
import com.predial.modelo.PazYSalvosModelo;   
import com.predial.modelo.PermisosModelo;   
import com.predial.modelo.Personal_FactoresModelo;   
import com.predial.modelo.PlanaInterfaceFacSerModelo;   
import com.predial.modelo.Pre_ResolucionSancionModelo;   
import com.predial.modelo.PredioObservacionesModelo;   
import com.predial.modelo.Predios_AlivioModelo;   
import com.predial.modelo.Predios_AlivioOtrosModelo;   
import com.predial.modelo.Predios_FacturaModelo;   
import com.predial.modelo.PrediosCanceladosModelo;   
import com.predial.modelo.PrediosModelo;   
import com.predial.modelo.PrivilegiosModelo;   
import com.predial.modelo.PropietariosModelo;   
import com.predial.modelo.RecaudoDiarioAdicionalesModelo;   
import com.predial.modelo.RecaudoDiarioModelo;   
import com.predial.modelo.RecaudosModelo;   
import com.predial.modelo.RecibosAnuladosModelo;   
import com.predial.modelo.ResolucionModelo;   
import com.predial.modelo.ResolucionPredialModelo;   
import com.predial.modelo.SubFinanciablesModelo;   
import com.predial.modelo.Tabla_ResolucionModelo;   
import com.predial.modelo.TarifasModelo;   
import com.predial.modelo.Tbl_QryDocumentosModelo;   
import com.predial.modelo.tblActuacionesModelo;   
import com.predial.modelo.tblCoactivoActuacionesModelo;   
import com.predial.modelo.tblCoactivoModelo;   
import com.predial.modelo.tblconsultasModelo;   
import com.predial.modelo.TblFormsModelo;   
import com.predial.modelo.tipo1Modelo;   
import com.predial.modelo.tipo3Modelo;
import com.predial.repositorio.CrudRepositorio;
import com.predial.modelo.TipoArchivoRecaudosModelo;   
import com.predial.modelo.TipoIdentificacionModelo;   
import com.predial.modelo.TipoObservacionModelo;   
import com.predial.modelo.VariablesModelo;   
import com.predial.modelo.VencimientosModelo;   
import com.predial.modelo.VeredasModelo;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;

public class ServicioQueryJoin implements CrudRepositorio{
	AbonosModelo AbonosModelo = new AbonosModelo(); 
	AbonosOtrosModelo AbonosOtrosModelo = new AbonosOtrosModelo(); 
	AbonosPredialModelo AbonosPredialModelo = new AbonosPredialModelo(); 
	AcuerdoVigenciasModelo AcuerdoVigenciasModelo = new AcuerdoVigenciasModelo(); 
	AlivioAvaluosDetModelo AlivioAvaluosDetModelo = new AlivioAvaluosDetModelo(); 
	AlivioAvaluosModelo AlivioAvaluosModelo = new AlivioAvaluosModelo(); 
	AlivioOtrosModelo AlivioOtrosModelo = new AlivioOtrosModelo(); 
	AnoModelo AnoModelo = new AnoModelo(); 
	ArchivosPlanosModelo ArchivosPlanosModelo = new ArchivosPlanosModelo(); 
	AutorizacionesModelo AutorizacionesModelo = new AutorizacionesModelo(); 
	avaluosCuotaModelo avaluosCuotaModelo = new avaluosCuotaModelo(); 
	AvaluosModelo AvaluosModelo = new AvaluosModelo(); 
	BancosModelo BancosModelo = new BancosModelo(); 
	BancosOtrosCobrosModelo BancosOtrosCobrosModelo = new BancosOtrosCobrosModelo(); 
	BarrasModelo BarrasModelo = new BarrasModelo(); 
	BDME1Modelo BDME1Modelo = new BDME1Modelo(); 
	BDME2Modelo BDME2Modelo = new BDME2Modelo(); 
	BDME3Modelo BDME3Modelo = new BDME3Modelo(); 
	BDME4Modelo BDME4Modelo = new BDME4Modelo(); 
	BDME5Modelo BDME5Modelo = new BDME5Modelo(); 
	Car_CarteraGeneral_aval_ajusteModelo Car_CarteraGeneral_aval_ajusteModelo = new Car_CarteraGeneral_aval_ajusteModelo(); 
	Car_CarteraGeneral_avalModelo Car_CarteraGeneral_avalModelo = new Car_CarteraGeneral_avalModelo(); 
	Car_CarteraGeneral_OtrosModelo Car_CarteraGeneral_OtrosModelo = new Car_CarteraGeneral_OtrosModelo(); 
	Car_CarteraGeneralModelo Car_CarteraGeneralModelo = new Car_CarteraGeneralModelo(); 
	Car_ClasificacionDeudoresModelo Car_ClasificacionDeudoresModelo = new Car_ClasificacionDeudoresModelo(); 
	CAR_PagoFinanciablesModelo CAR_PagoFinanciablesModelo = new CAR_PagoFinanciablesModelo(); 
	Car_PeriodosModelo Car_PeriodosModelo = new Car_PeriodosModelo(); 
	CategoriasSCHIPModelo CategoriasSCHIPModelo = new CategoriasSCHIPModelo(); 
	CGNENTIDADModelo CGNENTIDADModelo = new CGNENTIDADModelo(); 
	CoactivoModelo CoactivoModelo = new CoactivoModelo(); 
	ColumnasModelo ColumnasModelo = new ColumnasModelo(); 
	ConceptosCobrosModelo ConceptosCobrosModelo = new ConceptosCobrosModelo(); 
	ConceptosDetalleModelo ConceptosDetalleModelo = new ConceptosDetalleModelo(); 
	ConceptosFinanciablesModelo ConceptosFinanciablesModelo = new ConceptosFinanciablesModelo(); 
	ConceptosModelo ConceptosModelo = new ConceptosModelo(); 
	ConceptosPredialModelo ConceptosPredialModelo = new ConceptosPredialModelo(); 
	ConfiguracionCntFinModelo ConfiguracionCntFinModelo = new ConfiguracionCntFinModelo(); 
	ConfiguracionContableModelo ConfiguracionContableModelo = new ConfiguracionContableModelo(); 
	ConsultasModelo ConsultasModelo = new ConsultasModelo(); 
	ControlFormularioModelo ControlFormularioModelo = new ControlFormularioModelo(); 
	CuotasModelo CuotasModelo = new CuotasModelo(); 
	DescuentosModelo DescuentosModelo = new DescuentosModelo(); 
	DestinoEconomicoModelo DestinoEconomicoModelo = new DestinoEconomicoModelo(); 
	Det_ResolucionModelo Det_ResolucionModelo = new Det_ResolucionModelo(); 
	Det_Tabla_ResolucionModelo Det_Tabla_ResolucionModelo = new Det_Tabla_ResolucionModelo(); 
	DevolucionesModelo DevolucionesModelo = new DevolucionesModelo(); 
	devolucionesotrosModelo devolucionesotrosModelo = new devolucionesotrosModelo(); 
	devolucionFinanciablesModelo devolucionFinanciablesModelo = new devolucionFinanciablesModelo(); 
	DoblesPagosModelo DoblesPagosModelo = new DoblesPagosModelo(); 
	DoblesPagosOtrosModelo DoblesPagosOtrosModelo = new DoblesPagosOtrosModelo(); 
	docParametroModelo docParametroModelo = new docParametroModelo(); 
	DocumentosModelo DocumentosModelo = new DocumentosModelo(); 
	DocumentsTblModelo DocumentsTblModelo = new DocumentsTblModelo(); 
	EstadoCarteraModelo EstadoCarteraModelo = new EstadoCarteraModelo(); 
	EstadosModelo EstadosModelo = new EstadosModelo(); 
	EstratosModelo EstratosModelo = new EstratosModelo(); 
	ExcencionesModelo ExcencionesModelo = new ExcencionesModelo(); 
	ExcencionOtrosModelo ExcencionOtrosModelo = new ExcencionOtrosModelo(); 
	ExcencionPredialModelo ExcencionPredialModelo = new ExcencionPredialModelo(); 
	FinanciablesModelo FinanciablesModelo = new FinanciablesModelo(); 
	GruposFormularioModelo GruposFormularioModelo = new GruposFormularioModelo(); 
	GruposFormulariosModelo GruposFormulariosModelo = new GruposFormulariosModelo(); 
	GruposModelo GruposModelo = new GruposModelo(); 
	HistoricosPrediosModelo HistoricosPrediosModelo = new HistoricosPrediosModelo(); 
	IGAC_CamModelo IGAC_CamModelo = new IGAC_CamModelo(); 
	IGACModelo IGACModelo = new IGACModelo(); 
	InteresesModelo InteresesModelo = new InteresesModelo(); 
	InteresesPorAnosModelo InteresesPorAnosModelo = new InteresesPorAnosModelo(); 
	MenusModelo MenusModelo = new MenusModelo(); 
	Mes_PredialModelo Mes_PredialModelo = new Mes_PredialModelo(); 
	MesesCuotasModelo MesesCuotasModelo = new MesesCuotasModelo(); 
	MesesInteresesModelo MesesInteresesModelo = new MesesInteresesModelo(); 
	MesesModelo MesesModelo = new MesesModelo(); 
	Minutas2Modelo Minutas2Modelo = new Minutas2Modelo(); 
	mod010_estratosOtrosCobrosModelo mod010_estratosOtrosCobrosModelo = new mod010_estratosOtrosCobrosModelo(); 
	mod010_insolvenciaAvaluosModelo mod010_insolvenciaAvaluosModelo = new mod010_insolvenciaAvaluosModelo(); 
	mod010_insolvenciaModelo mod010_insolvenciaModelo = new mod010_insolvenciaModelo(); 
	mod010_insolvenciaOtrosModelo mod010_insolvenciaOtrosModelo = new mod010_insolvenciaOtrosModelo(); 
	mod010_porMaximoModelo mod010_porMaximoModelo = new mod010_porMaximoModelo(); 
	mod010_recaudosAvaluosModelo mod010_recaudosAvaluosModelo = new mod010_recaudosAvaluosModelo(); 
	mod010_recaudosOtrosModelo mod010_recaudosOtrosModelo = new mod010_recaudosOtrosModelo(); 
	mod010_tarifasOtrosCobrosModelo mod010_tarifasOtrosCobrosModelo = new mod010_tarifasOtrosCobrosModelo(); 
	ModificacionesModelo ModificacionesModelo = new ModificacionesModelo(); 
	ModificacionTipoModelo ModificacionTipoModelo = new ModificacionTipoModelo(); 
	ModulosModelo ModulosModelo = new ModulosModelo(); 
	MorososSCHIPModelo MorososSCHIPModelo = new MorososSCHIPModelo(); 
	NovedadRecaudosModelo NovedadRecaudosModelo = new NovedadRecaudosModelo(); 
	NuevosModelo NuevosModelo = new NuevosModelo(); 
	OpcionesModelo OpcionesModelo = new OpcionesModelo(); 
	otrosCobrosCuotaModelo otrosCobrosCuotaModelo = new otrosCobrosCuotaModelo(); 
	OtrosCobrosModelo OtrosCobrosModelo = new OtrosCobrosModelo(); 
	PagoFinanciablesModelo PagoFinanciablesModelo = new PagoFinanciablesModelo(); 
	ParametroModelo ParametroModelo = new ParametroModelo(); 
	PazYSalvosModelo PazYSalvosModelo = new PazYSalvosModelo(); 
	PermisosModelo PermisosModelo = new PermisosModelo(); 
	Personal_FactoresModelo Personal_FactoresModelo = new Personal_FactoresModelo(); 
	PlanaInterfaceFacSerModelo PlanaInterfaceFacSerModelo = new PlanaInterfaceFacSerModelo(); 
	Pre_ResolucionSancionModelo Pre_ResolucionSancionModelo = new Pre_ResolucionSancionModelo(); 
	PredioObservacionesModelo PredioObservacionesModelo = new PredioObservacionesModelo(); 
	Predios_AlivioModelo Predios_AlivioModelo = new Predios_AlivioModelo(); 
	Predios_AlivioOtrosModelo Predios_AlivioOtrosModelo = new Predios_AlivioOtrosModelo(); 
	Predios_FacturaModelo Predios_FacturaModelo = new Predios_FacturaModelo(); 
	PrediosCanceladosModelo PrediosCanceladosModelo = new PrediosCanceladosModelo(); 
	PrediosModelo PrediosModelo = new PrediosModelo(); 
	PrivilegiosModelo PrivilegiosModelo = new PrivilegiosModelo(); 
	PropietariosModelo PropietariosModelo = new PropietariosModelo(); 
	RecaudoDiarioAdicionalesModelo RecaudoDiarioAdicionalesModelo = new RecaudoDiarioAdicionalesModelo(); 
	RecaudoDiarioModelo RecaudoDiarioModelo = new RecaudoDiarioModelo(); 
	RecaudosModelo RecaudosModelo = new RecaudosModelo(); 
	RecibosAnuladosModelo RecibosAnuladosModelo = new RecibosAnuladosModelo(); 
	ResolucionModelo ResolucionModelo = new ResolucionModelo(); 
	ResolucionPredialModelo ResolucionPredialModelo = new ResolucionPredialModelo(); 
	SubFinanciablesModelo SubFinanciablesModelo = new SubFinanciablesModelo(); 
	Tabla_ResolucionModelo Tabla_ResolucionModelo = new Tabla_ResolucionModelo(); 
	TarifasModelo TarifasModelo = new TarifasModelo(); 
	Tbl_QryDocumentosModelo Tbl_QryDocumentosModelo = new Tbl_QryDocumentosModelo(); 
	tblActuacionesModelo tblActuacionesModelo = new tblActuacionesModelo(); 
	tblCoactivoActuacionesModelo tblCoactivoActuacionesModelo = new tblCoactivoActuacionesModelo(); 
	tblCoactivoModelo tblCoactivoModelo = new tblCoactivoModelo(); 
	tblconsultasModelo tblconsultasModelo = new tblconsultasModelo(); 
	TblFormsModelo TblFormsModelo = new TblFormsModelo(); 
	tipo1Modelo tipo1Modelo = new tipo1Modelo(); 
	tipo3Modelo tipo3Modelo = new tipo3Modelo(); 
	TipoArchivoRecaudosModelo TipoArchivoRecaudosModelo = new TipoArchivoRecaudosModelo(); 
	TipoIdentificacionModelo TipoIdentificacionModelo = new TipoIdentificacionModelo(); 
	TipoObservacionModelo TipoObservacionModelo = new TipoObservacionModelo(); 
	VariablesModelo VariablesModelo = new VariablesModelo(); 
	VencimientosModelo VencimientosModelo = new VencimientosModelo(); 
	VeredasModelo VeredasModelo = new VeredasModelo(); 
	
	public Response encontrarJoin(String tablas,UriInfo info,ContainerRequestContext httpHeaders) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, FileNotFoundException, IOException{
		String[] tablasBuscar = tablas.split(",");
		ArrayList<Object> objetos = new ArrayList<Object>();
		for(String tabla: tablasBuscar) {
			
			switch(tabla.split("-")[0]+"Modelo") {
			case "AbonosModelo":
				  objetos.add(AbonosModelo);
			    break;
			case "AbonosOtrosModelo":
							  objetos.add(AbonosOtrosModelo);
						    break;
			case "AbonosPredialModelo":
							  objetos.add(AbonosPredialModelo);
						    break;
			case "AcuerdoVigenciasModelo":
							  objetos.add(AcuerdoVigenciasModelo);
						    break;
			case "AlivioAvaluosDetModelo":
							  objetos.add(AlivioAvaluosDetModelo);
						    break;
			case "AlivioAvaluosModelo":
							  objetos.add(AlivioAvaluosModelo);
						    break;
			case "AlivioOtrosModelo":
							  objetos.add(AlivioOtrosModelo);
						    break;
			case "AnoModelo":
							  objetos.add(AnoModelo);
						    break;
			case "ArchivosPlanosModelo":
							  objetos.add(ArchivosPlanosModelo);
						    break;
			case "AutorizacionesModelo":
							  objetos.add(AutorizacionesModelo);
						    break;
			case "avaluosCuotaModelo":
							  objetos.add(avaluosCuotaModelo);
						    break;
			case "AvaluosModelo":
							  objetos.add(AvaluosModelo);
						    break;
			case "BancosModelo":
							  objetos.add(BancosModelo);
						    break;
			case "BancosOtrosCobrosModelo":
							  objetos.add(BancosOtrosCobrosModelo);
						    break;
			case "BarrasModelo":
							  objetos.add(BarrasModelo);
						    break;
			case "BDME1Modelo":
							  objetos.add(BDME1Modelo);
						    break;
			case "BDME2Modelo":
							  objetos.add(BDME2Modelo);
						    break;
			case "BDME3Modelo":
							  objetos.add(BDME3Modelo);
						    break;
			case "BDME4Modelo":
							  objetos.add(BDME4Modelo);
						    break;
			case "BDME5Modelo":
							  objetos.add(BDME5Modelo);
						    break;
			case "Car_CarteraGeneral_aval_ajusteModelo":
							  objetos.add(Car_CarteraGeneral_aval_ajusteModelo);
						    break;
			case "Car_CarteraGeneral_avalModelo":
							  objetos.add(Car_CarteraGeneral_avalModelo);
						    break;
			case "Car_CarteraGeneral_OtrosModelo":
							  objetos.add(Car_CarteraGeneral_OtrosModelo);
						    break;
			case "Car_CarteraGeneralModelo":
							  objetos.add(Car_CarteraGeneralModelo);
						    break;
			case "Car_ClasificacionDeudoresModelo":
							  objetos.add(Car_ClasificacionDeudoresModelo);
						    break;
			case "CAR_PagoFinanciablesModelo":
							  objetos.add(CAR_PagoFinanciablesModelo);
						    break;
			case "Car_PeriodosModelo":
							  objetos.add(Car_PeriodosModelo);
						    break;
			case "CategoriasSCHIPModelo":
							  objetos.add(CategoriasSCHIPModelo);
						    break;
			case "CGNENTIDADModelo":
							  objetos.add(CGNENTIDADModelo);
						    break;
			case "CoactivoModelo":
							  objetos.add(CoactivoModelo);
						    break;
			case "ColumnasModelo":
							  objetos.add(ColumnasModelo);
						    break;
			case "ConceptosCobrosModelo":
							  objetos.add(ConceptosCobrosModelo);
						    break;
			case "ConceptosDetalleModelo":
							  objetos.add(ConceptosDetalleModelo);
						    break;
			case "ConceptosFinanciablesModelo":
							  objetos.add(ConceptosFinanciablesModelo);
						    break;
			case "ConceptosModelo":
							  objetos.add(ConceptosModelo);
						    break;
			case "ConceptosPredialModelo":
							  objetos.add(ConceptosPredialModelo);
						    break;
			case "ConfiguracionCntFinModelo":
							  objetos.add(ConfiguracionCntFinModelo);
						    break;
			case "ConfiguracionContableModelo":
							  objetos.add(ConfiguracionContableModelo);
						    break;
			case "ConsultasModelo":
							  objetos.add(ConsultasModelo);
						    break;
			case "ControlFormularioModelo":
							  objetos.add(ControlFormularioModelo);
						    break;
			case "CuotasModelo":
							  objetos.add(CuotasModelo);
						    break;
			case "DescuentosModelo":
							  objetos.add(DescuentosModelo);
						    break;
			case "DestinoEconomicoModelo":
							  objetos.add(DestinoEconomicoModelo);
						    break;
			case "Det_ResolucionModelo":
							  objetos.add(Det_ResolucionModelo);
						    break;
			case "Det_Tabla_ResolucionModelo":
							  objetos.add(Det_Tabla_ResolucionModelo);
						    break;
			case "DevolucionesModelo":
							  objetos.add(DevolucionesModelo);
						    break;
			case "devolucionesotrosModelo":
							  objetos.add(devolucionesotrosModelo);
						    break;
			case "devolucionFinanciablesModelo":
							  objetos.add(devolucionFinanciablesModelo);
						    break;
			case "DoblesPagosModelo":
							  objetos.add(DoblesPagosModelo);
						    break;
			case "DoblesPagosOtrosModelo":
							  objetos.add(DoblesPagosOtrosModelo);
						    break;
			case "docParametroModelo":
							  objetos.add(docParametroModelo);
						    break;
			case "DocumentosModelo":
							  objetos.add(DocumentosModelo);
						    break;
			case "DocumentsTblModelo":
							  objetos.add(DocumentsTblModelo);
						    break;
			case "EstadoCarteraModelo":
							  objetos.add(EstadoCarteraModelo);
						    break;
			case "EstadosModelo":
							  objetos.add(EstadosModelo);
						    break;
			case "EstratosModelo":
							  objetos.add(EstratosModelo);
						    break;
			case "ExcencionesModelo":
							  objetos.add(ExcencionesModelo);
						    break;
			case "ExcencionOtrosModelo":
							  objetos.add(ExcencionOtrosModelo);
						    break;
			case "ExcencionPredialModelo":
							  objetos.add(ExcencionPredialModelo);
						    break;
			case "FinanciablesModelo":
							  objetos.add(FinanciablesModelo);
						    break;
			case "GruposFormularioModelo":
							  objetos.add(GruposFormularioModelo);
						    break;
			case "GruposFormulariosModelo":
							  objetos.add(GruposFormulariosModelo);
						    break;
			case "GruposModelo":
							  objetos.add(GruposModelo);
						    break;
			case "HistoricosPrediosModelo":
							  objetos.add(HistoricosPrediosModelo);
						    break;
			case "IGAC_CamModelo":
							  objetos.add(IGAC_CamModelo);
						    break;
			case "IGACModelo":
							  objetos.add(IGACModelo);
						    break;
			case "InteresesModelo":
							  objetos.add(InteresesModelo);
						    break;
			case "InteresesPorAnosModelo":
							  objetos.add(InteresesPorAnosModelo);
						    break;
			case "MenusModelo":
							  objetos.add(MenusModelo);
						    break;
			case "Mes_PredialModelo":
							  objetos.add(Mes_PredialModelo);
						    break;
			case "MesesCuotasModelo":
							  objetos.add(MesesCuotasModelo);
						    break;
			case "MesesInteresesModelo":
							  objetos.add(MesesInteresesModelo);
						    break;
			case "MesesModelo":
							  objetos.add(MesesModelo);
						    break;
			case "Minutas2Modelo":
							  objetos.add(Minutas2Modelo);
						    break;
			case "mod010_estratosOtrosCobrosModelo":
							  objetos.add(mod010_estratosOtrosCobrosModelo);
						    break;
			case "mod010_insolvenciaAvaluosModelo":
							  objetos.add(mod010_insolvenciaAvaluosModelo);
						    break;
			case "mod010_insolvenciaModelo":
							  objetos.add(mod010_insolvenciaModelo);
						    break;
			case "mod010_insolvenciaOtrosModelo":
							  objetos.add(mod010_insolvenciaOtrosModelo);
						    break;
			case "mod010_porMaximoModelo":
							  objetos.add(mod010_porMaximoModelo);
						    break;
			case "mod010_recaudosAvaluosModelo":
							  objetos.add(mod010_recaudosAvaluosModelo);
						    break;
			case "mod010_recaudosOtrosModelo":
							  objetos.add(mod010_recaudosOtrosModelo);
						    break;
			case "mod010_tarifasOtrosCobrosModelo":
							  objetos.add(mod010_tarifasOtrosCobrosModelo);
						    break;
			case "ModificacionesModelo":
							  objetos.add(ModificacionesModelo);
						    break;
			case "ModificacionTipoModelo":
							  objetos.add(ModificacionTipoModelo);
						    break;
			case "ModulosModelo":
							  objetos.add(ModulosModelo);
						    break;
			case "MorososSCHIPModelo":
							  objetos.add(MorososSCHIPModelo);
						    break;
			case "NovedadRecaudosModelo":
							  objetos.add(NovedadRecaudosModelo);
						    break;
			case "NuevosModelo":
							  objetos.add(NuevosModelo);
						    break;
			case "OpcionesModelo":
							  objetos.add(OpcionesModelo);
						    break;
			case "otrosCobrosCuotaModelo":
							  objetos.add(otrosCobrosCuotaModelo);
						    break;
			case "OtrosCobrosModelo":
							  objetos.add(OtrosCobrosModelo);
						    break;
			case "PagoFinanciablesModelo":
							  objetos.add(PagoFinanciablesModelo);
						    break;
			case "ParametroModelo":
							  objetos.add(ParametroModelo);
						    break;
			case "PazYSalvosModelo":
							  objetos.add(PazYSalvosModelo);
						    break;
			case "PermisosModelo":
							  objetos.add(PermisosModelo);
						    break;
			case "Personal_FactoresModelo":
							  objetos.add(Personal_FactoresModelo);
						    break;
			case "PlanaInterfaceFacSerModelo":
							  objetos.add(PlanaInterfaceFacSerModelo);
						    break;
			case "Pre_ResolucionSancionModelo":
							  objetos.add(Pre_ResolucionSancionModelo);
						    break;
			case "PredioObservacionesModelo":
							  objetos.add(PredioObservacionesModelo);
						    break;
			case "Predios_AlivioModelo":
							  objetos.add(Predios_AlivioModelo);
						    break;
			case "Predios_AlivioOtrosModelo":
							  objetos.add(Predios_AlivioOtrosModelo);
						    break;
			case "Predios_FacturaModelo":
							  objetos.add(Predios_FacturaModelo);
						    break;
			case "PrediosCanceladosModelo":
							  objetos.add(PrediosCanceladosModelo);
						    break;
			case "PrediosModelo":
							  objetos.add(PrediosModelo);
						    break;
			case "PrivilegiosModelo":
							  objetos.add(PrivilegiosModelo);
						    break;
			case "PropietariosModelo":
							  objetos.add(PropietariosModelo);
						    break;
			case "RecaudoDiarioAdicionalesModelo":
							  objetos.add(RecaudoDiarioAdicionalesModelo);
						    break;
			case "RecaudoDiarioModelo":
							  objetos.add(RecaudoDiarioModelo);
						    break;
			case "RecaudosModelo":
							  objetos.add(RecaudosModelo);
						    break;
			case "RecibosAnuladosModelo":
							  objetos.add(RecibosAnuladosModelo);
						    break;
			case "ResolucionModelo":
							  objetos.add(ResolucionModelo);
						    break;
			case "ResolucionPredialModelo":
							  objetos.add(ResolucionPredialModelo);
						    break;
			case "SubFinanciablesModelo":
							  objetos.add(SubFinanciablesModelo);
						    break;
			case "Tabla_ResolucionModelo":
							  objetos.add(Tabla_ResolucionModelo);
						    break;
			case "TarifasModelo":
							  objetos.add(TarifasModelo);
						    break;
			case "Tbl_QryDocumentosModelo":
							  objetos.add(Tbl_QryDocumentosModelo);
						    break;
			case "tblActuacionesModelo":
							  objetos.add(tblActuacionesModelo);
						    break;
			case "tblCoactivoActuacionesModelo":
							  objetos.add(tblCoactivoActuacionesModelo);
						    break;
			case "tblCoactivoModelo":
							  objetos.add(tblCoactivoModelo);
						    break;
			case "tblconsultasModelo":
							  objetos.add(tblconsultasModelo);
						    break;
			case "TblFormsModelo":
							  objetos.add(TblFormsModelo);
						    break;
			case "tipo1Modelo":
							  objetos.add(tipo1Modelo);
						    break;
			case "tipo3Modelo":
							  objetos.add(tipo3Modelo);
						    break;
			case "TipoArchivoRecaudosModelo":
							  objetos.add(TipoArchivoRecaudosModelo);
						    break;
			case "TipoIdentificacionModelo":
							  objetos.add(TipoIdentificacionModelo);
						    break;
			case "TipoObservacionModelo":
							  objetos.add(TipoObservacionModelo);
						    break;
			case "VariablesModelo":
							  objetos.add(VariablesModelo);
						    break;
			case "VencimientosModelo":
							  objetos.add(VencimientosModelo);
						    break;
			case "VeredasModelo":
							  objetos.add(VeredasModelo);
						    break;
			  default:
			}
		}
		
		return CrudRepositorio.responder(this.findJoin(tablas, info,objetos),httpHeaders);
	}
}
