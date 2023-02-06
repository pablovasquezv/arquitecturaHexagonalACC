package cl.banchile.bchrest.administra.acciones.application.adapters.in.rest;

import cl.banchile.bchrest.administra.acciones.application.adapters.in.rest.model.OperacionAccionesModel;
import cl.banchile.bchrest.administra.acciones.application.adapters.out.externalservice.OperacionBancoEJBAdapter;

import cl.banchile.go.ejb.OperacionAccionesTO;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author Pablo
 *
 */

/**
 * Clase de implementación de Adaptador Rest
 * Rest Controller
 */
@Slf4j
@RestController
// Raiz de URI Rest controller concide con lineamientos de arquitectura
// se considera en nombre del contexto, la versión y el dominio del servicio
@RequestMapping(path = "/acciones/v1")
@OpenAPIDefinition(
        info = @Info(
                title = "Acciones",
                version = "1"
        )
)
public class AdministraAccionesController {

    @Autowired
    private OperacionBancoEJBAdapter operacionBancoEJBAdapter;


    @PostMapping("/operaciones")
    @ApiOperation(value = "Método para realizar un ingreso de operación de Acciones")
    public ResponseEntity<OperacionAccionesModel> agregarOperacionAccion(@Valid @RequestBody OperacionAccionesTO op
    ){
        OperacionAccionesModel resp = operacionBancoEJBAdapter.addOperacionAcciones(op);
        return new ResponseEntity<OperacionAccionesModel>(resp, HttpStatus.OK);
    }


}