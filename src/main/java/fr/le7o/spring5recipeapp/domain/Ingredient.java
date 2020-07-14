package fr.le7o.spring5recipeapp.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;

    //V1 (108)
    //private UnitOfMeasure uom;

    //V2 (109)
    @OneToOne (fetch = FetchType.EAGER)
    private UnitOfMeasure uom;

    @ManyToOne
    private Recipe recipe;

    public Ingredient() {
    }

    /*    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom, Recipe recipe) {
            this.description = description;
            this.amount = amount;
            this.uom = uom;
            this.recipe = recipe;
        }*/
    //Maj (116)
    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
    }

}
