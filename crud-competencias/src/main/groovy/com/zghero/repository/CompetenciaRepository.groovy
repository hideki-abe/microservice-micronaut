package com.zghero.repository

import com.zghero.model.Competencia
import io.micronaut.context.annotation.Executable
import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository

@JdbcRepository(dialect = Dialect.POSTGRES)
interface CompetenciaRepository extends CrudRepository<Competencia, Long>{

    @Executable
    List<Competencia> findAll()
}
