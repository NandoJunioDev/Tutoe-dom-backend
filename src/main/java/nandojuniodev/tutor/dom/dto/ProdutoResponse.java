package nandojuniodev.tutor.dom.dto;

import nandojuniodev.tutor.dom.Models.Produto;

import java.math.BigDecimal;

public record ProdutoResponse(Long id,
                              String nome,
                              String codigoDeBarras,
                              String marcaDoProduto,
                              String grupo,
                              BigDecimal precoAtual,
                              String fotoUrl
) {

    public static ProdutoResponse from (Produto produto) {
        return new ProdutoResponse(produto.getId(),
                produto.getNome(),
                produto.getCodigoDeBarras(),
                produto.getMarcaDoProduto(),
                produto.getGrupo(),
                produto.getPrecoAtual(),
                produto.getFotoUrl());
    }
}
