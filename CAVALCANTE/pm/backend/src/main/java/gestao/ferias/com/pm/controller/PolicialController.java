package gestao.ferias.com.pm.controller;

import gestao.ferias.com.pm.entity.Policial;
import gestao.ferias.com.pm.service.PolicialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/policiais")
public class PolicialController {

    @Autowired
    private PolicialService policialService;

    @PostMapping
    public ResponseEntity<Policial> cadastrarPolicial(@RequestBody Policial policial) {
        Policial novoPolicial = policialService.cadastrarPolicial(policial);
        return new ResponseEntity<>(novoPolicial, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Policial>> listarTodosPoliciais() {
        List<Policial> policiais = policialService.listarTodosPoliciais();
        return new ResponseEntity<>(policiais, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Policial> buscarPolicialPorId(@PathVariable Long id) {
        Policial policial = policialService.buscarPolicialPorId(id);
        return new ResponseEntity<>(policial, HttpStatus.OK);
    }
}
