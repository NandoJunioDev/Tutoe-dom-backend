package nandojuniodev.tutor.dom.Controller;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import nandojuniodev.tutor.dom.Service.LoteService;
import nandojuniodev.tutor.dom.dto.LoteResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class LoteController {

    private  final LoteService loteService;

    @GetMapping("/produtos/{idProduto}/lotes")
    public List<LoteResponse> lote( @PathVariable Long idProduto ) {
        return loteService.listarLotesDeUmProduto(idProduto);
    }


    @GetMapping("/lotes/{id}")
    public ResponseEntity<LoteResponse> buscarLotePorId(@PathVariable Long id) {
        return loteService.buscarLoteporId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }


}




