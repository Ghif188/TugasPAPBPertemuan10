package com.example.tugaspertemuan10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugaspertemuan10.databinding.ActivityDetailBinding
import com.squareup.picasso.Picasso

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val imgTxt = intent.extras?.getString("img")
        val judulTxt = intent.extras?.getString("judul")
        val lokasiTxt = intent.extras?.getString("lokasi")
        val keteranganTxt = intent.extras?.getString("keterangan")
        with(binding){
            Picasso.get().load(imgTxt).into(img)
            judul.text = judulTxt
            lokasi.text = lokasiTxt
            keterangan.text = keteranganTxt
        }
    }
}