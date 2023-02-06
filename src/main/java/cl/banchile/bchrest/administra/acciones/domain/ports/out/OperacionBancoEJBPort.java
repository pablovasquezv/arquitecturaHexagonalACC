package cl.banchile.bchrest.administra.acciones.domain.ports.out;

import cl.banchile.bchrest.administra.acciones.application.adapters.in.rest.model.OperacionAccionesModel;
import cl.banchile.go.ejb.OperacionAccionesTO;
import cl.banchile.go.ejb.OperacionException_Exception;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * @author Pablo
 *
 */

public interface OperacionBancoEJBPort {
    public OperacionAccionesModel addOperacionAcciones(OperacionAccionesTO operacion) throws OperacionException_Exception, JsonProcessingException;
}