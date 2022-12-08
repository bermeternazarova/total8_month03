package com.example.total8_month03

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.total8_month03.databinding.FragmentFirstBinding

class FirstFragment : Fragment(),ClickListener{

    lateinit var binding: FragmentFirstBinding
     var name:ArrayList<ModelBook> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_first, container, false)
        binding=FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        booksName()
        binding.recyclerViewFirstFragment.adapter= AdapterBook(name,this)
    }

    override fun click(model: ModelBook) {
        findNavController().navigate(R.id.secondFragment, bundleOf(Keys.key_book to model.info1))
    }
    
    fun booksName(){
        name.add(ModelBook("Тополек мой в красной косынке"))
        name.add(ModelBook("Назад к тебе"))
        name.add(ModelBook("Мартин Иден"))
        name.add(ModelBook("Унесенные ветры"))
        name.add(ModelBook("Джейн Эйр"))
        name.add(ModelBook("Маленькая хозяйка большего дома"))
        name.add(ModelBook("Сияние"))
        name.add(ModelBook("Живые и мертвые"))
        name.add(ModelBook("Триумфальная арка"))
        name.add(ModelBook("Белый клык"))
        name.add(ModelBook("Мастер и Маргарита"))
        name.add(ModelBook("Сердца трех"))
    }}