package nandojuniodev.tutor.dom.Controller;

import lombok.RequiredArgsConstructor;
import nandojuniodev.tutor.dom.Models.Produto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nandojuniodev.tutor.dom.Service.ProdutosService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/produtos")
public class ProdutosController {

    
    private final   ProdutosService produtosService ;

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarProdutos(@PathVariable Long id) {
        return produtosService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    @GetMapping
    public List<Produto> buscarProdutos(){
        return produtosService.listarTodos();
    }
}
