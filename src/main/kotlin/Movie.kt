import java.util.Scanner;
import java.util.HashMap;
class Movie {
    val AvailableMovies = arrayOf("Baahubali", "HarryPotter", "SpiderMan", "RRR");
    var selectedMovie: String = ""
    var selectedTheatre: String = ""
    var selectedTime:String=""
    var sc = Scanner(System.`in`)
    constructor(){
        println("List of Available Movies Are:")
        for (i in 0..AvailableMovies.size - 1) {
            println(AvailableMovies[i])
        }
        println("Please enter the movie you want to watch:")
        selectedMovie = sc.nextLine()
    }

    fun getTicket(TheatreInfo:Theatre){
        println("-------------Your MovieTicket----------------")
        println("Movie Name:$selectedMovie \n Theatre Name:$selectedTheatre \n Movie Time:${TheatreInfo.Time} \nScreen Number:${TheatreInfo.screenNumber}\nTicketCost:${TheatreInfo.TicketCost}")
        println()
        println()
        println("Enjoy your time!")
    }

    fun displayTheatres(hashmap: HashMap<String, ArrayList<Theatre>>): Theatre {
        var TheatreList: ArrayList<Theatre>? = hashmap.get(selectedMovie)
        val numbersIterator = TheatreList!!.iterator()
        println("List of Theatre where you can watch $selectedMovie")
        while (numbersIterator.hasNext()) {
            var i: Theatre = numbersIterator!!.next()
            println("Theatre name: ${i!!.TheatreName}      Movie Time: ${i!!.Time}         Screen Number: ${i!!.screenNumber}  TicketCost: ${i!!.TicketCost}")
        }
        println("select the theatre")
        selectedTheatre = sc.nextLine()
        println("select the Time from Available Timings and Cost is also Diplayed")
        for(i in TheatreList.indices)
        {
            if(TheatreList.get(i).TheatreName.equals(selectedTheatre)){
                println("Movie Time:${TheatreList.get(i).Time}    Cost:${TheatreList.get(i).TicketCost}")
            }
        }
        selectedTime=sc.nextLine()
       for(i in TheatreList.indices)
       {
           if(TheatreList.get(i).TheatreName.equals(selectedTheatre) && TheatreList.get(i).Time.equals(selectedTime)){
               return TheatreList.get(i)
           }
       }
        return Theatre("N","1",0,0)
    }
}
fun main(){
    var MovieObject:Movie=Movie()
    var hashmap=HashMap<String,ArrayList<Theatre>>()
    var baahubaliT=ArrayList<Theatre>()
    baahubaliT.add(Theatre("AMB Cinemas","11am",1,120))
    baahubaliT.add(Theatre("Sandhya Theatre","2pm",2,180))
    baahubaliT.add(Theatre("Miraj Cinemas","9PM",1,210))
    baahubaliT.add(Theatre("Inox","11am",2,150))
    baahubaliT.add(Theatre("Asian GPR","6PM",3,200))
    hashmap.put("Baahubali",baahubaliT)

    var HarryPotterT=ArrayList<Theatre>()
    HarryPotterT.add(Theatre("AMB Cinemas","9pm",1,250))
    HarryPotterT.add(Theatre("Sandhya Theatre","6pm",2,200))
    HarryPotterT .add(Theatre("Miraj Cinemas","2PM",3,150))
    HarryPotterT.add(Theatre("Inox","11am",2,150))
    HarryPotterT.add(Theatre("Asian GPR","6PM",1,200))
    hashmap.put("Harry Potter",HarryPotterT)

    var spidermanT=ArrayList<Theatre>()
    spidermanT.add(Theatre("AMB Cinemas","9pm",1,250))
    spidermanT.add(Theatre("Sandhya Theatre","6pm",2,150))
    spidermanT.add(Theatre("Miraj Cinemas","2PM",3,150))
    spidermanT.add(Theatre("Inox","11am",2,150))
    spidermanT.add(Theatre("Asian GPR","6PM",1,200))
    hashmap.put("SpiderMan",spidermanT)

    var RRRT=ArrayList<Theatre>()
    RRRT.add(Theatre("AMB Cinemas","9pm",1,250))
    RRRT.add(Theatre("AMB Cinemas","6pm",2,200))
    RRRT.add(Theatre("Sandhya Theatre","6pm",2,150))
    RRRT.add(Theatre("Miraj Cinemas","2PM",3,150))
    RRRT.add(Theatre("Inox","11am",2,150))
    RRRT.add(Theatre("Asian GPR","6PM",1,200))
    hashmap.put("RRR",RRRT)
    var TheatreInfo=MovieObject.displayTheatres(hashmap)
    MovieObject.getTicket(TheatreInfo)

}