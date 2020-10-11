package com.jonathan.clickbus.model

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import org.jetbrains.annotations.NotNull
import java.time.LocalDateTime
import javax.persistence.*

/**
 * @author jonathan
 */
@Entity
data class Place (
        @Id
        @GeneratedValue
        @JsonProperty(value = "id", access = JsonProperty.Access.READ_ONLY)
        val id: Long,
        @field:NotNull("Name não pode se nulo")
        val name: String,
        @field:NotNull("Lesma não pode se nulo")
        val lesma: String,
        @field:NotNull("City não pode se nulo")
        val city: String,
        @field:NotNull("state não pode se nulo")
        val state: String,
        @field:NotNull("CreationDate não pode se nulo")
        val creationDate: LocalDateTime,

        @JsonInclude(JsonInclude.Include.NON_NULL)
        var updateDate: LocalDateTime? = null

)