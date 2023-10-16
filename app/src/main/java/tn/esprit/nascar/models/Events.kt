package tn.esprit.nascar.models

//TODO 8 Change this class to a data class with Entity annotation and the val id to PrimaryKey with auto generation
class Events(

    val id:Int,

    val imageRes:Int,

    val title: String,

    val description: String,
)