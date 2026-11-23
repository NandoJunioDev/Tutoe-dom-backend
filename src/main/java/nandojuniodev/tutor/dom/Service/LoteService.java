package nandojuniodev.tutor.dom.Service;


import lombok.RequiredArgsConstructor;
import nandojuniodev.tutor.dom.Models.Lote;
import nandojuniodev.tutor.dom.Repository.LoteRepository;
import nandojuniodev.tutor.dom.dto.LoteResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class LoteService {

    private final LoteRepository loteRepository;

    public List<LoteResponse> listarLotesDeUmProduto(Long produtoId){
        List<Lote> lotes = loteRepository.findByProdutoIdOrderByDataValidadeAsc(produtoId);
        List<LoteResponse> resposta = new ArrayList<>();
        for (Lote lote : lotes) {
            resposta.add(LoteResponse.from(lote));

        }
        return resposta;
    }

    public Optional<LoteResponse> buscarLoteporId(Long id){
        Optional<Lote> loteEncotrado = loteRepository.findById(id);

        if(loteEncotrado.isEmpty()) {
            return Optional.empty();
        }
        Lote lote = loteEncotrado.get();
        return Optional.of(LoteResponse.from(lote));

    }
}
