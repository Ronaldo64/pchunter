package br.com.setupbuilder.model

class RAM(name: String, id: String, price: Float, releaseYear:String, brand:String, details:String, image:String,
          type: String, totalSize:String, speed:String, CASLatency:String, sticksNumber:String):
    Part(name, id, price, releaseYear, brand, details, image){

    var type: String = type
        private set
    var totalSize: String = totalSize
        private set
    var speed: String = speed
        private set
    var CASLatency: String = CASLatency
        private set
    var sticksNumber: String = sticksNumber
        private set
}