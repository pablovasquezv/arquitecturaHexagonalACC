package cl.banchile.bchrest.administra.acciones.commom.utils;

/**
 * @author Pablo
 *
 */

import cl.banchile.bchrest.administra.acciones.application.adapters.in.rest.model.OperacionAccionesModel;
import cl.banchile.go.ejb.OperacionAccionesTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Utils {

    @Autowired
    private ObjectMapper objectMapper;

    public static String getMethodName() {

        if (Thread.currentThread().getStackTrace().length > 2) {
            return Thread.currentThread().getStackTrace()[2].getMethodName();
        } else {
            return "undefined";
        }
    }


    public String imprimirLogsEntrada(OperacionAccionesTO operacion)  {

        String jsonResponse = "";
        try {
            jsonResponse = objectMapper.writeValueAsString(operacion);
        } catch (JsonProcessingException e) {
            log.error("Error: " + e);
        }

        return jsonResponse;
    }

    public String imprimirLogsSalida(OperacionAccionesModel operacion)  {

        String jsonResponse = "";
        try {
            jsonResponse = objectMapper.writeValueAsString(operacion);
        } catch (JsonProcessingException e) {
            log.error("Error: " + e);
        }

        return jsonResponse;
    }
}