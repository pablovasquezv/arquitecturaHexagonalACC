package cl.banchile.bchrest.administra.acciones.application.adapters.in.rest.model;

package cl.banchile.bchrest.administra.acciones.application.adapters.in.rest.model;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Pablo
 *
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OperacionAccionesModel extends AbstractOperacionModel {

    private BolsaModel bolsaTO;
    private CanalAtencionModel canal;
    private BigDecimal cantidadOrden;
    private BigDecimal comision;
    private String condicionDeLiquidacion;
    private Long correlativoCuenta;
    private String custodio;
    private String estado;
    private String fechaVigencia;
    private String indicadorOrdenRemate;
    private String indicadorPrecioLimite;
    private String indicadorPrimeraEmision;
    private IndicadorModel indicadorTOCustodia;
    private IndicadorModel indicadorTOPrecio;
    private IndicadorModel indicadorTOValidez;
    private InstrumentoModel instrumentoTO;
    private String medioCobroPago;
    private MercadoModel mercadoTO;
    private BigDecimal montoInversionOrden;
    private BigDecimal montoOperacion;
    private String nemoFondo;
    private String nombreSerie;
    private String numeroCuentaCorriente;
    private String numeroInformeRemate;
    private OrdenModel ordenLiquidacionTO;
    private BigDecimal precioLimite;
    private BigDecimal precioOrden;
    private String rutCliente;
    private Integer sruCliente;
    private String tipoOperacion;
}
