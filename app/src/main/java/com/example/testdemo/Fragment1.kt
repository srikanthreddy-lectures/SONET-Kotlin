package com.example.testdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.testdemo.databinding.Fragment1Binding

class Fragment1 : Fragment() {
    //logic
    lateinit var binder : Fragment1Binding

    lateinit var myVM : MyViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binder = Fragment1Binding.inflate(layoutInflater)
        return binder.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        myVM = ViewModelProvider(requireActivity()).get(MyViewModel::class.java)

        binder.fragmentChangeBtn.setOnClickListener(View.OnClickListener {
            var fragmentManager = activity?.supportFragmentManager
            var fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.demo_fragment_container, Fragment2())
            fragmentTransaction?.commit()
        })

        binder.vmSaveBtn.setOnClickListener(View.OnClickListener {
            var name = binder.vmNameEt.text.toString()
            myVM.setData(name)
        })
    }
}

