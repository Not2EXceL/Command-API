package io.not2excel.commandapi.injection

import io.not2excel.utils.validateUUID
import org.bukkit.Bukkit
import org.bukkit.entity.Player
import java.util.*

/*
 * Copyright (C) 2011-Current Richmond Steele (Not2EXceL) (nasm) <not2excel@gmail.com>
 * 
 * This file is part of kotlin.
 * 
 * kotlin can not be copied and/or distributed without the express
 * permission of the aforementioned owner.
 */

class PlayerBind : TypeBind<Player> {

    override val type: Class<Player>
        get() = javaClass()

    override fun bind(input: String): Player {
        if(validateUUID(input)) return Bukkit.getPlayer(UUID.fromString(input))
        return Bukkit.getPlayer(input)
    }

    override fun bind(args: Array<String>, index: Int): Player {
        if(args.size() <= index) throw UnsupportedOperationException()
        val input = args.get(index)
        if(validateUUID(input)) return Bukkit.getPlayer(UUID.fromString(input))
        return Bukkit.getPlayer(input)
    }
}
