package org.pegasus.backendapi.route

import jakarta.persistence.*
import org.pegasus.backendapi.model.entity.AbstractEntity
import org.pegasus.backendapi.model.entity.User

@Entity
@Table(name = "trips")
class Trip(
    val name: String,

    @ManyToOne(fetch = FetchType.LAZY)
    private val user: User,

    @OneToMany(fetch = FetchType.LAZY)
    var destinations: List<Destination> = listOf()
) : AbstractEntity()
