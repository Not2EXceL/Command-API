package io.not2excel.utils

import java.util.regex.Pattern

/*
 * Copyright (C) 2011-Current Richmond Steele (Not2EXceL) (nasm) <not2excel@gmail.com>
 * 
 * This file is part of kotlin.
 * 
 * kotlin can not be copied and/or distributed without the express
 * permission of the aforementioned owner.
 */
val regex: Pattern = Pattern.compile("[0-9a-fA-F]{8}(?:-[0-9a-fA-F]{4}){3}-[0-9a-fA-F]{12}")

fun validateUUID(input: String): Boolean = regex.matcher(input).matches()
