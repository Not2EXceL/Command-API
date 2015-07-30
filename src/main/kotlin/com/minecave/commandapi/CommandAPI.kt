package com.minecave.commandapi

import org.bukkit.plugin.java.JavaPlugin

/*
 * Copyright (C) 2011-Current Richmond Steele (Not2EXceL) (nasm) <not2excel@gmail.com>
 * 
 * This file is part of kotlin.
 * 
 * kotlin can not be copied and/or distributed without the express
 * permission of the aforementioned owner.
 */

fun main(args: Array<String>) {
    val context = arrayOf("d", "e", "f")
    println(context)
    println(context.toString())
    println(context + "")
}

class CommandAPI : JavaPlugin() {

    override fun onEnable() {

    }
}
