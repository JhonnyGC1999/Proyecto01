package com.jhonnygc.proyecto01

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.jhonnygc.proyecto01.databinding.DialogMainBinding

class clsMainDialog : DialogFragment() {

    private lateinit var binding: DialogMainBinding // Declaración de la propiedad de ViewBinding

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // Inicializar el objeto de diálogo
        val dialog = Dialog(requireContext())

        // Inflar el diseño del diálogo utilizando ViewBinding
        binding = DialogMainBinding.inflate(layoutInflater)
        val view = binding.root
        dialog.setContentView(view)
        view.setBackgroundResource(R.drawable.dialog_rounded_corners)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))



        // Configurar el título y los botones del diálogo
        binding.dialogTitle.text = "Título Personalizado"

        // Configurar clics de botones
        binding.btnAceptar.setOnClickListener {
            // Lógica para el botón Aceptar
            dialog.dismiss() // Cierra el diálogo
        }

        binding.btnCancelar.setOnClickListener {
            // Lógica para el botón Cancelar
            dialog.dismiss() // Cierra el diálogo
        }
        return dialog
    }
}