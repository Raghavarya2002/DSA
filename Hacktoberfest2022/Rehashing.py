# Python3 program to implement Rehashing
"""
Author: Gurneet Singh
Program Title: Rehashing
Github Link :  https://github.com/SinghGurneet21
"""
class Map:
 
    class MapNode:
        def __init__(self,key,value):
            self.key=key
            self.value=value
            self.next=None
 
    # The bucket array where
    # the nodes containing K-V pairs are stored
    buckets=list()
 
    # No. of pairs stored - n
    size=0
 
    # Size of the bucketArray - b
    numBuckets=0
 
    # Default loadFactor
    DEFAULT_LOAD_FACTOR = 0.75
 
    def __init__(self):
        Map.numBuckets = 5
 
        Map.buckets = [None]*Map.numBuckets
 
        print("HashMap created")
        print("Number of pairs in the Map: " + str(Map.size))
        print("Size of Map: " + str(Map.numBuckets))
        print("Default Load Factor : " + str(Map.DEFAULT_LOAD_FACTOR) + "\n")
 
    def getBucketInd(self,key):
 
        # Using the inbuilt function from the object class
        hashCode = hash(key)
 
        # array index = hashCode%numBuckets
        return (hashCode % Map.numBuckets)
 
    def insert(self,key,value):
 
        # Getting the index at which it needs to be inserted
        bucketInd = self.getBucketInd(key)
 
        # The first node at that index
        head = Map.buckets[bucketInd]
 
        # First, loop through all the nodes present at that index
        # to check if the key already exists
        while (head != None):
 
            # If already present the value is updated
            if (head.key==key):
                head.value = value
                return
            head = head.next
 
        # new node with the K and V
        newElementNode = Map.MapNode(key, value)
 
        # The head node at the index
        head = Map.buckets[bucketInd]
 
        # the new node is inserted
        # by making it the head
        # and it's next is the previous head
        newElementNode.next = head
 
        Map.buckets[bucketInd]= newElementNode
 
        print("Pair(\" {} \", \" {} \") inserted successfully.".format(key,value))
 
        # Incrementing size
        # as new K-V pair is added to the map
        Map.size+=1
 
        # Load factor calculated
        loadFactor = (1* Map.size) / Map.numBuckets
 
        print("Current Load factor = " + str(loadFactor))
 
        # If the load factor is > 0.75, rehashing is done
        if (loadFactor > Map.DEFAULT_LOAD_FACTOR):
            print(str(loadFactor) + " is greater than " + str(Map.DEFAULT_LOAD_FACTOR))
            print("Therefore Rehashing will be done.")
 
            # Rehash
            self.rehash()
 
            print("New Size of Map: " + str(Map.numBuckets))
 
        print("Number of pairs in the Map: " + str(Map.size))
        print("Size of Map: " + str(Map.numBuckets))
 
    def rehash(self):
 
        print("\n***Rehashing Started***\n")
 
        # The present bucket list is made temp
        temp = Map.buckets
 
        # New bucketList of double the old size is created
        buckets =(2 * Map.numBuckets)
 
        for i in range(2 * Map.numBuckets):
            # Initialised to null
            Map.buckets.append(None)
 
        # Now size is made zero
        # and we loop through all the nodes in the original bucket list(temp)
        # and insert it into the new list
        Map.size = 0
        Map.numBuckets *= 2
 
        for i in range(len(temp)):
 
            # head of the chain at that index
            head = temp[i]
 
            while (head != None):
                key = head.key
                val = head.value
 
                # calling the insert function for each node in temp
                # as the new list is now the bucketArray
                self.insert(key, val)
                head = head.next
 
        print("\n***Rehashing Ended***")
 
    def printMap(self):
 
        # The present bucket list is made temp
        temp = Map.buckets
 
        print("Current HashMap:")
        # loop through all the nodes and print them
        for i in range(len(temp)):
 
            # head of the chain at that index
            head = temp[i]
 
            while (head != None):
                print("key = \" {} \", val = {}" .format(head.key,head.value))
 
                head = head.next
        print()
 
 
if __name__ == '__main__':
    # Creating the Map
    map = Map()
 
    # Inserting elements
    map.insert(1, "Geeks")
    map.printMap()
 
    map.insert(2, "forGeeks")
    map.printMap()
 
    map.insert(3, "A")
    map.printMap()
 
    map.insert(4, "Computer")
    map.printMap()
 
    map.insert(5, "Portal")
    map.printMap()
