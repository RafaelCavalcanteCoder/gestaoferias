package gestao.ferias.com.pm.controller;

import gestao.ferias.com.pm.entity.Ferias;
import gestao.ferias.com.pm.service.FeriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ferias")
public class FeriasController {

    @Autowired
    private FeriasService feriasService;

    @PostMapping
    public ResponseEntity<Ferias> solicitarFerias(@RequestBody Ferias ferias) {
        Ferias feriasSolicitada = feriasService.solicitarFerias(ferias);
        return new ResponseEntity<>(feriasSolicitada, HttpStatus.CREATED);
    }

    @GetMapping("/policial/{id}")
    public ResponseEntity<List<Ferias>> listarFeriasPorPolicial(@PathVariable Long id) {
        List<Ferias> ferias = feriasService.listarFeriasPorPolicial(id);
        return new ResponseEntity<>(ferias, HttpStatus.OK);
    }
}
