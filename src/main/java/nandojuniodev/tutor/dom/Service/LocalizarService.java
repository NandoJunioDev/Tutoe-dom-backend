package nandojuniodev.tutor.dom.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import nandojuniodev.tutor.dom.Models.Produtos;
import nandojuniodev.tutor.dom.Repository.DomRepository;
import java.util.Optional;


@AllArgsConstructor 
@Getter 

@Service 
public class LocalizarService {

@Autowired 

private final DomRepository domRepository;




public Optional<Produtos> loclizarProdutoPorId( Long id) {
    return domRepository.findById(id);
    
    
}

}