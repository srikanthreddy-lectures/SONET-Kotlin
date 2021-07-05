package com.example.testdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.testdemo.databinding.ActivityFragmentDemoBinding

class FragmentActivityDemo : AppCompatActivity() {

    lateinit var binding : ActivityFragmentDemoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(Fragment1())

        binding.demoFragmentBtn1.setOnClickListener(View.OnClickListener {
            replaceFragment(Fragment1())
        })

        binding.demoFragmentBtn2.setOnClickListener(View.OnClickListener {
            replaceFragment(Fragment2())
        })
    }

    private fun replaceFragment(a:Fragment){
        var fragmentManager = supportFragmentManager
        var fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.demo_fragment_container, a)
        fragmentTransaction.commit()
    }
}