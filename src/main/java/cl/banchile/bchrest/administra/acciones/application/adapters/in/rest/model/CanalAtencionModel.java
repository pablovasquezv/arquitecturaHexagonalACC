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
public class CanalAtencionModel {
    private String descripcionCanalAtencion;
    private long identificadorCanalAtencion;
    private TipoCanalAtencionModel tipoCanal;
}