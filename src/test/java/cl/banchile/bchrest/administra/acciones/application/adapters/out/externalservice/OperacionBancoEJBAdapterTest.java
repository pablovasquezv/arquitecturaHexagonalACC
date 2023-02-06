package cl.banchile.bchrest.administra.acciones.application.adapters.out.externalservice;


import cl.banchile.bchrest.administra.acciones.application.adapters.Util;
import cl.banchile.bchrest.administra.acciones.application.adapters.in.rest.model.OperacionAccionesModel;
import cl.banchile.bchrest.administra.acciones.domain.ports.out.OperacionBancoEJBPort;
import cl.banchile.go.ejb.OperacionAccionesTO;
import cl.banchile.go.ejb.OperacionBancoEJB;

import cl.banchile.go.ejb.OperacionException_Exception;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;


import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.ActiveProfiles;

/**
 * @author Pablo
 *
 */

@Slf4j
@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ActiveProfiles("test")
class OperacionBancoEJBAdapterTest {

    private OperacionAccionesTO requestObj, responseObj;
    private OperacionAccionesModel responseObjModel;

    @Autowired
    private OperacionBancoEJBAdapter operacionBancoEJBAdapter;

    @Mock
    private OperacionBancoEJBPort operacionBancoEJBPort;

    @Mock
    private OperacionBancoEJB operacionBancoEJB;



    @Test
    public void addOperacionAcciones() {

        log.info("Iniciando prueba addOperacionAcciones");
        requestObj = Util.jsonRequest();
        responseObjModel = Util.jsonResponse();
        OperacionAccionesModel result = new OperacionAccionesModel();
        try {
            // Mockito.lenient().doReturn(responseObj).when(operacionBancoEJBPort).agregarOperacionMonedaExtranjera(requestObj);
            Mockito.when(operacionBancoEJBPort.addOperacionAcciones(requestObj))
                    .thenReturn(responseObjModel);
            result = operacionBancoEJBPort.addOperacionAcciones(requestObj);
            Assertions.assertEquals(responseObjModel.getIdTransaccion(), result.getIdTransaccion());
            log.info("Finalizando prueba addOperacionMonedaExtranjera");
        } catch (OperacionException_Exception e) {
            log.error("Ocurrio un error" + e);
        } catch (JsonProcessingException e) {
            log.error("Ocurrio un error" + e);
        }
    }

    @Test
    void adapterOperacionAccionesIntoOperacionAccionesTO() {

        log.info("Iniciando prueba adapterOperacionAccionesIntoOperacionAccionesTO");

        requestObj = Util.jsonRequest();
        responseObj = Util.jsonRequestOperacionaccionesTO();

        OperacionAccionesModel result = new OperacionAccionesModel();

        try {
            Mockito.lenient().doReturn(responseObj).when(operacionBancoEJB).addOperacionAcciones(requestObj);
            result = operacionBancoEJBAdapter.adapterOperacionAccionesIntoOperacionAccionesTO(requestObj);
            Assertions.assertEquals(responseObj.getIdTransaccion(), result.getIdTransaccion());
            log.info("Finalizando prueba  adapterOperacionAccionesIntoOperacionAccionesTO");
        } catch (OperacionException_Exception e) {
            log.error("Ocurrio un error" + e);
        }
    }
}