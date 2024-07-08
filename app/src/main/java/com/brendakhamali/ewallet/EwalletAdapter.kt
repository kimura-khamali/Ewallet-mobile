package com.brendakhamali.ewallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EwalletAdapter(private val ewalletList: List<OnWallet>) :
    RecyclerView.Adapter<EwalletViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EwalletViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.ewallet_item, parent, false)
        return EwalletViewHolder(view)
    }

    override fun onBindViewHolder(holder: EwalletViewHolder, position: Int) {
        val ewalletItem = ewalletList[position]
        holder.apply {
            moneyInLabel.text = ewalletItem.moneyInText
            moneyInAmount.text = ewalletItem.moneyInAmount
            moneyOutLabel.text = ewalletItem.moneyOutText
            moneyOutAmount.text = ewalletItem.moneyOutAmount
            balanceLabel.text = ewalletItem.balanceText
            balanceAmount.text = ewalletItem.balanceAmount
            transactionsLabel.text = ewalletItem.transactionText
            transactionsAmount.text = ewalletItem.transactionAmount
            salaryLabel.text = ewalletItem.salaryOraText
            salaryAmount.text = ewalletItem.salaryAmount
//            salaryDate.text = ewalletItem.s
        }
    }

    override fun getItemCount(): Int = ewalletList.size
}

class EwalletViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val moneyInIcon: ImageView = itemView.findViewById(R.id.moneyInIcon)
    val moneyInLabel: TextView = itemView.findViewById(R.id.moneyInLabel)
    val moneyInAmount: TextView = itemView.findViewById(R.id.moneyInAmount)

    val moneyOutIcon: ImageView = itemView.findViewById(R.id.moneyOutIcon)
    val moneyOutLabel: TextView = itemView.findViewById(R.id.moneyOutLabel)
    val moneyOutAmount: TextView = itemView.findViewById(R.id.moneyOutAmount)

    val balanceIcon: ImageView = itemView.findViewById(R.id.balanceIcon)
    val balanceLabel: TextView = itemView.findViewById(R.id.balanceLabel)
    val balanceAmount: TextView = itemView.findViewById(R.id.balanceAmount)

    val transactionsIcon: ImageView = itemView.findViewById(R.id.transactionsIcon)
    val transactionsLabel: TextView = itemView.findViewById(R.id.transactionsLabel)
    val transactionsAmount: TextView = itemView.findViewById(R.id.transactionsAmount)

    val salaryIcon: ImageView = itemView.findViewById(R.id.salaryIcon)
    val salaryLabel: TextView = itemView.findViewById(R.id.salaryLabel)
    val salaryAmount: TextView = itemView.findViewById(R.id.salaryAmount)
//    val salaryDate: TextView = itemView.findViewById(R.id.salaryDate)
}