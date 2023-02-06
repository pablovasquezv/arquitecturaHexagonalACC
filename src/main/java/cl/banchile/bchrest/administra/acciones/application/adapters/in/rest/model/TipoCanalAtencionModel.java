package cl.banchile.bchrest.administra.acciones.application.adapters.in.rest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Pablo
 *
 */


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TipoCanalAtencionModel {
    private String codigoTipoCanal;
    private String descripcionTipoCanal;
    private long identificadorTipoCanal;
    private List<CanalAtencionModel> listaCanalesAtencion;
}
