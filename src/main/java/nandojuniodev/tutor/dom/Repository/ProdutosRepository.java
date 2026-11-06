package nandojuniodev.tutor.dom.Repository;

import nandojuniodev.tutor.dom.Models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProdutosRepository extends JpaRepository<Produto, Long> {

    boolean existsByCodigoDeBarras(String codigoDeBarras);


    List<Produto> findDistinctByNomeContainingIgnoreCase(String nome);

}
