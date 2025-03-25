package com.exemplo.controller;

import com.exemplo.model.Policial;
import com.exemplo.service.PolicialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/policiais")
public class PolicialController {

    @Autowired
    private PolicialService policialService;

    @PostMapping
    public Policial cadastrarPolicial(@RequestBody Policial policial) {
        return policialService.salvarPolicial(policial);
    }

    @GetMapping
    public List<Policial> listarPoliciais() {
        return policialService.listarPoliciais();
    }
}
