package dk.util.book

import actors.Actor

object acting {

  object SillyActor extends Actor {
    def act() {
      for (i <- 1 to 5) {
        println("I'm acting!")
        Thread.sleep(1000)
      }
    }
  }

  object SeriousActor extends Actor {
    def act() {
      for (i <- 1 to 5) {
        println("To be or not to be")
        Thread.sleep(1000)
      }
    }
  }
}

