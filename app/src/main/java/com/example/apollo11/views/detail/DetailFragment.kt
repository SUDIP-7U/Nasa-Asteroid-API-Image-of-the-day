package com.example.apollo11.views.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.apollo11.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)

        val asteroid = DetailFragmentArgs.fromBundle(requireArguments()).asteroid

        binding.apply {
            tvId.text = asteroid.id.toString()
            tvCodename.text = asteroid.codename
            tvCloseApproachDate.text = asteroid.closeApproachDate
            tvAbsoluteMagnitude.text = asteroid.absoluteMagnitude.toString()
            tvEstimatedDiameterMin.text = asteroid.estimatedDiameterMin.toString()
            tvEstimatedDiameterMax.text = asteroid.estimatedDiameterMax.toString()
            tvRelativeVelocity.text = asteroid.relativeVelocity.toString()
            tvDistanceFromEarth.text = asteroid.distanceFromEarth.toString()
            tvIsPotentiallyHazardous.text = asteroid.isPotentiallyHazardous.toString()
        }
        return binding.root
    }
}