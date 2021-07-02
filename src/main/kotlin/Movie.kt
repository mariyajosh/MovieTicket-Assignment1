import java.util.*
import kotlin.collections.ArrayList

class Movie {
    private val availableMovies = Repository().getMovies()
    private var selectedSeatingType= ""
    var selectedMovie: String = ""
    var selectedTheatre: String = ""
    var selectedTime:String=""
    var sc = Scanner(System.`in`)

    init {
        println("List of available movies are:")
        availableMovies.forEach { println(it) }
        println("Please enter the movie you want to watch:")
        selectedMovie = sc.nextLine()
    }

    fun printTicket(theatreInfo: Theatre){
        println("-------------Your MovieTicket----------------")
        println("""
            Movie Name:             $selectedMovie             
            Theatre Name:           $selectedTheatre             
            Movie Time:             ${theatreInfo.time}             
            Screen Number:          ${theatreInfo.screenNumber}
            Seating Type:           $selectedSeatingType
        """.trimIndent())
        println("Ticket cost: ${theatreInfo.ticketCost * SeatType.fromString(selectedSeatingType).costMultiplier} \n \n")
        println("Enjoy your time!")
    }

    fun displayTheatres(movieMap: HashMap<String, ArrayList<Theatre>>): Theatre {
        val theatreList: ArrayList<Theatre> = movieMap[selectedMovie]!!
        println("List of theatre where you can watch $selectedMovie")
        theatreList.forEach {
            println("Theatre name: ${it.theatreName}      Movie Time: ${it.time}         Screen Number: ${it.screenNumber}  ticketCost: ${it.ticketCost} " )
        }
        println("Select the theatre")
        selectedTheatre = sc.nextLine()
        println("Select the time from available timings and cost is also displayed \n Note this ticket cost is for normal type of seating")
        theatreList.filter { it.theatreName == selectedTheatre }.forEach {
            println("Movie Time:${it.time}    Cost:${it.ticketCost}")
        }
        selectedTime=sc.nextLine()
        println("select the seating type from below type of seating:")
        SeatType.values().forEach { println(it) }
        selectedSeatingType=sc.nextLine()
        return theatreList.first{ it.theatreName == selectedTheatre && it.time == selectedTime }
    }
}