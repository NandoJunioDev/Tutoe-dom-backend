package nandojuniodev.tutor.dom.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nandojuniodev.tutor.dom.Models.Produtos;



public interface DomRepository extends JpaRepository<Produtos, Long> {

}
