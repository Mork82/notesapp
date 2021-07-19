package com.corcoles.notesapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.corcoles.notesapp.core.BaseViewHolder
import com.corcoles.notesapp.data.model.Note
import com.corcoles.notesapp.databinding.NoteItemBinding

class NoteAdapter(private val note_list: List<Note>) : RecyclerView.Adapter<BaseViewHolder<*>>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        val itemBindings =
            NoteItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NoteViewHolder(itemBindings)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        when (holder) {
            is NoteViewHolder -> holder.bind(note_list[position])
        }
    }

    override fun getItemCount(): Int = note_list.size


    private inner class NoteViewHolder(val binding: NoteItemBinding) :
        BaseViewHolder<Note>(binding.root) {
        override fun bind(item: Note) {
            binding.tvTitle.text = item.title
            binding.tvContent.text = item.description
        }
    }
}

