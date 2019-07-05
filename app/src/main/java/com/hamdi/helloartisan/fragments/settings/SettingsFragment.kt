package com.hamdi.helloartisan.fragments.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.hamdi.helloartisan.R
import kotlinx.android.synthetic.main.fragment_settings.*
import java.util.*


class SettingsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_profile.setOnClickListener {
            val random = Random()

            val nextAction = SettingsFragmentDirections.nextActionHome()
            nextAction.numOfPhotos = random.nextInt(1000)
            Navigation.findNavController(it).navigate(nextAction)
        }


    }

}
