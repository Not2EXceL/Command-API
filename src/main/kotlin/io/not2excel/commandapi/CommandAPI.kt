package io.not2excel.commandapi

import io.not2excel.utils.validateUUID
import org.bukkit.plugin.java.JavaPlugin
import java.util.*

/*
 * Copyright (C) 2011-Current Richmond Steele (Not2EXceL) (nasm) <not2excel@gmail.com>
 * 
 * This file is part of kotlin.
 * 
 * kotlin can not be copied and/or distributed without the express
 * permission of the aforementioned owner.
 */

fun main(args: Array<String>) {
    //uuid 4
    val uuid = UUID.randomUUID()
    println(uuid.toString())
    println(uuid.version())
    println(validateUUID(uuid.toString()))
    //uuid 3
    //d68e3d12-2b4f-36fd-8b97-cc5bebc9ad34
    val off = UUID.fromString("d68e3d12-2b4f-36fd-8b97-cc5bebc9ad34")
    println(off.toString())
    println(off.version())
    println(validateUUID(off.toString()))
}

class CommandAPI : JavaPlugin() {

    override fun onEnable() {

    }
}
