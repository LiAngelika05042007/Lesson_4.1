package com.angelika.lesson_41

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.angelika.lesson_41.databinding.FragmentDoramaBinding

class DoramaFragment : Fragment() {

    private var _binding: FragmentDoramaBinding? = null
    private val binding get() = _binding!!
    private val doramaAdapter = ModelAdapter(this::onItemClick)

    private fun onItemClick(model: Model) {

    }

    private val doramaList = listOf(
        Model(
            R.drawable.beauty,
            "True beauty",
            "Plot: This drama is about how a girl named Kim Jo..."
        ),
        Model(
            R.drawable.crazy,
            "Crazy but it's ok",
            "Plot: Series about a mentally ill storyteller. The girl..."
        ),
        Model(
            R.drawable.business,
            "Business offer",
            "Plot: The girl asked her friend to go on a blind date..."
        ),
        Model(
            R.drawable.star,
            "Falling star",
            "Plot: Drama about how a girl manager works very hard..."
        ),
        Model(
            R.drawable.drink,
            "Work later, drink now",
            "Plot: Three friends who drink every night and..."
        ),
        Model(
            R.drawable.why,
            "Why Oh Soo Jae",
            "Plot: Drama about a lawyer who is accused of murder..."
        ),
        Model(
            R.drawable.sea,
            "Blue sea legend",
            "Plot: interesting drama about a mermaid who comes out..."
        ),
        Model(
            R.drawable.zombie,
            "Zombie detective",
            "Plot: Drama about a zombie who aims to become a human..."
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDoramaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvDorama.adapter = doramaAdapter
        doramaAdapter.setData(doramaList)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}