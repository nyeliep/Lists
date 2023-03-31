fun main(args: Array<String>) {
    evenIndices()
    println(heightInMetres(listOf(1.75,7.54,7.5,1.54,8.67,9.15)))
    person()
    val person1 = PersonObject("Nyeliep", 23, 49)
    val person2 = PersonObject("Giel", 17, 56)
    val people = mutableListOf(person1, person2)

    val updatedPeopleList = addPeopleObject(people)
    println(updatedPeopleList)

    println(car())


}


// Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e. index 2,4,6 etc
fun evenIndices(){
val words = listOf("flower","vase","tablecloth","glassware","urn","milk","carton","mail","doormat","welcome")
    val filteredIndices =  words.filterIndexed { index, x -> index % 2 == 0 }
    println(filteredIndices)


}

//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height

fun heightInMetres(height: List<Double>): Pair<Double, Double> {
    val sortedHeight = height.sorted()
    val totalHeight = sortedHeight.sum()
    val avgHeight = totalHeight / sortedHeight.size
    return Pair(totalHeight, avgHeight)

}

// Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age

data class PersonObject(val name: String, val age: Int, val weight: Int)

fun person() {
    val person1 = PersonObject("Nyeliep", 23, 49)
    val person2 = PersonObject("Giel", 17, 56)

    val people = mutableListOf(person1, person2)
    people.sortByDescending { person -> person.age }
    println(people)
}


//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.


fun addPeopleObject(people: MutableList<PersonObject>): MutableList<PersonObject> {
    val newPerson1 = PersonObject("Job", 18, 58)
    val newPerson2 = PersonObject("Tek", 15, 50)

    people.addAll(listOf(newPerson1, newPerson2))
    return people
}


//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.


class Cars(var registration:String, var mileage: Double)
fun car():Double{
    val car1= Cars("xBre34",5.6)
    val car2= Cars("884ssd",3.5)
    val car3= Cars("d34eF",10.5)

    val cars= listOf(car1, car2, car3)

    val allcars = listOf(car1, car2, car3)

    val sumMileage = allcars.sumOf {mile->mile.mileage }

    val avgMileage = sumMileage/allcars.size
    return avgMileage
}









