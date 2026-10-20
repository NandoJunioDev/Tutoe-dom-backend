package nandojuniodev.tutor.dom.Models;

import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter 
@Entity 
@Table(name = "produtos")

public class Produtos {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;

    private Date dataDeCadastro;

    @Column(unique = true, nullable = false, name = "codigo_de_barras",length = 14)

    private String CodigoDeBarras;
    
}
