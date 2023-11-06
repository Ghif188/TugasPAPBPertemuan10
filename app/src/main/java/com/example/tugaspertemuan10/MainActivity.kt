package com.example.tugaspertemuan10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.example.tugaspertemuan10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val IntentToDetail = Intent(this@MainActivity, DetailActivity::class.java)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val extras = Bundle()
        val adaptorDisaster = DisasterAdaptor(generateDummy()) {
                disaster -> extras.putString("img", disaster.imgDisaster)
            extras.putString("judul", disaster.judulDisaster)
            extras.putString("lokasi", disaster.lokasiDisaster)
            extras.putString("keterangan", disaster.ketDisaster)
            IntentToDetail.putExtras(extras)
            startActivity(IntentToDetail)
        }
        with(binding){
            rvDisaster.apply {
                adapter = adaptorDisaster
                layoutManager = GridLayoutManager(this@MainActivity, 1)
            }
        }
    }
    fun generateDummy(): List<Disaster>{
        return listOf(
            Disaster(
                imgDisaster = "https://images.unsplash.com/photo-1698778394811-b9cadba63295?auto=format&fit=crop&q=80&w=1887&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                judulDisaster = "Padang Rumput",
                lokasiDisaster = "Surabaya",
                ketDisaster = "Tempat yang sangat memanjakan mata yang jauh dihati"
            ),
            Disaster(
                imgDisaster = "https://images.unsplash.com/photo-1695298906168-11d1d9620c2d?auto=format&fit=crop&q=80&w=1887&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                judulDisaster = "Pantai Rumput",
                lokasiDisaster = "Palembang",
                ketDisaster = "Tempat yang sangat memanjakan mata yang jauh dihati"
            ),
            Disaster(
                imgDisaster = "https://res.klook.com/images/fl_lossy.progressive,q_65/c_fill,w_1200,h_630/w_80,x_15,y_15,g_south_west,l_Klook_water_br_trans_yhcmh3/activities/y2w0p58gq4eqlwczpsmd/Wisata%20Gurun%20Bintan%20dan%20Telaga%20Biru.jpg",
                judulDisaster = "Bintan",
                lokasiDisaster = "Kep. Riau",
                ketDisaster = "Bintan merupakan destinasi andalan di Kepulauan Riau. Destinasi ini terkenal akan deretan resor mewahnya, lapangan golf kelas dunia, dan tak ketinggalan, keindahan pesisir pantainya yang menakjubkan. Nah, bagi  Sobat Pesona yang ingin merasakan sensasi petualangan sekaligus hiburan, Bintan adalah opsi yang tepat untuk mendapatkan liburan yang menyenangkan dan mengesankan.\n"
            ),
            Disaster(
                imgDisaster = "https://www.dejogjaadventure.com/wp-content/uploads/2018/01/goa-jomblang.jpg",
                judulDisaster = "Goa Jomblang",
                lokasiDisaster = "Yogyakarta",
                ketDisaster = "Goa Jomblang termasuk salah satu wisata ikonik di Jawa Tengah. Di wisata ini Kamu akan diajak turun ke perut bumi sedalam 80 meter. Turunnya pun terbilang menantang, pasalnya bukan turun dengan tangga melainkan teknik tali tunggal berbekal keamanan lengkap."
            ),
            Disaster(
                imgDisaster = "https://akcdn.detik.net.id/community/media/visual/2019/06/12/afaef7fb-f880-4458-a617-d4c49f060830_169.jpeg?w=620",
                judulDisaster = "Labuan Bajo",
                lokasiDisaster = "NTT",
                ketDisaster = "Labuan Bajo dengan Taman Nasional Komodonya telah mendunia sejak lama. Pulau Labuan Bajo sendiri memiliki tempat wisata menarik seperti Goa Batu Cermin, Air Terjun Cunca Wulang, Wae Rebo, Sawah Lingko, Gua Rangko, Pulau Padar, Pink Beach, Pulau Komodo."
            ),
            Disaster(
                imgDisaster = "https://api2.kemenparekraf.go.id/storage/app/resources/PARIWISATA_STORYNOMICS_TOURISM_shutterstock_385096972_franshendrik_Tambunan_d03d3440db.jpg",
                judulDisaster = "Danau Toba",
                lokasiDisaster = "Sumatera Utara",
                ketDisaster = "Danau Toba merupakan danau terbesar di Asia Tenggara dan salah satu danau terdalam di dunia. Danau kawah besar ini memiliki sebuah pulau hampir seukuran Singapura di tengahnya yaitu pulau Samosir. Pulau Samosir menjadi destinasi untuk belajar sejarah, seperti kuburan batu dan desa tradisional."
            ),
            Disaster(
                imgDisaster = "https://cdn.idntimes.com/content-images/community/2022/07/zyro-image-3-4c4e0935346233c8fec14261a45ff371-e2f6ef5c3686feda3025baa955b72eb8_600x400.png",
                judulDisaster = "Taman Nasional Gunung Leuser",
                lokasiDisaster = "Sumatera Utara",
                ketDisaster = "Taman nasional ini mengambil nama dari Gunung Leuser yang menjulang tinggi dengan ketinggian 3404 meter di atas permukaan laut di Aceh. Taman nasional ini meliputi ekosistem asli dari pantai sampai pegunungan tinggi yang diliputi oleh hutan lebat khas hujan tropis. Dikelola dengan sistem zonasi yang dimanfaatkan untuk tujuan penelitian, ilmu pengetahuan, pendidikan, menunjang budidaya, pariwisata, dan rekreasi."
            ),
        )
    }
}