/*
  Projekt:      Wetterapp
  Firma:        ABB Technikerschule
  Autor:        P.Koch

  Beschreibung: Hier werden die stuendlichen Wetterdaten für das Speichern in den Files in Listen gebuendelt und abgepackt.
 */

package weather2b.data.wrapper

data class HourlyWrapper(
    var wrapperTemperature: Double = 0.0,
    var wrapperWeatherCode: Int = 0)