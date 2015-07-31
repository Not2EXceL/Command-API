package io.not2excel.commandapi.injection

/*
 * Copyright (C) 2011-Current Richmond Steele (Not2EXceL) (nasm) <not2excel@gmail.com>
 * 
 * This file is part of kotlin.
 * 
 * kotlin can not be copied and/or distributed without the express
 * permission of the aforementioned owner.
 */

public interface ParamBind<T> {
    val type: Class<T>
    fun bind(): T
}

public interface TypeBind<T> : ParamBind<T> {
    override fun bind(): T { throw UnsupportedOperationException() }
    fun bind(input: String): T
    fun bind(args: Array<String>, index: Int): T
}
