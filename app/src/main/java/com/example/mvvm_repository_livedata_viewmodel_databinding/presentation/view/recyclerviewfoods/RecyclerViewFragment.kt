package com.example.mvvm_repository_livedata_viewmodel_databinding.presentation.view.recyclerviewfoods

import android.app.Application
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.mvvm_repository_livedata_viewmodel_databinding.data.viewmodels.RecyclerViewViewModel
import com.example.mvvm_repository_livedata_viewmodel_databinding.databinding.FragmentRecyclerViewBinding


class  RecyclerViewFragment : Fragment() {

    private lateinit var binding: FragmentRecyclerViewBinding
    private val viewModel by lazy { RecyclerViewViewModel(application = Application()) }
    val _adapter by lazy { RecyclerViewAdapter(viewModel) }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentRecyclerViewBinding.inflate(inflater, container, false).run {

        binding = this
        adapter = _adapter
        root
    }

/*    val getAdapter: RecyclerViewAdapter
        get() = run {
            val viewModel = RecyclerViewViewModel(application = Application())
            RecyclerViewAdapter(viewModel)
        }*/

}