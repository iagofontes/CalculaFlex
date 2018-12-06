package br.com.iagofontes.calculaflex.extension

fun Double.format(digits: Int) = String.format("%.${digits}f", this)