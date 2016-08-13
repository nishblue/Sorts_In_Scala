import scala.util.Random

/**
  * Created by nishitjain on 8/13/16.
  */
object BubbleSort {

  def swapElem(iA: List[Int],currIndex : Int): List[Int] ={

    if(iA.length == currIndex +1){
      iA
    }
    else if(iA(currIndex) < iA(currIndex+1)) {
      val newA : List[Int] = iA.updated(currIndex, iA(currIndex + 1))
      swapElem(newA.updated(currIndex+1,iA(currIndex)),currIndex+1)
    }
    else{
      swapElem(iA, currIndex+1)
    }

  }

  def bubbleSort(iA: List[Int],currIndex : Int): List[Int] = {
    if(iA.length == currIndex +1) {
      iA
    }else{
      bubbleSort(swapElem(iA,0),currIndex+1)
    }

  }


  def main(args: Array[String]) {
    var inputList: List[Int] = List.empty

    val inputRange = 1 until 1000
    val r = Random

    inputRange.foreach{ x =>
      inputList=r.nextInt(10000) :: inputList
    }


    BubbleSort.bubbleSort(inputList,0).foreach(println)


  }


}


