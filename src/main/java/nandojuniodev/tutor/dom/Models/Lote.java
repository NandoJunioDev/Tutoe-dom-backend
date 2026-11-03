package nandojuniodev.tutor.dom.Models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;


@Entity
@Setter
@Getter
@NoArgsConstructor

public class Lote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigoLote;


    private Integer quantidade;

    private LocalDate dataEntrada;

    private LocalDate dataValidade;

    private  LocalDateTime enviadoParaPromocaoEm;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "endereco_id", nullable = false)
    private Endereco endereco;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "produto_id", nullable = false)
    private Produtos produto;




}
