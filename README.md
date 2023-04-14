# [Sorting-Algorithms](https://en.wikipedia.org/wiki/Sorting_algorithm)
### Sorting Algorithms: Insertion Sort, Bubble Sort, Merge Sort, Quick Sort, Heap Sort, Bucket Sort, Radix Sort, External Sort

*[Insertion Sort.](https://en.wikipedia.org/wiki/Insertion_sort)*
------------------


The insertion-sort algorithm sorts a list of values by repeatedly inserting a new element into a sorted sublist until the whole list is sorted. The insertion sort algorithm presented here sorts a list of elements by repeatedly inserting a new element into a sorted partial array until the whole array is sorted. At the kth iteration, to insert an element into an array of size k, it may take k comparisons to find the insertion position, and k moves to insert the element. Let T(n) denote the complexity for insertion sort and c denote the total number of other operations such as assignments and additional comparisons in each iteration.

![image](https://user-images.githubusercontent.com/24220136/231912384-5a5c3513-553a-457b-a53a-97b02753c14d.png)

Insertion Sort algorithm implementation in Java, and demo result:

![image](https://user-images.githubusercontent.com/24220136/231912551-6f022f15-5e03-4ec2-aae9-b19bb5870351.png)

*[Bubble Sort.](https://en.wikipedia.org/wiki/Bubble_sort)*
------------------


A bubble sort sorts the array in multiple phases. Each pass successively swaps the neighboring elements if the elements are not in order. The bubble sort algorithm makes several passes through the array. On each pass, successive neighboring pairs are compared. If a pair is in decreasing order, its values are swapped; otherwise, the values remain unchanged. The technique is called a bubble sort or sinking sort, because the smaller values gradually “bubble” their way to the top and the larger values sink to the bottom. After the first pass, the last element becomes the largest in the array. After the second pass, the second-to-last element becomes the second largest in the array. This process is continued until all elements are sorted.

![image](https://user-images.githubusercontent.com/24220136/231914919-e37fb411-bdf2-4444-b88d-5d7438fd8459.png)

Bubble Sort algorithm implementation in Java, and demo result:

![image](https://user-images.githubusercontent.com/24220136/231914958-071f4081-1ad6-4ae7-ae5a-6c73ed1599c7.png)

*[Merge Sort.](https://en.wikipedia.org/wiki/Merge_sort)*
------------------

The merge sort algorithm can be described recursively as following: The algorithm divides the array into two halves and applies a merge sort on each half recursively. After the two halves are sorted, merge them. Following illustrates a merge sort of an array of eight elements (2 9 5 4 8 1 6 7). The original
array is split into (2 9 5 4) and (8 1 6 7). Apply a merge sort on these two subarrays recursively to split (2 9 5 4) into (2 9) and (5 4) and (8 1 6 7) into (8 1) and (6 7). This process continues until the subarray contains only one element. For example, array (2 9) is split into the subarrays (2) and (9). Since array (2) contains a single element, it cannot be further split. Now merge (2) with (9) into a new sorted array (2 9); merge (5) with (4) into a new sorted array (4 5). Merge (2 9) with (4 5) into a new sorted array (2 4 5 9), and finally merge (2 4 5 9) with (1 6 7 8) into a new sorted array (1 2 4 5 6 7 8 9).

![image](https://user-images.githubusercontent.com/24220136/231917762-91546175-e36f-4afb-8ba1-cf1f2cf506d9.png)

Merge Sort algorithm implementation in Java, and demo result:

![image](https://user-images.githubusercontent.com/24220136/231917835-0ae7596b-3787-4be0-854f-9d578edf0a1c.png)


