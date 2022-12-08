package com.example.total8_month03

import android.icu.text.IDNA.Info
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ScrollingView
import androidx.core.view.get
import com.example.total8_month03.databinding.FragmentSecondBinding
import java.security.Key

class SecondFragment : Fragment() {

    lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_second, container, false)
        binding=FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val res = arguments?.getString(Keys.key_book) //получение данных
        binding.messageTv.text=res
        binding.messageTv.movementMethod
    }
                                                                                       //when для передачи по клику определеной ячейки
}
