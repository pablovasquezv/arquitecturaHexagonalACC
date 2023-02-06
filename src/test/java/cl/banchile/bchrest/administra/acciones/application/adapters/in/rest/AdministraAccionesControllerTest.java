package cl.banchile.bchrest.administra.acciones.application.adapters.in.rest;

import cl.banchile.bchrest.administra.acciones.application.adapters.Util;
import cl.banchile.bchrest.administra.acciones.application.adapters.in.rest.model.OperacionAccionesModel;
import cl.banchile.bchrest.administra.acciones.application.adapters.out.externalservice.OperacionBancoEJBAdapter;
import cl.banchile.go.ejb.OperacionAccionesTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author Pablo
 *
 */

@Slf4j
@WebMvcTest(AdministraAccionesController.class)
@AutoConfigureMockMvc
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

@ActiveProfiles("test")
class AdministraAccionesControllerTest {

    @MockBean
    private OperacionBancoEJBAdapter operacionBancoEJBAdapter;
    @Autowired
    private MockMvc mvc;
    @Autowired
    private ObjectMapper objectMapper;

    private OperacionAccionesTO acciones;
    private static final String BASE_PATH = "/acciones/v1";
    private static final String ENDPOINT_AGREGAR_OPERACION = BASE_PATH+"/operaciones";
    private OperacionAccionesModel responseObj;
    private OperacionAccionesTO requestObj;
    @BeforeEach
    void setUp() {
        acciones = Util.jsonRequest();
    }


    @Test
    void agregarOperacionAccion() throws JsonProcessingException {

        requestObj = Util.jsonRequest();
        responseObj = Util.jsonResponse();
        String jsonRequest = objectMapper.writeValueAsString(requestObj);
        String jsonResponse = objectMapper.writeValueAsString(responseObj);
        log.info("TEST agregarOperacionAccion");
        try {
            Mockito.when(operacionBancoEJBAdapter.addOperacionAcciones(requestObj)).thenReturn(responseObj);


            MvcResult result = mvc.perform(MockMvcRequestBuilders.post(ENDPOINT_AGREGAR_OPERACION)
                            .contentType(MediaType.APPLICATION_JSON)
                            .content(jsonRequest)
                            .accept(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk()).andReturn();
            //TODO
            String jsonResult = result.getResponse().getContentAsString();
            //Assertions.assertEquals(jsonResponse, jsonResult);

        } catch (Exception e) {
            log.error("Error en test " + e.getMessage());
        }
    }
}