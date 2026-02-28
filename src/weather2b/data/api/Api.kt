/*
  Projekt:      Wetterapp
  Firma:        ABB Technikerschule
  Autor:        P.Koch

  Beschreibung: API Interface zwischen API Handler und Manager
 */

package weather2b.data.api

import weather2b.data.sourcedata.Location
import weather2b.data.sourcedata.Weather

interface Api {
    fun fetchWeather(location: Location): Weather?
    fun getLocations(searchText: String): MutableList<Location>

}