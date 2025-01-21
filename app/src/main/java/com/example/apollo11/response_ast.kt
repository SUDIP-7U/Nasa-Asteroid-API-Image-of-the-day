package com.example.apollo11


import com.squareup.moshi.Json
import androidx.annotation.Keep

@Keep
data class response_ast(
    @Json(name = "element_count")
    val elementCount: Int?,
    @Json(name = "links")
    val links: Links?,
    @Json(name = "near_earth_objects")
    val nearEarthObjects: NearEarthObjects?
) {
    @Keep
    data class Links(
        @Json(name = "next")
        val next: String?,
        @Json(name = "previous")
        val previous: String?,
        @Json(name = "self")
        val self: String?
    )

    @Keep
    data class NearEarthObjects(
        @Json(name = "2025-01-20")
        val x20250120: List<X20250120?>?,
        @Json(name = "2025-01-21")
        val x20250121: List<X20250121?>?,
        @Json(name = "2025-01-22")
        val x20250122: List<X20250122?>?,
        @Json(name = "2025-01-23")
        val x20250123: List<X20250123?>?,
        @Json(name = "2025-01-24")
        val x20250124: List<X20250124?>?,
        @Json(name = "2025-01-25")
        val x20250125: List<X20250125?>?,
        @Json(name = "2025-01-26")
        val x20250126: List<X20250126?>?,
        @Json(name = "2025-01-27")
        val x20250127: List<X20250127?>?
    ) {
        @Keep
        data class X20250120(
            @Json(name = "absolute_magnitude_h")
            val absoluteMagnitudeH: Double?,
            @Json(name = "close_approach_data")
            val closeApproachData: List<CloseApproachData?>?,
            @Json(name = "estimated_diameter")
            val estimatedDiameter: EstimatedDiameter?,
            @Json(name = "id")
            val id: String?,
            @Json(name = "is_potentially_hazardous_asteroid")
            val isPotentiallyHazardousAsteroid: Boolean?,
            @Json(name = "is_sentry_object")
            val isSentryObject: Boolean?,
            @Json(name = "links")
            val links: Links?,
            @Json(name = "name")
            val name: String?,
            @Json(name = "nasa_jpl_url")
            val nasaJplUrl: String?,
            @Json(name = "neo_reference_id")
            val neoReferenceId: String?,
            @Json(name = "sentry_data")
            val sentryData: String?
        ) {
            @Keep
            data class CloseApproachData(
                @Json(name = "close_approach_date")
                val closeApproachDate: String?,
                @Json(name = "close_approach_date_full")
                val closeApproachDateFull: String?,
                @Json(name = "epoch_date_close_approach")
                val epochDateCloseApproach: Long?,
                @Json(name = "miss_distance")
                val missDistance: MissDistance?,
                @Json(name = "orbiting_body")
                val orbitingBody: String?,
                @Json(name = "relative_velocity")
                val relativeVelocity: RelativeVelocity?
            ) {
                @Keep
                data class MissDistance(
                    @Json(name = "astronomical")
                    val astronomical: String?,
                    @Json(name = "kilometers")
                    val kilometers: String?,
                    @Json(name = "lunar")
                    val lunar: String?,
                    @Json(name = "miles")
                    val miles: String?
                )

                @Keep
                data class RelativeVelocity(
                    @Json(name = "kilometers_per_hour")
                    val kilometersPerHour: String?,
                    @Json(name = "kilometers_per_second")
                    val kilometersPerSecond: String?,
                    @Json(name = "miles_per_hour")
                    val milesPerHour: String?
                )
            }

            @Keep
            data class EstimatedDiameter(
                @Json(name = "feet")
                val feet: Feet?,
                @Json(name = "kilometers")
                val kilometers: Kilometers?,
                @Json(name = "meters")
                val meters: Meters?,
                @Json(name = "miles")
                val miles: Miles?
            ) {
                @Keep
                data class Feet(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )

                @Keep
                data class Kilometers(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )

                @Keep
                data class Meters(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )

                @Keep
                data class Miles(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )
            }

            @Keep
            data class Links(
                @Json(name = "self")
                val self: String?
            )
        }

        @Keep
        data class X20250121(
            @Json(name = "absolute_magnitude_h")
            val absoluteMagnitudeH: Double?,
            @Json(name = "close_approach_data")
            val closeApproachData: List<CloseApproachData?>?,
            @Json(name = "estimated_diameter")
            val estimatedDiameter: EstimatedDiameter?,
            @Json(name = "id")
            val id: String?,
            @Json(name = "is_potentially_hazardous_asteroid")
            val isPotentiallyHazardousAsteroid: Boolean?,
            @Json(name = "is_sentry_object")
            val isSentryObject: Boolean?,
            @Json(name = "links")
            val links: Links?,
            @Json(name = "name")
            val name: String?,
            @Json(name = "nasa_jpl_url")
            val nasaJplUrl: String?,
            @Json(name = "neo_reference_id")
            val neoReferenceId: String?
        ) {
            @Keep
            data class CloseApproachData(
                @Json(name = "close_approach_date")
                val closeApproachDate: String?,
                @Json(name = "close_approach_date_full")
                val closeApproachDateFull: String?,
                @Json(name = "epoch_date_close_approach")
                val epochDateCloseApproach: Long?,
                @Json(name = "miss_distance")
                val missDistance: MissDistance?,
                @Json(name = "orbiting_body")
                val orbitingBody: String?,
                @Json(name = "relative_velocity")
                val relativeVelocity: RelativeVelocity?
            ) {
                @Keep
                data class MissDistance(
                    @Json(name = "astronomical")
                    val astronomical: String?,
                    @Json(name = "kilometers")
                    val kilometers: String?,
                    @Json(name = "lunar")
                    val lunar: String?,
                    @Json(name = "miles")
                    val miles: String?
                )

                @Keep
                data class RelativeVelocity(
                    @Json(name = "kilometers_per_hour")
                    val kilometersPerHour: String?,
                    @Json(name = "kilometers_per_second")
                    val kilometersPerSecond: String?,
                    @Json(name = "miles_per_hour")
                    val milesPerHour: String?
                )
            }

            @Keep
            data class EstimatedDiameter(
                @Json(name = "feet")
                val feet: Feet?,
                @Json(name = "kilometers")
                val kilometers: Kilometers?,
                @Json(name = "meters")
                val meters: Meters?,
                @Json(name = "miles")
                val miles: Miles?
            ) {
                @Keep
                data class Feet(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )

                @Keep
                data class Kilometers(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )

                @Keep
                data class Meters(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )

                @Keep
                data class Miles(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )
            }

            @Keep
            data class Links(
                @Json(name = "self")
                val self: String?
            )
        }

        @Keep
        data class X20250122(
            @Json(name = "absolute_magnitude_h")
            val absoluteMagnitudeH: Double?,
            @Json(name = "close_approach_data")
            val closeApproachData: List<CloseApproachData?>?,
            @Json(name = "estimated_diameter")
            val estimatedDiameter: EstimatedDiameter?,
            @Json(name = "id")
            val id: String?,
            @Json(name = "is_potentially_hazardous_asteroid")
            val isPotentiallyHazardousAsteroid: Boolean?,
            @Json(name = "is_sentry_object")
            val isSentryObject: Boolean?,
            @Json(name = "links")
            val links: Links?,
            @Json(name = "name")
            val name: String?,
            @Json(name = "nasa_jpl_url")
            val nasaJplUrl: String?,
            @Json(name = "neo_reference_id")
            val neoReferenceId: String?,
            @Json(name = "sentry_data")
            val sentryData: String?
        ) {
            @Keep
            data class CloseApproachData(
                @Json(name = "close_approach_date")
                val closeApproachDate: String?,
                @Json(name = "close_approach_date_full")
                val closeApproachDateFull: String?,
                @Json(name = "epoch_date_close_approach")
                val epochDateCloseApproach: Long?,
                @Json(name = "miss_distance")
                val missDistance: MissDistance?,
                @Json(name = "orbiting_body")
                val orbitingBody: String?,
                @Json(name = "relative_velocity")
                val relativeVelocity: RelativeVelocity?
            ) {
                @Keep
                data class MissDistance(
                    @Json(name = "astronomical")
                    val astronomical: String?,
                    @Json(name = "kilometers")
                    val kilometers: String?,
                    @Json(name = "lunar")
                    val lunar: String?,
                    @Json(name = "miles")
                    val miles: String?
                )

                @Keep
                data class RelativeVelocity(
                    @Json(name = "kilometers_per_hour")
                    val kilometersPerHour: String?,
                    @Json(name = "kilometers_per_second")
                    val kilometersPerSecond: String?,
                    @Json(name = "miles_per_hour")
                    val milesPerHour: String?
                )
            }

            @Keep
            data class EstimatedDiameter(
                @Json(name = "feet")
                val feet: Feet?,
                @Json(name = "kilometers")
                val kilometers: Kilometers?,
                @Json(name = "meters")
                val meters: Meters?,
                @Json(name = "miles")
                val miles: Miles?
            ) {
                @Keep
                data class Feet(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )

                @Keep
                data class Kilometers(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )

                @Keep
                data class Meters(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )

                @Keep
                data class Miles(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )
            }

            @Keep
            data class Links(
                @Json(name = "self")
                val self: String?
            )
        }

        @Keep
        data class X20250123(
            @Json(name = "absolute_magnitude_h")
            val absoluteMagnitudeH: Double?,
            @Json(name = "close_approach_data")
            val closeApproachData: List<CloseApproachData?>?,
            @Json(name = "estimated_diameter")
            val estimatedDiameter: EstimatedDiameter?,
            @Json(name = "id")
            val id: String?,
            @Json(name = "is_potentially_hazardous_asteroid")
            val isPotentiallyHazardousAsteroid: Boolean?,
            @Json(name = "is_sentry_object")
            val isSentryObject: Boolean?,
            @Json(name = "links")
            val links: Links?,
            @Json(name = "name")
            val name: String?,
            @Json(name = "nasa_jpl_url")
            val nasaJplUrl: String?,
            @Json(name = "neo_reference_id")
            val neoReferenceId: String?
        ) {
            @Keep
            data class CloseApproachData(
                @Json(name = "close_approach_date")
                val closeApproachDate: String?,
                @Json(name = "close_approach_date_full")
                val closeApproachDateFull: String?,
                @Json(name = "epoch_date_close_approach")
                val epochDateCloseApproach: Long?,
                @Json(name = "miss_distance")
                val missDistance: MissDistance?,
                @Json(name = "orbiting_body")
                val orbitingBody: String?,
                @Json(name = "relative_velocity")
                val relativeVelocity: RelativeVelocity?
            ) {
                @Keep
                data class MissDistance(
                    @Json(name = "astronomical")
                    val astronomical: String?,
                    @Json(name = "kilometers")
                    val kilometers: String?,
                    @Json(name = "lunar")
                    val lunar: String?,
                    @Json(name = "miles")
                    val miles: String?
                )

                @Keep
                data class RelativeVelocity(
                    @Json(name = "kilometers_per_hour")
                    val kilometersPerHour: String?,
                    @Json(name = "kilometers_per_second")
                    val kilometersPerSecond: String?,
                    @Json(name = "miles_per_hour")
                    val milesPerHour: String?
                )
            }

            @Keep
            data class EstimatedDiameter(
                @Json(name = "feet")
                val feet: Feet?,
                @Json(name = "kilometers")
                val kilometers: Kilometers?,
                @Json(name = "meters")
                val meters: Meters?,
                @Json(name = "miles")
                val miles: Miles?
            ) {
                @Keep
                data class Feet(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )

                @Keep
                data class Kilometers(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )

                @Keep
                data class Meters(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )

                @Keep
                data class Miles(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )
            }

            @Keep
            data class Links(
                @Json(name = "self")
                val self: String?
            )
        }

        @Keep
        data class X20250124(
            @Json(name = "absolute_magnitude_h")
            val absoluteMagnitudeH: Double?,
            @Json(name = "close_approach_data")
            val closeApproachData: List<CloseApproachData?>?,
            @Json(name = "estimated_diameter")
            val estimatedDiameter: EstimatedDiameter?,
            @Json(name = "id")
            val id: String?,
            @Json(name = "is_potentially_hazardous_asteroid")
            val isPotentiallyHazardousAsteroid: Boolean?,
            @Json(name = "is_sentry_object")
            val isSentryObject: Boolean?,
            @Json(name = "links")
            val links: Links?,
            @Json(name = "name")
            val name: String?,
            @Json(name = "nasa_jpl_url")
            val nasaJplUrl: String?,
            @Json(name = "neo_reference_id")
            val neoReferenceId: String?
        ) {
            @Keep
            data class CloseApproachData(
                @Json(name = "close_approach_date")
                val closeApproachDate: String?,
                @Json(name = "close_approach_date_full")
                val closeApproachDateFull: String?,
                @Json(name = "epoch_date_close_approach")
                val epochDateCloseApproach: Long?,
                @Json(name = "miss_distance")
                val missDistance: MissDistance?,
                @Json(name = "orbiting_body")
                val orbitingBody: String?,
                @Json(name = "relative_velocity")
                val relativeVelocity: RelativeVelocity?
            ) {
                @Keep
                data class MissDistance(
                    @Json(name = "astronomical")
                    val astronomical: String?,
                    @Json(name = "kilometers")
                    val kilometers: String?,
                    @Json(name = "lunar")
                    val lunar: String?,
                    @Json(name = "miles")
                    val miles: String?
                )

                @Keep
                data class RelativeVelocity(
                    @Json(name = "kilometers_per_hour")
                    val kilometersPerHour: String?,
                    @Json(name = "kilometers_per_second")
                    val kilometersPerSecond: String?,
                    @Json(name = "miles_per_hour")
                    val milesPerHour: String?
                )
            }

            @Keep
            data class EstimatedDiameter(
                @Json(name = "feet")
                val feet: Feet?,
                @Json(name = "kilometers")
                val kilometers: Kilometers?,
                @Json(name = "meters")
                val meters: Meters?,
                @Json(name = "miles")
                val miles: Miles?
            ) {
                @Keep
                data class Feet(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )

                @Keep
                data class Kilometers(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )

                @Keep
                data class Meters(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )

                @Keep
                data class Miles(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )
            }

            @Keep
            data class Links(
                @Json(name = "self")
                val self: String?
            )
        }

        @Keep
        data class X20250125(
            @Json(name = "absolute_magnitude_h")
            val absoluteMagnitudeH: Double?,
            @Json(name = "close_approach_data")
            val closeApproachData: List<CloseApproachData?>?,
            @Json(name = "estimated_diameter")
            val estimatedDiameter: EstimatedDiameter?,
            @Json(name = "id")
            val id: String?,
            @Json(name = "is_potentially_hazardous_asteroid")
            val isPotentiallyHazardousAsteroid: Boolean?,
            @Json(name = "is_sentry_object")
            val isSentryObject: Boolean?,
            @Json(name = "links")
            val links: Links?,
            @Json(name = "name")
            val name: String?,
            @Json(name = "nasa_jpl_url")
            val nasaJplUrl: String?,
            @Json(name = "neo_reference_id")
            val neoReferenceId: String?,
            @Json(name = "sentry_data")
            val sentryData: String?
        ) {
            @Keep
            data class CloseApproachData(
                @Json(name = "close_approach_date")
                val closeApproachDate: String?,
                @Json(name = "close_approach_date_full")
                val closeApproachDateFull: String?,
                @Json(name = "epoch_date_close_approach")
                val epochDateCloseApproach: Long?,
                @Json(name = "miss_distance")
                val missDistance: MissDistance?,
                @Json(name = "orbiting_body")
                val orbitingBody: String?,
                @Json(name = "relative_velocity")
                val relativeVelocity: RelativeVelocity?
            ) {
                @Keep
                data class MissDistance(
                    @Json(name = "astronomical")
                    val astronomical: String?,
                    @Json(name = "kilometers")
                    val kilometers: String?,
                    @Json(name = "lunar")
                    val lunar: String?,
                    @Json(name = "miles")
                    val miles: String?
                )

                @Keep
                data class RelativeVelocity(
                    @Json(name = "kilometers_per_hour")
                    val kilometersPerHour: String?,
                    @Json(name = "kilometers_per_second")
                    val kilometersPerSecond: String?,
                    @Json(name = "miles_per_hour")
                    val milesPerHour: String?
                )
            }

            @Keep
            data class EstimatedDiameter(
                @Json(name = "feet")
                val feet: Feet?,
                @Json(name = "kilometers")
                val kilometers: Kilometers?,
                @Json(name = "meters")
                val meters: Meters?,
                @Json(name = "miles")
                val miles: Miles?
            ) {
                @Keep
                data class Feet(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )

                @Keep
                data class Kilometers(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )

                @Keep
                data class Meters(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )

                @Keep
                data class Miles(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )
            }

            @Keep
            data class Links(
                @Json(name = "self")
                val self: String?
            )
        }

        @Keep
        data class X20250126(
            @Json(name = "absolute_magnitude_h")
            val absoluteMagnitudeH: Double?,
            @Json(name = "close_approach_data")
            val closeApproachData: List<CloseApproachData?>?,
            @Json(name = "estimated_diameter")
            val estimatedDiameter: EstimatedDiameter?,
            @Json(name = "id")
            val id: String?,
            @Json(name = "is_potentially_hazardous_asteroid")
            val isPotentiallyHazardousAsteroid: Boolean?,
            @Json(name = "is_sentry_object")
            val isSentryObject: Boolean?,
            @Json(name = "links")
            val links: Links?,
            @Json(name = "name")
            val name: String?,
            @Json(name = "nasa_jpl_url")
            val nasaJplUrl: String?,
            @Json(name = "neo_reference_id")
            val neoReferenceId: String?,
            @Json(name = "sentry_data")
            val sentryData: String?
        ) {
            @Keep
            data class CloseApproachData(
                @Json(name = "close_approach_date")
                val closeApproachDate: String?,
                @Json(name = "close_approach_date_full")
                val closeApproachDateFull: String?,
                @Json(name = "epoch_date_close_approach")
                val epochDateCloseApproach: Long?,
                @Json(name = "miss_distance")
                val missDistance: MissDistance?,
                @Json(name = "orbiting_body")
                val orbitingBody: String?,
                @Json(name = "relative_velocity")
                val relativeVelocity: RelativeVelocity?
            ) {
                @Keep
                data class MissDistance(
                    @Json(name = "astronomical")
                    val astronomical: String?,
                    @Json(name = "kilometers")
                    val kilometers: String?,
                    @Json(name = "lunar")
                    val lunar: String?,
                    @Json(name = "miles")
                    val miles: String?
                )

                @Keep
                data class RelativeVelocity(
                    @Json(name = "kilometers_per_hour")
                    val kilometersPerHour: String?,
                    @Json(name = "kilometers_per_second")
                    val kilometersPerSecond: String?,
                    @Json(name = "miles_per_hour")
                    val milesPerHour: String?
                )
            }

            @Keep
            data class EstimatedDiameter(
                @Json(name = "feet")
                val feet: Feet?,
                @Json(name = "kilometers")
                val kilometers: Kilometers?,
                @Json(name = "meters")
                val meters: Meters?,
                @Json(name = "miles")
                val miles: Miles?
            ) {
                @Keep
                data class Feet(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )

                @Keep
                data class Kilometers(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )

                @Keep
                data class Meters(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )

                @Keep
                data class Miles(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )
            }

            @Keep
            data class Links(
                @Json(name = "self")
                val self: String?
            )
        }

        @Keep
        data class X20250127(
            @Json(name = "absolute_magnitude_h")
            val absoluteMagnitudeH: Double?,
            @Json(name = "close_approach_data")
            val closeApproachData: List<CloseApproachData?>?,
            @Json(name = "estimated_diameter")
            val estimatedDiameter: EstimatedDiameter?,
            @Json(name = "id")
            val id: String?,
            @Json(name = "is_potentially_hazardous_asteroid")
            val isPotentiallyHazardousAsteroid: Boolean?,
            @Json(name = "is_sentry_object")
            val isSentryObject: Boolean?,
            @Json(name = "links")
            val links: Links?,
            @Json(name = "name")
            val name: String?,
            @Json(name = "nasa_jpl_url")
            val nasaJplUrl: String?,
            @Json(name = "neo_reference_id")
            val neoReferenceId: String?,
            @Json(name = "sentry_data")
            val sentryData: String?
        ) {
            @Keep
            data class CloseApproachData(
                @Json(name = "close_approach_date")
                val closeApproachDate: String?,
                @Json(name = "close_approach_date_full")
                val closeApproachDateFull: String?,
                @Json(name = "epoch_date_close_approach")
                val epochDateCloseApproach: Long?,
                @Json(name = "miss_distance")
                val missDistance: MissDistance?,
                @Json(name = "orbiting_body")
                val orbitingBody: String?,
                @Json(name = "relative_velocity")
                val relativeVelocity: RelativeVelocity?
            ) {
                @Keep
                data class MissDistance(
                    @Json(name = "astronomical")
                    val astronomical: String?,
                    @Json(name = "kilometers")
                    val kilometers: String?,
                    @Json(name = "lunar")
                    val lunar: String?,
                    @Json(name = "miles")
                    val miles: String?
                )

                @Keep
                data class RelativeVelocity(
                    @Json(name = "kilometers_per_hour")
                    val kilometersPerHour: String?,
                    @Json(name = "kilometers_per_second")
                    val kilometersPerSecond: String?,
                    @Json(name = "miles_per_hour")
                    val milesPerHour: String?
                )
            }

            @Keep
            data class EstimatedDiameter(
                @Json(name = "feet")
                val feet: Feet?,
                @Json(name = "kilometers")
                val kilometers: Kilometers?,
                @Json(name = "meters")
                val meters: Meters?,
                @Json(name = "miles")
                val miles: Miles?
            ) {
                @Keep
                data class Feet(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )

                @Keep
                data class Kilometers(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )

                @Keep
                data class Meters(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )

                @Keep
                data class Miles(
                    @Json(name = "estimated_diameter_max")
                    val estimatedDiameterMax: Double?,
                    @Json(name = "estimated_diameter_min")
                    val estimatedDiameterMin: Double?
                )
            }

            @Keep
            data class Links(
                @Json(name = "self")
                val self: String?
            )
        }
    }
}