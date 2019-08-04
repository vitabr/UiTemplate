package com.vito.uitemplate.view.main.fragments.audio_settings

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.vito.uitemplate.R

class AudioSettingsFragment : Fragment() {

    companion object {
        fun newInstance() = AudioSettingsFragment()
    }

    private lateinit var viewModel: AudioSettingsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.audio_settings_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AudioSettingsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
