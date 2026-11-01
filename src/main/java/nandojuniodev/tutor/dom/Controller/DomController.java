package nandojuniodev.tutor.dom.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import nandojuniodev.tutor.dom.Models.Produtos;
import nandojuniodev.tutor.dom.Service.LocalizarService;

@AllArgsConstructor 
@RestController 
public class DomController {

    
    private final LocalizarService localizarService;

    @GetMapping("/teste/{id}")
    public ResponseEntity<Produtos> buscarProdutos(@PathVariable Long id) {
        return localizarService.loclizarProdutoPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    
}
