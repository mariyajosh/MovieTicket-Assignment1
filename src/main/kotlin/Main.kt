fun main() {
    val movie = Movie()
    val hashmap = Repository().getData()
    val theatre = movie.displayTheatres(hashmap)
    movie.printTicket(theatre)
}