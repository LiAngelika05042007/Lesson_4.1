package com.angelika.lesson_41

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.angelika.lesson_41.databinding.FragmentManhwaBinding

class ManhwaFragment : Fragment() {

    private var _binding: FragmentManhwaBinding? = null
    private val binding get() = _binding!!
    private val manhwaAdapter = ModelAdapter(this::onItemClick)

    private fun onItemClick(model: Model) {
        findNavController().navigate(
            ManhwaFragmentDirections.actionManwhaFragmentToItemDescriptionFragment(
                model
            )
        )
    }

    private val manhwaList = listOf(
        Model(
            R.drawable.princess,
            "One day I became a princess",
            "Plot: The story tells about a girl from our world... who was reborn as a character in the fictional story \"Beautiful Princess\". She was reborn as the First Princess of the Obelin Empire with an unfortunate fate. In the story, Atanasia was killed by her father, Emperor Claude, for falsely accusing her of attempting the life of the Second Princess, Jenith Magrita. To avoid such a cruel fate, Atanasia decides to improve the relationship between her and her father in order to survive."
        ),
        Model(
            R.drawable.oak,
            "Under the oak",
            "Plot: The story tells us about a girl, the daughter of a... duke, Maximilian. She lives all her life under the yoke of her father, who does not say a single kind word to her. All she knows about herself is that she is ugly, untalented and completely useless. The girl can even speak out of fear with difficulty."
        ),
        Model(
            R.drawable.contract,
            "Duke's contract bride",
            "Plot: This manhwa is about how one girl in our time... only wanting to go to college. As soon as she received a message about what she did, she immediately dies. After that, she falls into those times when there was a hertz. Becomes the daughter of a duke while remembering her past life. in our time, she read one novel, and since in life where she is a duchess, everything coincides with the plot of the novel. And her main goal is to correct the plot of the novel so that there is not a single death."
        ),
        Model(
            R.drawable.father,
            "Seduce the villain's father",
            "Plot: This story is about how a girl after a car accident... Opening her eyes, she realized that she was in the novel \"Britney wants to be happy.\" Her only job is to stay alive. After all, in the novel, she is given only 5 years to live. She had a plan, if the person who kidnaps her marries her, then he will definitely be able to stop all the misfortunes that will overtake her and her family."
        ),
        Model(
            R.drawable.loop,
            "Loop",
            "Plot: Han Chae Ah has gone through a lot in the past... accusation from her sister, death of her parents, imprisonment. It would seem that it just couldn't get any worse. One day, Park Yoon offers her a very unusual deal. in fact, Park Yoon-soo was a vampire who killed and drank human blood, so he offered a deal with Chae Ah. He intimidated her by telling her to bury a human corpse. But since the council did not allow her, she decided simply not to do everything she says. and while she was burying the corpse, this vampire was filming her. And he began to threaten her even more. thus she bonds with the vampire by getting caught in the loop. But she is looking for a way to get rid of him or kill him. But she can't. As they spend time together, Park Yoon Soo falls in love with Chae Ah."
        ),
        Model(
            R.drawable.love,
            "Operation true love",
            "Plot: This manhwa is about that girl who doesn't like... anyone she caught her boyfriend cheating. then throws it away. After, two famous handsome guys fall in love with her."
        ),
        Model(
            R.drawable.sleep,
            "From sleep to freedom",
            "Plot: Jung Min is a high school loner who is bullied... by the standard of diligence and superiority named Joo Hyun. They were friends in elementary school, but their relationship ended abruptly after Joo Hyun demanded that they only talk to her. The same hero named Xi Yoon, who was a good boy all his life, but after he told his parents that he wanted to become an idol, he was immediately kicked out of the house. After, he nevertheless achieved his goal, but his partner, envy, asked to beat him. Afterwards, he was given the bad news that he would not be able to work with them. in stress, he does not know what to do and falls into a lucid dream."
        ),
        Model(
            R.drawable.heaven,
            "Relationships made by chance in heaven",
            "Plot: This manhwa is about the fact that, in the very... first chapter, the main characters, jokingly, got married. because they were both at the same age, yes, and they themselves were at the age of 33 years. and of course they got married by contract, so they lived and gradually they began to feel something, like love"
        ),
        Model(
            R.drawable.die,
            "My reason to die",
            "Plot: The main character, Nam Jio, is seriously injured before... the national taekwondo team's preliminaries. During this difficult period of her life, she meets Gyul, a mysterious guy who changes her life forever. He's the definition of a bad guy with a good heart, and she can't resist his charm. However, she may be playing with fire, as his company and lifestyle looks suspicious."
        ),
        Model(
            R.drawable.moon,
            "Dark moon: blood altar",
            "Plot: Welcome to Riverfield, where the most popular boys in two rival schools happen to be vampires and werewolves. When the mysterious new student Suha is transferred to Riverfield, rivals are inexplicably drawn to her. As horrific incidents begin to shake the city, the boys' forgotten past slowly begins to unravel... and their world is turned upside down."
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentManhwaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvManhwa.adapter = manhwaAdapter
        manhwaAdapter.setData(manhwaList)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}