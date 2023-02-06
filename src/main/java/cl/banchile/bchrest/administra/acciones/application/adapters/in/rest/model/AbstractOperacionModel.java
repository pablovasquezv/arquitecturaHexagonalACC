package cl.banchile.bchrest.administra.acciones.application.adapters.in.rest.model;

import cl.banchile.go.ejb.CanalAtencionTO;
import cl.banchile.go.ejb.ClienteTO;
import cl.banchile.go.ejb.InstruccionCobroTO;
import cl.banchile.go.ejb.InstruccionPagoTO;
import cl.banchile.go.ejb.FechasOperacionTO;
import cl.banchile.go.ejb.InstruccionTO;
import cl.banchile.go.ejb.MensajeTO;
import cl.banchile.go.ejb.OperacionEnum;
import cl.banchile.go.ejb.ProductoEnum;
import service.global.utilitario.banchile.cl._1.EmpleadoTO;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Pablo
 *
 */

public class AbstractOperacionModel {

    private CanalAtencionTO canalAtencionTO;
    private String canalOperacion;
    private ClienteTO clienteTO;
    private Long correlativo;
    private EmpleadoTO ejecutivoConectadoTO;
    private EmpleadoTO ejecutivoOperacionTO;
    private FechasOperacionTO fechaOperacionTO;
    private String idTransaccion;
    private Boolean indicadorReinversion;
    private List<InstruccionCobroTO> listInstruccionCobroTO;
    private List<InstruccionPagoTO> listInstruccionPagoTO;
    private List<InstruccionTO> listaInstruccionTO;
    private MensajeTO mensajeTO;
    private BigDecimal montoValorizado;
    private Long numeroOrden;
    private String observacion;
    private OperacionEnum tipoOperacionEnum;
    private ProductoEnum tipoProductoEnum;
    private BigDecimal unidadesTransadas;

    public CanalAtencionTO getCanalAtencionTO() {
        return canalAtencionTO;
    }

    public void setCanalAtencionTO(CanalAtencionTO canalAtencionTO) {
        this.canalAtencionTO = canalAtencionTO;
    }

    public String getCanalOperacion() {
        return canalOperacion;
    }

    public void setCanalOperacion(String canalOperacion) {
        this.canalOperacion = canalOperacion;
    }

    public ClienteTO getClienteTO() {
        return clienteTO;
    }

    public void setClienteTO(ClienteTO clienteTO) {
        this.clienteTO = clienteTO;
    }

    public Long getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(Long correlativo) {
        this.correlativo = correlativo;
    }

    public EmpleadoTO getEjecutivoConectadoTO() {
        return ejecutivoConectadoTO;
    }

    public void setEjecutivoConectadoTO(EmpleadoTO ejecutivoConectadoTO) {
        this.ejecutivoConectadoTO = ejecutivoConectadoTO;
    }

    public EmpleadoTO getEjecutivoOperacionTO() {
        return ejecutivoOperacionTO;
    }

    public void setEjecutivoOperacionTO(EmpleadoTO ejecutivoOperacionTO) {
        this.ejecutivoOperacionTO = ejecutivoOperacionTO;
    }

    public FechasOperacionTO getFechaOperacionTO() {
        return fechaOperacionTO;
    }

    public void setFechaOperacionTO(FechasOperacionTO fechaOperacionTO) {
        this.fechaOperacionTO = fechaOperacionTO;
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Boolean getIndicadorReinversion() {
        return indicadorReinversion;
    }

    public void setIndicadorReinversion(Boolean indicadorReinversion) {
        this.indicadorReinversion = indicadorReinversion;
    }

    public List<InstruccionCobroTO> getListInstruccionCobroTO() {
        return listInstruccionCobroTO;
    }

    public void setListInstruccionCobroTO(List<InstruccionCobroTO> listInstruccionCobroTO) {
        this.listInstruccionCobroTO = listInstruccionCobroTO;
    }

    public List<InstruccionPagoTO> getListInstruccionPagoTO() {
        return listInstruccionPagoTO;
    }

    public void setListInstruccionPagoTO(List<InstruccionPagoTO> listInstruccionPagoTO) {
        this.listInstruccionPagoTO = listInstruccionPagoTO;
    }

    public List<InstruccionTO> getListaInstruccionTO() {
        return listaInstruccionTO;
    }

    public void setListaInstruccionTO(List<InstruccionTO> listaInstruccionTO) {
        this.listaInstruccionTO = listaInstruccionTO;
    }

    public MensajeTO getMensajeTO() {
        return mensajeTO;
    }

    public void setMensajeTO(MensajeTO mensajeTO) {
        this.mensajeTO = mensajeTO;
    }

    public BigDecimal getMontoValorizado() {
        return montoValorizado;
    }

    public void setMontoValorizado(BigDecimal montoValorizado) {
        this.montoValorizado = montoValorizado;
    }

    public Long getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(Long numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public OperacionEnum getTipoOperacionEnum() {
        return tipoOperacionEnum;
    }

    public void setTipoOperacionEnum(OperacionEnum tipoOperacionEnum) {
        this.tipoOperacionEnum = tipoOperacionEnum;
    }

    public ProductoEnum getTipoProductoEnum() {
        return tipoProductoEnum;
    }

    public void setTipoProductoEnum(ProductoEnum tipoProductoEnum) {
        this.tipoProductoEnum = tipoProductoEnum;
    }

    public BigDecimal getUnidadesTransadas() {
        return unidadesTransadas;
    }

    public void setUnidadesTransadas(BigDecimal unidadesTransadas) {
        this.unidadesTransadas = unidadesTransadas;
    }
}