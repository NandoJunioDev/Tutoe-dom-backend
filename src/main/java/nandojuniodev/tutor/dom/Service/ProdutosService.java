package nandojuniodev.tutor.dom.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;
import nandojuniodev.tutor.dom.dto.ProdutoRequest;
import nandojuniodev.tutor.dom.dto.ProdutoResponse;
import nandojuniodev.tutor.dom.exception.CodigoDeBarrasJaCadastradoException;
import org.springframework.stereotype.Service;


import nandojuniodev.tutor.dom.Models.Produto;
import nandojuniodev.tutor.dom.Repository.ProdutosRepository;

@RequiredArgsConstructor



@Service 
public class ProdutosService {


private final ProdutosRepository produtosRepository;



public Optional<ProdutoResponse> buscarPorId(Long id) {
    Optional<Produto> resultado = produtosRepository.findById(id);
    if(resultado.isEmpty()) {
        return Optional.empty();
    }
    Produto produto = resultado.get();
    return Optional.of(ProdutoResponse.from(produto));
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

   public  ProdutoResponse inserirProduto(ProdutoRequest produtoRequest) {

    Produto novoProduto = new Produto();
    novoProduto.setNome(produtoRequest.nome());
    novoProduto.setGrupo(produtoRequest.grupo());
    novoProduto.setCodigoDeBarras(produtoRequest.codigoDeBarras());
    novoProduto.setDataDeCadastro(LocalDateTime.now());
    novoProduto.setFotoUrl(produtoRequest.fotoUrl());
    novoProduto.setMarcaDoProduto(produtoRequest.marcaDoProduto());
    novoProduto.setPrecoAtual(produtoRequest.precoAtual());

    if (produtosRepository.existsByCodigoDeBarras(produtoRequest.codigoDeBarras())){
        throw new CodigoDeBarrasJaCadastradoException("Já existe produto cadastrado com esse codigo de barras "+produtoRequest.codigoDeBarras());
       }
    Produto produtoSalvo = produtosRepository.save(novoProduto);


    return ProdutoResponse.from(produtoSalvo);



    }

    public List <ProdutoResponse > pesquisarPorNome(String nome) {

    List<Produto> produtosEncontrados = produtosRepository.findDistinctByNomeContainingIgnoreCase(nome);
    List<ProdutoResponse> resposta = new ArrayList<>();
    for (Produto produto : produtosEncontrados) {
        resposta.add(ProdutoResponse.from(produto));

    }
    return resposta;
    }
}


