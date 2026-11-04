package nandojuniodev.tutor.dom.Models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Entity
@Setter
@NoArgsConstructor
@Table(name = "produto")

public class Produto {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;

    private LocalDateTime dataDeCadastro;

    @Column(unique = true, nullable = false, name = "codigo_de_barras",length = 14)


    private String codigoDeBarras;

    private String  marcaDoProduto;

    private String grupo;

    private BigDecimal precoAtual;

    private String fotoUrl;





    
    
}
