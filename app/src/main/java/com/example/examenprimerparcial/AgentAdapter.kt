package com.example.examenprimerparcial

import android.os.Debug
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import java.security.AccessController.getContext

class AgentAdapter(private val agents : List<Agent>) : RecyclerView.Adapter<AgentAdapter.AgentViewHolder>() {
    inner class AgentViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var foto = renglon.findViewById<ImageView>(R.id.foto)
        var nombre = renglon.findViewById<TextView>(R.id.nombre)
        var nacionalidad = renglon.findViewById<TextView>(R.id.nacionalidad)
        var tipoAgente = renglon.findViewById<TextView>(R.id.tipoAgent)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AgentViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_layout = inflater.inflate(R.layout.renglon_layout, parent, false)
        return AgentViewHolder(renglon_layout)
    }

    override fun onBindViewHolder(holder: AgentViewHolder, position: Int) {
        val agent = agents[position]
        holder.foto.setImageResource(agent.foto)
        holder.nombre.text = agent.nombre
        holder.nacionalidad.text = agent.nacionalidad
        holder.tipoAgente.text = agent.tipoAgente
        holder.itemView.setOnClickListener {
            val action = AgentsFragmentDirections.actionAgentsFragmentToAgentDisplayFragment2(agent)
            holder.itemView.findNavController().navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return agents.size
    }
}