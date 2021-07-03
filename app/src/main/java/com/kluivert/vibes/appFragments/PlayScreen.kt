package com.kluivert.vibes.appFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kluivert.vibes.R
import com.kluivert.vibes.databinding.FragmentPlayScreenBinding


class PlayScreen : Fragment() {

    companion object {
        const val TAG = "PlayScreenFragment"
        fun newInstance(): PlayScreen {
            val args = Bundle()
            val playScreenFragment = PlayScreen()
            playScreenFragment.arguments = args
            return playScreenFragment
        }
    }

    private var _binding : FragmentPlayScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPlayScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

}