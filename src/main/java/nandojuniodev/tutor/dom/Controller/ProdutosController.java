package nandojuniodev.tutor.dom.Controller;

import jakarta.validation.Valid;

import lombok.RequiredArgsConstructor;

import nandojuniodev.tutor.dom.dto.ProdutoRequest;
import nandojuniodev.tutor.dom.dto.ProdutoResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import nandojuniodev.tutor.dom.Service.ProdutosService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/produtos")
public class ProdutosController {

    
    private final  ProdutosService produtosService ;


    @GetMapping("/{id}")
    public ResponseEntity<ProdutoResponse> buscarProdutoPorId(@PathVariable Long id) {
        return produtosService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    @GetMapping
    public List<ProdutoResponse> listarProdutos() {
        return produtosService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<ProdutoResponse> salvarProduto(@RequestBody @Valid ProdutoRequest produtoRequest){

         ProdutoResponse produtoCriado = produtosService.inserirProduto(produtoRequest);
         return ResponseEntity.status(HttpStatus.CREATED).body(produtoCriado);
    }
}
