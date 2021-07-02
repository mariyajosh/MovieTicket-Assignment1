import java.util.HashMap

class Repository {
    fun getMovies() = listOf("Baahubali", "HarryPotter", "SpiderMan", "RRR")

    fun getData(): HashMap<String, ArrayList<Theatre>> {
        var hashmap= HashMap<String,ArrayList<Theatre>>()
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
        return hashmap
    }
}