package org.pegasus.backendapi.route

import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import org.pegasus.backendapi.model.entity.AbstractEntity
import java.time.Instant

@Entity
@Table(name = "destinations")
data class Destination(

    @ManyToOne(fetch = FetchType.LAZY)
    val trip: Trip,

    val city: String,
    val startDate: Instant,
    val endDate: Instant

) : AbstractEntity()
