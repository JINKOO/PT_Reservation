package com.kjk.pt_reservation.presentation.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kjk.pt_reservation.databinding.ItemReservationBinding
import com.kjk.pt_reservation.domain.PersonalTrainingEntity

class ReserveAdapter : RecyclerView.Adapter<ReserveAdapter.ReserveViewHolder>() {

    private var reservationList = emptyList<PersonalTrainingEntity>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReserveViewHolder {
        return ReserveViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ReserveViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = reservationList.size


    private fun updateList(reservationList: List<PersonalTrainingEntity>) {
        this.reservationList = reservationList
        notifyDataSetChanged()
    }

    class ReserveViewHolder(
        binding: ItemReservationBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind() {

        }

        companion object {
            fun from(parent: ViewGroup): ReserveViewHolder {
                val inflater = LayoutInflater.from(parent.context)
                val binding = ItemReservationBinding.inflate(
                    inflater,
                    parent,
                    false
                )
                return ReserveViewHolder(binding)
            }
        }
    }
}