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
public class InstrumentoModel {
    private BigDecimal cantidadTranzada;
    private Integer idMercado;
    private BigDecimal montoTranzado;
    private String nemoSerie;
    private BigDecimal precio;
    private String rutEmisor;
}
