import scala.concurrent.duration.Duration

package object model {
  case class Film (id: Option[Long], title: String, duration: Duration, directorId: Long, rating: Double)
  case class FilmToGenre (id: Option[Long], filmId: Long, genreId: Long)
  case class FilmToCast (id: Option[Long], filmId: Long, genreId: Long)
  case class FilmToCountry (id: Option[Long], filmId: Long, countryId: Long)

  case class Genre (id: Option[Long], title: String, description: Option[String])
  case class Staff (id: Option[Long], name: String, rate: Double, age: Int)
  case class Country (id: Option[Long], title: String)
}
