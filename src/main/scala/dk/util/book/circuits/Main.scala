package dk.util.book.circuits

import MySimulation._

object Main {
  def main(args: Array[String]) {
    val input1, input2, sum, carry = new Wire

    probe("sum", sum)
    probe("carry", carry)

    halfAdder(input1, input2, sum, carry)

    input1 setSignal true
    run()

    input2 setSignal true
    run()
  }

}
