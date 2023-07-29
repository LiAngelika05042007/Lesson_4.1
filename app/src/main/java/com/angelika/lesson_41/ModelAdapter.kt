package com.angelika.lesson_41

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.angelika.lesson_41.databinding.ItemModelBinding

class ModelAdapter(private val onItemClick: (model: Model) -> Unit) :
    RecyclerView.Adapter<ModelAdapter.ModelViewHolder>() {

    private var model = emptyList<Model>()

    fun setData(model: List<Model>) {
        this.model = model
    }

    inner class ModelViewHolder(private val binding: ItemModelBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            itemView.setOnClickListener {
                onItemClick(model[adapterPosition])
            }
        }

        fun onBind(model: Model) = with(binding) {
            modelPicture.setImageResource(model.picture)
            tvName.text = model.name
            model.plot
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder {
        val item = ItemModelBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ModelViewHolder(item)
    }

    override fun onBindViewHolder(holder: ModelViewHolder, position: Int) {
        holder.onBind(model[position])
    }

    override fun getItemCount(): Int {
        return model.size
    }
}