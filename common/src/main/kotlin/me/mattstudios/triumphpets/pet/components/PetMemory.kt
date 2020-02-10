package me.mattstudios.triumphpets.pet.components

import me.mattstudios.mattcore.MattPlugin
import org.bukkit.Bukkit
import org.bukkit.entity.Item
import org.bukkit.inventory.ItemStack


/**
 * @author Matt
 */
class PetMemory(private val plugin: MattPlugin) {

    var tracking = false

    private val forgetList = mutableListOf<Item>()
    private val personalBlackList = mutableListOf<ItemStack>()

    /**
     * Makes it so it can clear the forget list periodically
     */
    init {
        periodicallyClearForget()
    }

    /**
     * Forgets an item
     */
    fun forgetItem(item: Item) {
        forgetList.add(item)
    }

    /**
     * Checks if the item in question is forgotten or not
     */
    fun isForgotten(item: Item?): Boolean {
        return if (item == null) true else forgetList.contains(item)
    }

    /**
     * Every 15 minutes clears the forgotten list
     */
    private fun periodicallyClearForget() {
        Bukkit.getScheduler().runTaskTimerAsynchronously(plugin, Runnable { forgetList.clear() }, 18000L, 18000L)
    }

}