package kardikoanando.mi2a.detailmovie_kardikoanando_mi2a.model

import kardikoanando.mi2a.detailmovie_kardikoanando_mi2a.R
import android.content.Context

class MovieModel (
    val image : Int,
    val judul : String,
    val rating : String,
    val genre : String,
    val sinopsis : String
)

//kita mock data untuk array
object Mocklist{
    fun getModel(context: Context) : List<MovieModel> {
        val itemModel1 = MovieModel(
            R.drawable.inside_out_2,
            "Inside Out 2",
            "7.7",
            "Animasi",
            context.getString(R.string.inside_out_2)
        )
        val itemModel2 = MovieModel(
            R.drawable.twisters2024,
            "twister",
            "6.6",
            "Sci-Fi",
            context.getString(R.string.twister2024)
        )
        val itemModel3 = MovieModel(
            R.drawable.aman,
            "A Man Called Otto",
            "7.5",
            "Comedy, Drama",
            context.getString(R.string.amancalmeotto)
        )
        val itemModel4 = MovieModel(
            R.drawable.agak,
            "Agak Laen",
            "7.6",
            "Comedy, Drama, Family",
            context.getString(R.string.agaklaen)
        )
        val itemModel5 = MovieModel(
            R.drawable.avatar,
            "Avatar",
            "7.9",
            "Sci-Fi, Action, Adventure, Fantasy",
            context.getString(R.string.avatar)
        )
        val itemModel6 = MovieModel(
            R.drawable.dragon,
            "Dragonkeeper",
            "5,6",
            "Adventure, Animation, Fantasy",
            context.getString(R.string.dragonKeeper)
        )
        val itemModel7 = MovieModel(
            R.drawable.dune,
            "Dune Part 2",
            "8.5",
            "Action, Adventure, Epic, Drama, Sci-Fi",
            context.getString(R.string.dunePartTwo)
        )
        val itemModel8 = MovieModel(
            R.drawable.if2,
            "If",
            "6.5",
            "Animation, Comedy, Family, Drama",
            context.getString(R.string.lift)
        )
        val itemModel9 = MovieModel(
            R.drawable.kang,
            "Kang Mak",
            "6.9",
            "Comedy, Horror, Romance, War",
            context.getString(R.string.kangMak)
        )
        val itemModel10 = MovieModel(
            R.drawable.kingdom,
            "Kingdom of the Planet of Apes",
            "6.9",
            "Action, Sci-Fi, Drama, Adventure, Thriller",
            context.getString(R.string.kingdomofthePlanetoftheApes)
        )
        val itemModel11 = MovieModel(
            R.drawable.lift,
            "Lift",
            "8.5",
            "Sci-Fi",
            context.getString(R.string.lift)
        )
        val itemModel12 = MovieModel(
            R.drawable.matrix,
            "Matrix",
            "8.5",
            "Laga",
            context.getString(R.string.matrix)
        )
        val itemModel13 = MovieModel(
            R.drawable.roundup,
            "the Roundup",
            "8.9",
            "Sci-Fi, Action, CyberPunk",
            context.getString(R.string.theRoundup)
        )


        val itemList: ArrayList<MovieModel> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)
        itemList.add(itemModel7)
        itemList.add(itemModel8)
        itemList.add(itemModel9)
        itemList.add(itemModel10)
        itemList.add(itemModel11)
        itemList.add(itemModel12)
        itemList.add(itemModel13)

        return itemList
    }
}