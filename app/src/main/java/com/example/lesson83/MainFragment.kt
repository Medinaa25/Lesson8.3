package com.example.lesson83

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import com.example.lesson83.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding : FragmentMainBinding
    private lateinit var adapter: CharactersAdapter
    private val characters = arrayListOf<Characters>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentMainBinding.inflate(LayoutInflater.from(requireContext()),container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val person = Characters(
            name = " ", age = " ",
            photo = " "
        )
        loadData()
        adapter= CharactersAdapter(characters)
        binding.recycle.adapter = adapter
        adapter = CharactersAdapter(characters) {
            /*val bundle = Bundle()
            bundle.putSerializable("key", person )*/
            navigate(R.id.detailsFragment)
        }



    }

    private fun loadData() {
        characters.add(Characters("Rick Sanchez","70 years old","https://citaty.info/files/styles/s/public/characters/144853.jpg?itok=gc_DKe24"))
        characters.add(Characters("Morty Smith","14 years old","https://rickandmortytv.ru/images/hero/morty_smith.jpg"))
        characters.add(Characters("Jerry Smith","35 years old","https://u.kanobu.ru/editor/images/46/7c411174-0e2b-4bac-8b5c-8ba0c6bcbeaa.webp"))
        characters.add(Characters("Summer Smith","17 years old","https://static.wikia.nocookie.net/rickandmorty/images/1/12/%D0%A1%D0%B0%D0%BC%D0%BC%D0%B5%D1%80_%D0%A1%D0%BC%D0%B8%D1%82_002.jpg/revision/latest/scale-to-width-down/250?cb=20151124155155&path-prefix=ru"))
        characters.add(Characters("Beth Smith","34 years old","https://relaza.com/sites/default/files/styles/medium/public/pictures/picture-34057-1628334720.png?itok=6N1jm8Of"))
        characters.add(Characters("Jessica","14 years old","https://static.wikia.nocookie.net/rickandmorty/images/e/e8/Jessica.png/revision/latest?cb=20150706222334"))
    characters.add(Characters("Diana Sanchez","20 years old","https://fanfics.me/images/fandoms_heroes/355-1502702133.jpg"))}



}