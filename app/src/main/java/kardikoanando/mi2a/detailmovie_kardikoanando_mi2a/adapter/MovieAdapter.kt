package kardikoanando.mi2a.detailmovie_kardikoanando_mi2a.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kardikoanando.mi2a.detailmovie_kardikoanando_mi2a.DetailMovie
import kardikoanando.mi2a.detailmovie_kardikoanando_mi2a.R
import kardikoanando.mi2a.detailmovie_kardikoanando_mi2a.RecycleMovie
import kardikoanando.mi2a.detailmovie_kardikoanando_mi2a.model.MovieModel

class MovieAdapter(
    val itemList: ArrayList<MovieModel>,
    val getActivity: RecycleMovie
) : RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView = itemView.findViewById(R.id.gambar)
        var itemJudul: TextView = itemView.findViewById(R.id.Judul)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_movie, parent, false)
        return MyViewHolder(nView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemImage.setImageResource(itemList[position].image)
        holder.itemJudul.text = itemList[position].judul

        holder.itemView.setOnClickListener {
            val intent = Intent(getActivity, DetailMovie::class.java)
            intent.putExtra("image", itemList[position].image)
            intent.putExtra("judul", itemList[position].judul)
            intent.putExtra("rating", itemList[position].rating)
            intent.putExtra("genre", itemList[position].genre)
            intent.putExtra("sinopsis", itemList[position].sinopsis)
            getActivity.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}
