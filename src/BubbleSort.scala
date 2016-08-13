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
    val inputList = List(787777,3, 1,8878, 6, 8, 10,0,99999, 9, 5, 88, 33,989, 22, 11)
    val inputRange = 0 to inputList.length-1

    //BubbleSort.swapElem(inputList,0).foreach(println)

    BubbleSort.bubbleSort(inputList,0).foreach(println)


  }


}


