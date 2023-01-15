package com.timmitof.countriesapp.ui.baseclasses

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.timmitof.countriesapp.R

abstract class BaseFragment<VB : ViewBinding>: Fragment() {

    protected lateinit var binding: VB
    protected abstract fun getViewBinding(): VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = getViewBinding()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListener()
        observeData()
    }

    open fun setupListener() {}

    open fun observeData() {}

    fun showAlert(message: String) {
        AlertDialog.Builder(requireContext())
            .setMessage(message)
            .setCancelable(true)
            .setNegativeButton(getString(R.string.close)) { dialogInterface, i ->
                dialogInterface.dismiss()
            }
            .create()
            .show()
    }
}