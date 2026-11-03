package nandojuniodev.tutor.dom.Repository;

import nandojuniodev.tutor.dom.Models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProdutosRepository extends JpaRepository<Produto, Long> {

}
