package com.corcoles.notesapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.corcoles.notesapp.R
import com.corcoles.notesapp.data.model.Note
import com.corcoles.notesapp.databinding.FragmentToDoBinding
import com.corcoles.notesapp.ui.adapter.NoteAdapter


class ToDoFragment : Fragment(R.layout.fragment_to_do) {
    private lateinit var binding: FragmentToDoBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentToDoBinding.bind(view)

        val note_list = listOf(
            Note(
                "tERCERA Nota",
                "es simplemente el texto de relleno de las imprentas y archivos de texto.asjkdk-qafbv-ivef-hbef-bd-´cb-OVFBOeboEVBOUbewuóvbóuEVBÓUWEBV"
            )
                , Note (
                    "Hola Mundo ",
            "es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años, sino que tambien ingresó como texto de relleno en documentos electrónicos, quedando esencialmente igual al original. Fue popularizado en los 60s con la creación de las hojas \"Letraset\", las cuales contenian pasajes de Lorem Ipsum, y más recientemente con software de autoedición, como por ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum."
        ),
        Note(
            " Segunda Nota",
            "es simplemente el texto de relleno de las imprentas y archivos de texto."
        ),
        Note(
            " tERCERA Nota",
            "es simplemente el texto de relleno de las imprentas y archivos de texto.asjkdk-qafbv-ivef-hbef-bd-´cb-OVFBOeboEVBOUbewuóvbóuEVBÓUWEBV"
        )
        )

        val recycler = binding.rvToDo
        // recycler.layoutManager = GridLayoutManager(requireContext(), 2)
        recycler.layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        val adapter = NoteAdapter(note_list)
        recycler.adapter = adapter
    }

}