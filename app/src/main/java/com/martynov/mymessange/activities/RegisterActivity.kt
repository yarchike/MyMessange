package com.martynov.mymessange.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.martynov.mymessange.R
import com.martynov.mymessange.databinding.ActivityRegisterBinding
import com.martynov.mymessange.ui.fragments.EnterPhoneNumberFragment

class RegisterActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityRegisterBinding
    private lateinit var mToolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()
        mToolbar = mBinding.registerToolbar
        setSupportActionBar(mToolbar)
        title = getString(R.string.register_title_your_phone)
        supportFragmentManager.beginTransaction()
            .add(R.id.registerDataContainer, EnterPhoneNumberFragment())
            .commit()
    }
}