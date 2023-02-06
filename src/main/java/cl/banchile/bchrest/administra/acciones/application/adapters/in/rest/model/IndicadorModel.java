package cl.banchile.bchrest.administra.acciones.application.adapters.in.rest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Pablo
 *
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IndicadorModel {
    private String codigoIndicador;
    private String valorIndicador;
}
