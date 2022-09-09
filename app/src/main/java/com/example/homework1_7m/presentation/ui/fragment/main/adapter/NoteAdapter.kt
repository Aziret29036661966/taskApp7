package com.example.homework1_7m.presentation.ui.fragment.main.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.domain.domain.model.Note
import com.example.homework1_7m.databinding.ItemNotesBinding

class NoteAdapter(private val click:OnClick): RecyclerView.Adapter<NoteAdapter.ViewHolder>(){

    private val list: MutableList<Note> = ArrayList()

    @SuppressLint("NotifyDataSetChanged")
    fun setList(lst: List<Note>){
        this.list.clear()
        this.list.addAll(lst)
        notifyDataSetChanged()
    }


    @SuppressLint("NotifyDataSetChanged")
    fun getItem(pos: Int): Note{
        return list[pos]
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemNotesBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.setOnLongClickListener {
            click.deleteP(position)
            return@setOnLongClickListener false
        }
            holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size


    inner class ViewHolder(private val binding: ItemNotesBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(note: Note){
            binding.txtTitle.text = note.title
            binding.txtDesc.text = note.description
            binding.txtDate.text = note.creationDate
        }
    }

    interface OnClick{
        fun deleteP(pos: Int)
    }
}