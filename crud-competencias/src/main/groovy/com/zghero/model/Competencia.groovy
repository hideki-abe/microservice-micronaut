package com.zghero.model

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity

import javax.validation.constraints.NotBlank

@MappedEntity
class Competencia {

    @Id
    @GeneratedValue
    Long id

    @NotBlank
    String nome

}
