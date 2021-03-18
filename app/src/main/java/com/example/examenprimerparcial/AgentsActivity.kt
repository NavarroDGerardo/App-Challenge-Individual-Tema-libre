package com.example.examenprimerparcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_agents.*

class AgentsActivity : AppCompatActivity() {
    private lateinit var agentAdapter: AgentAdapter
    private lateinit var agents : ArrayList<Agent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agents)
        initRecycler()
    }

    fun initRecycler(){
        agents = ArrayList<Agent>()
        agentAdapter = AgentAdapter(agents)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = agentAdapter

        agents.add(Agent(R.drawable.jett, "jett", "Corea del sur", "Duelista", "Watch this!"))
        agents.add(Agent(R.drawable.raze, "Raze", "Brasil", "Duelista", "Watch this!"))
        agents.add(Agent(R.drawable.breach,"Breach", "Suecia", "Iniciador", "Let’s go!"))
        agents.add(Agent(R.drawable.omen,"Omen", "Desconocido", "Controlador", "Watch them run!"))
        agents.add(Agent(R.drawable.brimstone, "Brimstone", "Estados Unidos", "Controlador", "Open up the sky!"))
        agents.add(Agent(R.drawable.phoenix, "Phoenix", "Reino Unido", "Duelista", "Come on, let’s go!"))
        agents.add(Agent(R.drawable.sage, "Sage", "China", "Centinela", "Your duty is not over!"))
        agents.add(Agent(R.drawable.sova, "Sova", "Rusia", "Iniciador", "I am the hunter!"))
        agents.add(Agent(R.drawable.viper, "Viper", "Estados Unidos", "Controlador", "Don’t get in my way!"))
        agents.add(Agent(R.drawable.cypher, "Cypher", "Marruecos", "Centinela", "Where is everyone hiding?"))
        agents.add(Agent(R.drawable.reyna, "Reyna", "Mexico", "Duelista", "They will cower!"))
        agents.add(Agent(R.drawable.killjoy, "Killjoy", "Alemania", "Centinela", "You should run!"))
        agents.add(Agent(R.drawable.skye, "Skye", "Australia", "Iniciador", "Seek them out!"))
        agents.add(Agent(R.drawable.yoru, "Yoru", "Japon", "Duelista", "I’ll handle this"))
        agents.add(Agent(R.drawable.astra, "Astra", "Ghana", "Controlador", "World divided"))
    }

}