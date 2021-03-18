package com.example.examenprimerparcial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_agent_display.*
import kotlinx.android.synthetic.main.renglon_layout.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 * Use the [MovieFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AgentDisplayFragment : Fragment() {

    private val args by navArgs<AgentDisplayFragmentArgs>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_agent_display, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        photo.setImageResource(args.agent.foto)
        name.text = args.agent.nombre
        nationality.text = args.agent.nacionalidad
        type.text = args.agent.tipoAgente

        Toast.makeText(getContext(), args.agent.fraseAgente, Toast.LENGTH_SHORT).show()
    }
}