package com.laurenm.navigationcomponent.feed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.laurenm.navigationcomponent.HomeFragmentDirections
import com.laurenm.navigationcomponent.R
import kotlinx.android.synthetic.main.fragment_feed.view.*


class FeedFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_feed, container, false)
        view.recycler.adapter = BoatsAdapter(BOATS, ::onBoatClick)
        view.recycler.layoutManager = LinearLayoutManager(view.context)
        return view
    }

    private fun onBoatClick(boatId: Int) {
        val action = HomeFragmentDirections.actionHomeFragmentToBoatFragment(boatId)
        activity?.findNavController(R.id.nav_container)?.navigate(action)
    }
}

