package com.angelika.lesson_41

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.angelika.lesson_41.databinding.FragmentItemDescriptionBinding

class ItemDescriptionFragment : Fragment() {

    private var _binding: FragmentItemDescriptionBinding? = null
    private val binding get() = _binding!!
    private val args by navArgs<ItemDescriptionFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentItemDescriptionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
    }

    private fun getData() = with(binding) {
        tvName.text = args.data.name
        modelPicture.setImageResource(args.data.picture)
        tvPlot.text = args.data.plot
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}