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
        val onWallet1 = OnWallet("ebjhbj", "hhjn", "njn j", "jjknl", " fsree", "fevvrr", "knnkjn","unni","jfgkjb","30000","03-04-2040", "ssd", "100.000")
        val onWallet2 = OnWallet("hvhgvjb", "jkdnkj", "knkj", "dc", "", "dddsf", "dsds","","cdd ","30000","03-04-2040", "dce", "100.000")
        val onWallet3 = OnWallet("dbskj", "nkk", "n n", "dd", "dc", "cdc", "cwq","cdcdc","ce","30000","03-04-2040", "c", "100.000")
        val onWallet4 = OnWallet("dsakj", "kmj", "fgfs", "fdd", "dc", "dcdcd", "dds","ddc","xcc","30000","03-04-2040", "fcf", "100.000")
        val onWallet5 = OnWallet(" k k", "k k", "ddf", "df", "df", "dc", "ddd","","dd","30000","03-04-2040", "f", "100.000")
        val onWallet6 = OnWallet("k", " kk", "dffd", "ddd", "ccd", "dds", "df","","dd","30000","03-04-2040", "fd", "100.000")


        val ewalletList= listOf(onWallet1,onWallet2,onWallet3,onWallet4,onWallet5,onWallet6)

        val ewalletAdapter = EwalletAdapter(ewalletList)
        binding.rvEwallet.adapter=ewalletAdapter
    }
}


