package me.mattstudios.triumphpets.pet

import org.bukkit.Location
import org.bukkit.entity.Entity
import org.bukkit.entity.Player

/**
 * @author Matt
 */
interface PetController {

    fun spawnPet(location: Location, player: Player)

    /**
     * Despawns the pet from player
     */
    fun despawnPet(player: Player)


    /**
     * Checks if the entity is a pet or not
     */
    fun isPet(entity: Entity): Boolean

    /**
     * Checks if the entity is a pet component
     */
    fun isPetComponent(entity: Entity): Boolean

    /**
     * Spawns a new pet on the location
     */
    //fun spawnPet(location: Location, player: Player)

    /**
     * Removes all the pets from the world
     */
    fun removeAll()

    fun removeCrash()
}