package com.amar.repository

import com.amar.entity.Department
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

@Repository
interface  DepartmentRepository : ReactiveCrudRepository<Department, Long> {
    fun findByName(name: String): Mono<Department>
}