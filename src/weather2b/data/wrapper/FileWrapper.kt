/*
  Projekt:      Wetterapp
  Firma:        ABB Technikerschule
  Autor:        P.Theiler

  Beschreibung: Hier werden die Wetterdaten für das Speichern in den Files in Listen gebuendelt und abgepackt.
 */

package weather2b.data.wrapper

import weather2b.data.WeatherData

class FileWrapper(
    var dataList: MutableList<WeatherData> = mutableListOf())
{

}