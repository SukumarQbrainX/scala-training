package training.date1507

object Main2 extends App {

  def matchAnimal(animal: Animal): Unit = animal match {
    case cat: Cat => println(cat)
    case dog: Dog => println(dog)
    case tiger: Tiger => println(tiger)
  }

  matchAnimal(new Dog)
}
