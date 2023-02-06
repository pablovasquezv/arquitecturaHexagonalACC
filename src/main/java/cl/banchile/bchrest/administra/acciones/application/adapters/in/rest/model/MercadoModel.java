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
public class MercadoModel {

    private String clasificacion;
    private Long idMercado;
    private String indicadorVigenciaMercado;
    private String nombreMercado;
}