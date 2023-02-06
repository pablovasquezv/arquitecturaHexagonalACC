package cl.banchile.bchrest.administra.acciones.commom.exception;

/**
 * @author Pablo
 *
 */

/**
 * Excepción a ser lanzada cuando se detecta el intento de
 * crear un recurso que ya existe en el dominio
 */
public class ResourceConflictException extends RuntimeException {
    public ResourceConflictException(String message){
        super(message);
    }
    public ResourceConflictException(String message, Throwable err){
        super(message, err);
    }
}
