package com.crud.api.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_categories")
public class CategoriesModel {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id_category")
    private Long idCategory;

    @ManyToOne
    @JoinColumn(name = "id_subCategory")
    private SubCategoriesModel subCategory;

}
