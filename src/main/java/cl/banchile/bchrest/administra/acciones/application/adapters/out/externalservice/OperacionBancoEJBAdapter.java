package cl.banchile.bchrest.administra.acciones.application.adapters.out.externalservice;

import cl.banchile.bchrest.administra.acciones.application.adapters.in.rest.model.OperacionAccionesModel;
import cl.banchile.bchrest.administra.acciones.common.utils.Utils;
import cl.banchile.bchrest.administra.acciones.domain.ports.out.OperacionBancoEJBPort;
import cl.banchile.go.ejb.OperacionAccionesTO;
import cl.banchile.go.ejb.OperacionBancoEJBService;
import cl.banchile.go.ejb.OperacionException_Exception;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Pablo
 *
 */

@Slf4j
@Service
public class OperacionBancoEJBAdapter implements OperacionBancoEJBPort {
    private OperacionBancoEJBService service;
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private Utils utils;
    public OperacionBancoEJBAdapter(@Value("${service.operacion-banco.url}") String url) {
        try {
            this.service = new OperacionBancoEJBService(new URL(url));
        } catch (MalformedURLException e) {
            log.error("Error: " + e);
        }
    }
    @Override
    public OperacionAccionesModel addOperacionAcciones(OperacionAccionesTO operacion) {
        OperacionAccionesModel resp = new OperacionAccionesModel();
        try {
            log.info("-----Inicio de método agregarOperacionAccion-----");
            log.info("Entrada OperacionAccion -> " + utils.imprimirLogsEntrada(operacion));
            resp = adapterOperacionAccionesIntoOperacionAccionesTO(service.getOperacionBancoEJBPort().addOperacionAcciones(operacion));
            log.info("Salida OperacionAccion -> " + utils.imprimirLogsSalida(resp));
        } catch (OperacionException_Exception e) {
            log.error("Error: " + e);
        }
        return resp;
    }
    public OperacionAccionesModel adapterOperacionAccionesIntoOperacionAccionesTO(OperacionAccionesTO operacion) {
        OperacionAccionesModel respuesta = new OperacionAccionesModel();
        String jsonResponse = null;
        try {
            jsonResponse = objectMapper.writeValueAsString(operacion);
            respuesta = objectMapper.readValue(jsonResponse, OperacionAccionesModel.class);
        } catch (JsonProcessingException e) {
            log.error("Error: " + e);
        }
        return respuesta;
    }
}