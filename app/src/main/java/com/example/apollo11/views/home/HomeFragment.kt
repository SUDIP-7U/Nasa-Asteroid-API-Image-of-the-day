package com.example.apollo11.views.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.apollo11.Adapter.NearEarthObjectsAdapter
import com.example.apollo11.databinding.FragmentHomeBinding
import com.squareup.picasso.Picasso


class HomeFragment : Fragment() {
    private val viewModel by viewModels<HomeViewModel>()

    lateinit var binding: FragmentHomeBinding

    private lateinit var adapter: NearEarthObjectsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.imageOfTheDay.observe(viewLifecycleOwner){ imageoftheday->
            imageoftheday?.let {
                Picasso.get()
                    .load(it.url)
                    .into(binding.imageViewOfTheDay)
                binding.tvTitle.text = it.title
            }
        }
    }
}
