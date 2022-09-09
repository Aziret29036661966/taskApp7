package com.example.core.core

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.widget.Toast

fun Context.showToast(text: String){
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}
fun Context.dialogShow(unit: DialogInterface.OnClickListener) {
    val dialog = AlertDialog.Builder(
        this)
        .setCancelable(false)
        .setMessage("Are you sure")
        .setPositiveButton("Yes", unit)
        .setNegativeButton("No", unit)
        .create()
    dialog.show()
}