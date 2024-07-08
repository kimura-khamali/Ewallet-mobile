package com.brendakhamali.ewallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.brendakhamali.ewallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvEwallet.layoutManager= LinearLayoutManager(this)

        createFirstEwallet()

    }
    fun createFirstEwallet(){
        val onWallet1 = OnWallet("Salary", "24000", "23-04-2023")
        val onWallet2 = OnWallet("Salary", "40000", "12-06-2023")
        val onWallet3 = OnWallet("Salary", "19000", "12-3-2024")
        val onWallet4 = OnWallet("Salary", "12000", "4-1-2022")
        val onWallet5 = OnWallet("Salary", "13000", "5-12-2023")
        val onWallet6 = OnWallet("Salary", "19000", "6-12-2023")


        val ewalletList= listOf(onWallet1,onWallet2,onWallet3,onWallet4,onWallet5,onWallet6)

        val ewalletAdapter = EwalletAdapter(ewalletList)
        binding.rvEwallet.adapter=ewalletAdapter
    }
}


