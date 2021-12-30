package com.github.justfoxxo.neb
import com.github.justfoxxo.neb.berry_block.berryBlocks
import net.fabricmc.api.ModInitializer

@Suppress("UNUSED")
object Main: ModInitializer {
    val mod_id = "neb"
    override fun onInitialize() {
        for(i in 1..250) print("=")
        println("Initializing Not Enough Berries")
        println("InDev Version (Version created only for tests for developers not release)")
        berryBlocks()
    }
}