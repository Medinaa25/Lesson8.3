package com.example.lesson83

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.lesson83.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding : FragmentSecondBinding
    private lateinit var adapter: LocationAdapter
    private var location = arrayListOf<Location>()
    private var place = Location()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View{
        binding = FragmentSecondBinding.inflate(LayoutInflater.from(requireContext()),container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recycler.layoutManager = GridLayoutManager(requireContext(),2)
        loadData()
binding.recycler.adapter = adapter
        adapter = LocationAdapter(location){
            val bundle = Bundle()
            bundle.putString("location", location.toString())
            navigate(R.id.action_secondFragment_to_detailsFragment,bundle)
        }
    }

    private fun loadData() {
        location.add(Location("Arboles Mentirosos","Planet"))
        location.add(Location("Bird World","Planet"))
        location.add(Location("Blips and Chitz","Arcade"))
        location.add(Location("Cafe Sanchez","Business"))
        location.add(Location("Don Cuco","Mexican restaurant"))
        location.add(Location("Gromflom Prime","Planet"))
        location.add(Location("Plim Plom","Tavern"))
        location.add(Location("Miniverse","Microscopic universe"))
        location.add(Location("Anatomy Park","Microverse"))
        location.add(Location("Krumpf","Planet"))

    }


}


