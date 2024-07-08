package com.brendakhamali.ewallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Assuming there is a data class named `EwalletItem`
// data class EwalletItem(...)

class EwalletAdapter(val ewalletList: List<OnWallet>) :
    RecyclerView.Adapter<EwalletViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EwalletViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.ewallet_item, parent, false)
        return EwalletViewHolder(view)
    }

    override fun onBindViewHolder(holder: EwalletViewHolder, position: Int) {
        val ewalletItem = ewalletList[position]
        // Assuming EwalletItem has properties corresponding to the TextView fields
        holder.moneyintext.text = ewalletItem.moneyInText
        holder.moneyinamount.text = ewalletItem.moneyInAmount
        holder.moneyouttxt.text = ewalletItem.moneyOutText
        holder.moneyoutamount.text = ewalletItem.moneyOutAmount
        holder.balancetxt.text = ewalletItem.balanceText
        holder.balanceamount.text = ewalletItem.balanceAmount
        holder.transactiontxt.text = ewalletItem.transactionText
        holder.transactionamount.text = ewalletItem.transactionAmount
        holder.dollartxt.text = ewalletItem.dollarText
        holder.dollaramount.text = ewalletItem.dollarAmount
        holder.dollardate.text = ewalletItem.dollarDate
        holder.salaryoratxt.text = ewalletItem.salaryOraText
        holder.salaryamount.text = ewalletItem.salaryAmount
    }

    override fun getItemCount(): Int {
        return ewalletList.size
    }
}

class EwalletViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val moneyintext: TextView = itemView.findViewById(R.id.moneyintext)
    val moneyinamount: TextView = itemView.findViewById(R.id.moneyinamount)
    val moneyouttxt: TextView = itemView.findViewById(R.id.moneyouttxt)
    val moneyoutamount: TextView = itemView.findViewById(R.id.moneyoutamount)
    val balancetxt: TextView = itemView.findViewById(R.id.balancetxt)
    val balanceamount: TextView = itemView.findViewById(R.id.balanceamount)
    val transactiontxt: TextView = itemView.findViewById(R.id.transactiontxt)
    val transactionamount: TextView = itemView.findViewById(R.id.transactionamount)
    val dollartxt: TextView = itemView.findViewById(R.id.dollartxt)
    val dollaramount: TextView = itemView.findViewById(R.id.dollaramount)
    val dollardate: TextView = itemView.findViewById(R.id.dollardate)
    val salaryoratxt: TextView = itemView.findViewById(R.id.salaryoratxt)
    val salaryamount: TextView = itemView.findViewById(R.id.salaryamount)
}

