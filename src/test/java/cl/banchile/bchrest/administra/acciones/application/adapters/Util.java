package cl.banchile.bchrest.administra.acciones.application.adapters;

package cl.banchile.bchrest.administra.acciones.application.adapters;

import cl.banchile.bchrest.administra.acciones.application.adapters.in.rest.model.OperacionAccionesModel;
import cl.banchile.go.ejb.OperacionAccionesTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.File;
import java.io.IOException;

/**
 * @author Pablo
 *
 */

@Slf4j
public class Util {

    public static OperacionAccionesTO jsonRequest() {
        ObjectMapper objectMapper = new ObjectMapper();
        OperacionAccionesTO operacion = null;
        try {
            operacion = objectMapper.readValue(new File("src/test/resources/request.json"), OperacionAccionesTO.class);
        } catch (IOException e) {
            log.error("Error: " + e);
        }
        return operacion;
    }

    public static OperacionAccionesModel jsonResponse(){
        ObjectMapper objectMapper = new ObjectMapper();
        OperacionAccionesModel operacion = null;
        try {
            operacion = objectMapper.readValue(new File("src/test/resources/response.json"), OperacionAccionesModel.class);
        } catch (IOException e) {
            log.error("Error: " + e);
        }
        return operacion;
    }

    public static OperacionAccionesTO jsonRequestOperacionaccionesTO() {
        ObjectMapper objectMapper = new ObjectMapper();
        OperacionAccionesTO operacion = null;
        try {
            operacion = objectMapper.readValue(new File("src/test/resources/request.json"), OperacionAccionesTO.class);
        } catch (IOException e) {
            log.error("Error: " + e);
        }
        return operacion;
    }

    private static XMLGregorianCalendar convertDate(String date) {
        XMLGregorianCalendar result = null;
        try {
            result = DatatypeFactory.newInstance()
                    .newXMLGregorianCalendar(date);
        } catch (DatatypeConfigurationException e) {
            log.error("Error: " + e);
        }
        return result;
    }
}