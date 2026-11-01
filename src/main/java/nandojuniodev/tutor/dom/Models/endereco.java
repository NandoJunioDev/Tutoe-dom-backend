package nandojuniodev.tutor.dom.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity 
public class endereco {
   
    @Id 

    @GeneratedValue
     (strategy = GenerationType.IDENTITY)
    private Long id;

    private Long setor_Id;

    private String rua;

    private String gondola;

    private String andar;

    private String lado;

    private String posicao;



}
