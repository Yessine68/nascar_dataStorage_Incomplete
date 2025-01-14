package tn.esprit.nascar.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import tn.esprit.nascar.adapters.EventsAdapter
import tn.esprit.nascar.databinding.FragmentProfileBinding
import tn.esprit.nascar.utils.AppDatabase

class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentProfileBinding.inflate(layoutInflater)

        //TODO 14 Get all events from database and create the BookmarksAdapter and assign it to the recyclerView rvBookmarks
        binding.rvBookmarks.adapter = EventsAdapter(AppDatabase.getInstance(requireContext()).eventDao().getAllEvent())
        binding.rvBookmarks.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        return binding.root
    }

}
