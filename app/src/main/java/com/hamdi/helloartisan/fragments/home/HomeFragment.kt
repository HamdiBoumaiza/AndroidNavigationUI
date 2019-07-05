package com.hamdi.helloartisan.fragments.home


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.hamdi.helloartisan.R
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment(), RecyclerAdapter.ItemClickListener {

    override fun onItemClicked(text: String) {
        val nextAction = HomeFragmentDirections.nextActionItem()
        nextAction.params = text
        findNavController().navigate(nextAction)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()
    }


    private fun initRecycler() {
        recycler.layoutManager = LinearLayoutManager(activity)
        val adapter = RecyclerAdapter(getData(), this)
        recycler.adapter = adapter
    }

    private fun getData(): ArrayList<String> {
        val array: ArrayList<String> = ArrayList()
        for (i in 1..5) {
            array.add("hello : $i")
        }
        return array
    }

}
