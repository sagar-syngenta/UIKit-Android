package com.syngenta.uikit.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.syngenta.uikit.MainActivity
import com.syngenta.uikit.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        button_buttons.setOnClickListener {
            (activity as MainActivity).showButtonsLayout()
        }

        button_fonts.setOnClickListener {
            (activity as MainActivity).showFontsLayout()
        }

        button_dialogs.setOnClickListener {
            (activity as MainActivity).showDialogsLayout()
        }

        button_colors.setOnClickListener {
            (activity as MainActivity).showColorsLayout()
        }
    }

}
