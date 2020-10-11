package com.jonathan.clickbus.repository

import com.jonathan.clickbus.model.Place
import org.springframework.data.repository.CrudRepository

/**
 * @author jonathan jorge
 */
interface PlaceRepository : CrudRepository<Place, Long>