import javafx.scene.image.Image

data class Favorite(
    var location: Location = Location(),
    var name: String = "",
    var temperature: Double = 0.0,
    var iconFileName : String = "") {

    val icon: Image
        get(){
            return if (iconFileName.isEmpty()) {
                // Fallback, falls der Name leer ist (z.B. altes XML-Format)
                loadIcon("umbrella.png")
            } else {
                loadIcon(iconFileName)
            }
        }
}




