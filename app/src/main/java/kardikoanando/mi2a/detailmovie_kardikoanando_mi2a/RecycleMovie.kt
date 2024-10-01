package kardikoanando.mi2a.detailmovie_kardikoanando_mi2a

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kardikoanando.mi2a.detailmovie_kardikoanando_mi2a.adapter.MovieAdapter
import kardikoanando.mi2a.detailmovie_kardikoanando_mi2a.adapter.TrendingAdapter
import kardikoanando.mi2a.detailmovie_kardikoanando_mi2a.model.Mocklist
import kardikoanando.mi2a.detailmovie_kardikoanando_mi2a.model.MovieModel

class RecycleMovie : AppCompatActivity() {

    private lateinit var rv_listMovie: RecyclerView
    private lateinit var rv_trendingNow: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_movie)

        rv_listMovie = findViewById(R.id.rv_listMovie)
        rv_trendingNow = findViewById(R.id.rv_trendingNow)

        // Mengatur layout manager untuk masing-masing RecyclerView
        rv_listMovie.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false)
        rv_trendingNow.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.HORIZONTAL, false)

        // Menggunakan adapter yang berbeda untuk masing-masing RecyclerView
        val movieAdapter = MovieAdapter(Mocklist.getModel(this) as ArrayList<MovieModel>, this)
        val trendingAdapter = TrendingAdapter(Mocklist.getModel(this) as ArrayList<MovieModel>)

        rv_listMovie.adapter = movieAdapter
        rv_trendingNow.adapter = trendingAdapter
    }
}
