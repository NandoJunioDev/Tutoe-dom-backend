package nandojuniodev.tutor.dom.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;
import nandojuniodev.tutor.dom.dto.ProdutoResponse;
import org.springframework.stereotype.Service;


import nandojuniodev.tutor.dom.Models.Produto;
import nandojuniodev.tutor.dom.Repository.ProdutosRepository;

@RequiredArgsConstructor



@Service 
public class ProdutosService {


private final ProdutosRepository produtosRepository;
private  final ProdutoResponse produtoResponse;



public Optional<Produto> buscarPorId(Long id) {
    return produtosRepository.findById(id);

}

// função localizar todos os protudos

    public List<ProdutoResponse> listarTodos(){
         List<Produto> produtos = produtosRepository.findAll();
         List<ProdutoResponse> resposta = new ArrayList<>();
         for (Produto produto : produtos) {
             resposta.add(ProdutoResponse.from(produto));
         }
         return resposta;
    }
}


