package hard

open class LinkedList(value: Int) {
    var value = value
    var next: LinkedList? = null
}

fun removeDuplicatesFromLinkedList(linkedList: LinkedList): LinkedList {
    var temp: LinkedList? = linkedList
    while(temp!=null){
        if(temp.value==temp.next?.value){
            temp.next = temp.next?.next
        }else{
            temp = temp.next
        }
    }
    // Write your code here.
    return linkedList
}
