package com.brown.stackuser.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.brown.stackuser.databinding.UserDetailFragmentBinding

class UserDetailFragment : Fragment() {

    private lateinit var binding: UserDetailFragmentBinding
    private lateinit var viewModel: UserDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val args = UserDetailFragmentArgs.fromBundle(arguments!!)

        binding = UserDetailFragmentBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        val factory = UserDetailViewModel.Factory(args.user)
        viewModel = ViewModelProvider(this, factory).get(UserDetailViewModel::class.java)
        binding.viewModel = viewModel

        return binding.root
    }

}
