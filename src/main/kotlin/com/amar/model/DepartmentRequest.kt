package com.amar.model

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Null

data class DepartmentRequest(
   @field:NotBlank(message = "Department name must not be blank")
   val name: String,
   val status: Int = 1
)
