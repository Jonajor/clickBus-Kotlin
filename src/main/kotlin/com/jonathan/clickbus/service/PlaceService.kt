package com.jonathan.clickbus.service

import com.jonathan.clickbus.model.Place
import com.jonathan.clickbus.repository.PlaceRepository
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.util.*

@Service
class PlaceService(private val placeRepository: PlaceRepository) {

    fun existById(id: Long): Boolean {
        return placeRepository.existsById(id)
    }

    fun findById(id: Long): Optional<Place> {
        return placeRepository.findById(id)
    }

    fun findAll(): MutableIterable<Place> {
        return placeRepository.findAll();
    }

    fun save(place: Place): Place {
        return placeRepository.save(place)
    }

    fun alter(place: Place) : Place {
        var placeSafe=  place.copy(
                id = place.id,
                name = place.name,
                lesma = place.lesma,
                state = place.state,
                creationDate = place.creationDate,
                updateDate = LocalDateTime.now()
        )
        return save(placeSafe)
    }

    fun delete(id: Long) {
        return placeRepository.deleteById(id)
    }
}