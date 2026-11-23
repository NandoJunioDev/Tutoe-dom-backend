package nandojuniodev.tutor.dom.Repository;


import nandojuniodev.tutor.dom.Models.Lote;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoteRepository extends JpaRepository<Lote, Long> {

    List<Lote> findByProdutoIdOrderByDataValidadeAsc(Long produtoId);
}
