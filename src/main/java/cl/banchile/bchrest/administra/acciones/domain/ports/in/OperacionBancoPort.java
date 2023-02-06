package cl.banchile.bchrest.administra.acciones.domain.ports.in;


import cl.banchile.go.ejb.OperacionAccionesTO;
import cl.banchile.go.ejb.OperacionException_Exception;

/**
 * @author Pablo
 *
 */
public interface OperacionBancoPort {
    OperacionAccionesTO addOperacionAccion(OperacionAccionesTO operacion) throws OperacionException_Exception;
}