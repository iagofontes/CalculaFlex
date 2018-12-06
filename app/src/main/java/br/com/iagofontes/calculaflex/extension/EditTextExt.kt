package br.com.iagofontes.calculaflex.extension

import android.widget.EditText

fun EditText.getValue() = this.text.toString()

fun EditText.getDoule() = this.getValue().toDouble()