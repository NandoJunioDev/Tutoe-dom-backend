package nandojuniodev.tutor.dom.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity 
@Getter 
@Setter 
@NoArgsConstructor 
@Table(name = "endereco")
public class Endereco {
   
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    
    @ManyToOne 
    @JoinColumn (name = "setor_id",nullable = false)
    private Setor setor;

    private Short rua;

    private Short gondola;

    private Short andar;

    private Short lado;

    private Short posicao;



}
