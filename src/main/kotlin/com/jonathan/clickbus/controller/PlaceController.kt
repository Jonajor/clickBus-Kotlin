package com.jonathan.clickbus.controller

import com.jonathan.clickbus.model.Place
import com.jonathan.clickbus.service.PlaceService
import javassist.NotFoundException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

/**
 * @author jonathan jorge
 */
@RestController
@RequestMapping("/clickBus/v1")
class PlaceController(val placeService: PlaceService) {

    @get:GetMapping("/places")
    val allPlaces: MutableIterable<Place>
        get() = placeService.findAll();

    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id: Long): ResponseEntity<Any>? {
        var place = takeIf { it.placeService.existById(id)}?. let { placeService.findById(id) }
                ?: return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id not found: $id")

        return ResponseEntity.ok().body(place)
    }

    @PostMapping("/place")
    fun save(@RequestBody @Validated place: Place): ResponseEntity<Place> {
        return ResponseEntity.status(HttpStatus.CREATED).body(placeService.save(place))
    }

    @PutMapping(value = ["/{id}"])
    fun update(@PathVariable("id") id: Long, @RequestBody place: Place): ResponseEntity<Any> {
        var placeAlter = id.takeIf { placeService.existById(id) }?. run { placeService.alter(place) }
                ?: return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not is possibel to update $place.city")
        return ResponseEntity.ok().body(placeAlter)
    }

    @DeleteMapping(path = ["/{id}"])
    fun delete(@PathVariable("id") id: Long): ResponseEntity<*> {
        var deletePlace = id.takeIf { placeService.existById(id) }?. run { placeService.delete(id) }
                ?: return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id not found $id")
        return ResponseEntity.ok().body(deletePlace)
    }
}