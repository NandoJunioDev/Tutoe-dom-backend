package nandojuniodev.tutor.dom.dto;


import nandojuniodev.tutor.dom.Models.Lote;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record LoteResponse  (String codigoLote,
                           Long id,
                           Integer quantidade,
                           LocalDate dataEntrada,
                           LocalDate dataValidade,
                           LocalDateTime enviadoParaPromocaoEm,
                           String produtoNome,
                           String marcaDoProduto,
                                    Short rua,
                                    Short gondola,
                                    Short andar,
                                    Short lado,
                                    Short posicao,
                           Long idProduto,
                           String nomeSetor,
                           String fotoUrl


){

    public static LoteResponse from (Lote lote){
        return  new LoteResponse(lote.getCodigoLote(),
                lote.getId(),
                lote.getQuantidade(),
                lote.getDataEntrada(),
                lote.getDataValidade(),
                lote.getEnviadoParaPromocaoEm(),
                lote.getProduto().getNome(),
                lote.getProduto().getMarcaDoProduto(),
                lote.getEndereco().getRua(),
                lote.getEndereco().getGondola(),
                lote.getEndereco().getAndar(),
                lote.getEndereco().getLado(),
                lote.getEndereco().getPosicao(),
                lote.getProduto().getId(),
                lote.getEndereco().getSetor().getNome(),
                lote.getProduto().getFotoUrl());






    }

}
