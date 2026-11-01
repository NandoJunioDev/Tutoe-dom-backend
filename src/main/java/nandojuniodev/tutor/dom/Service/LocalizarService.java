package nandojuniodev.tutor.dom.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import nandojuniodev.tutor.dom.Models.Produtos;
import nandojuniodev.tutor.dom.Repository.DomRepository;

@AllArgsConstructor 

@Getter 

@Service 
public class LocalizarService {


private final DomRepository domRepository;




public Optional<Produtos> loclizarProdutoPorId( Long id) {
    return domRepository.findById(id);
    
    
}

}