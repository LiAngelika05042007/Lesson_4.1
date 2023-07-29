package com.angelika.lesson_41

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.angelika.lesson_41.databinding.FragmentAnimeBinding

class AnimeFragment : Fragment() {

    private var _binding: FragmentAnimeBinding? = null
    private val binding get() = _binding!!
    private val animeAdapter = ModelAdapter(this::onItemClick)

    private fun onItemClick(model: Model) {

    }

    private val animeList = listOf(
        Model(
            R.drawable.attack,
            "Attack of the Titans",
            "Plot: This is a popular anime set in an alternate world..."
        ),
        Model(
            R.drawable.naruto,
            "Naruto",
            "Plot: a story about a young ninja Naruto who dreams of..."
        ),
        Model(
            R.drawable.volleyball,
            "Volleyball",
            "Plot: This is the story of Hinata Shoyou, a little guy who..."
        ),
        Model(
            R.drawable.demon,
            "Demon Cleaver",
            "Plot: the story of Tanjiro, a demon hunter who is looking..."
        ),
        Model(
            R.drawable.welcome,
            "Welcome to the class of excellence",
            "Plot: A story about students who have to overcome..."
        ),
        Model(
            R.drawable.chorimia,
            "Chorimia",
            "Plot: This is a romantic anime about two high school..."
        ),
        Model(
            R.drawable.level,
            "My Level 999 Love for Yamada Kun",
            "Plot: This is a comedic and romantic story about Ryu..."
        ),
        Model(
            R.drawable.basketball,
            "Basketball",
            "Plot: a story about Kuroko Tetsuya and his team..."
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAnimeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvAnime.adapter = animeAdapter
        animeAdapter.setData(animeList)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}