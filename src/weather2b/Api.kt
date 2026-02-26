package weather2b

/*
  Projekt:      Wetterapp
  Firma:        ABB Technikerschule
  Autor:        P.Koch

  Beschreibung: API Interface zwischen API Handler und weather2b.Manager
 */

interface Api {
    fun fetchWeather(location: Location): Weather?
    fun getLocations(searchText: String): MutableList<Location>

}