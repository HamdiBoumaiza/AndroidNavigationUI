package com.hamdi.helloartisan.fragments.profile


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.hamdi.helloartisan.R
import kotlinx.android.synthetic.main.fragment_profile.*


class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_settings.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.next_action_settings)
        }

        button_add.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.next_action_add)
        }

        arguments?.let {
            val safeArgs = ProfileFragmentArgs.fromBundle(it)
            textView_num.text = "Number of photos: ${safeArgs.numOfPhotos}"
        }


    }

}
