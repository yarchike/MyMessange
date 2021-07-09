package com.martynov.mymessange.ui.fragments

import android.widget.Toast
import androidx.fragment.app.Fragment
import com.martynov.mymessange.R
import kotlinx.android.synthetic.main.fragment_enter_phone_number.*

class EnterPhoneNumberFragment : Fragment(R.layout.fragment_enter_phone_number) {

    override fun onStart() {
        super.onStart()
        register_btn_next.setOnClickListener {
            sendCode()
        }
    }

    private fun sendCode() {
        if(register_input_phone_number.text.toString().isEmpty()){
            Toast.makeText(activity, getString(R.string.registr_toast_enter_phone), Toast.LENGTH_SHORT).show()
        }else{
            parentFragmentManager.beginTransaction()
                .replace(R.id.registerDataContainer, EnterCodeFragment())
                .addToBackStack(null)
                .commit()

        }
    }
}