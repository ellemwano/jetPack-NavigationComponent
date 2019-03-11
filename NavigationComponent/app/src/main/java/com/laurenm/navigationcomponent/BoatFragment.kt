package com.laurenm.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.laurenm.navigationcomponent.feed.BOATS
import com.laurenm.navigationcomponent.feed.getBoat
import kotlinx.android.synthetic.main.fragment_boat.view.*


class BoatFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // No longer valid - Type mismatch error on arguments: required Bundle, found Bundle?
//        val id = arguments?.getString("id_dl")?.toInt()
//            ?: BoatFragmentArgs.fromBundle(arguments).id

// FIXME id_dl ?
        val id = arguments?.let { BoatFragmentArgs.fromBundle(it).id }

        val boat = BOATS.getBoat(id!!)

        val view = inflater.inflate(R.layout.fragment_boat, container, false)
        view.nameTextView.text = boat.name
        view.locationTextView.text = boat.location
        view.imageView2.setImageResource(boat.picture)
        view.priceTextView.text = boat.price
        return view
    }
}
