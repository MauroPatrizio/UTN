from o_b import *

#Sort methods call:

#Bubble sort
list = [72, 45, 1, 12, 0, 11, -7]
print(f"Sorted by bubble sort method is: {bubble_sort(list)}")

#Selection sort
list = [72, 45, 1, 12, 0, 11, -7]
print(f"Sorted by selection sort method is: {selection_sort(list)}")

#Insert sort
list = [72, 45, 1, 12, 0, 11, -7]
print(f"Sorted by insert sort method is: {insert_sort(list)}")

#Merge sort
list = [72, 45, 1, 12, 0, 11, -7]
print(f"Sorted by merge sort method is: {merge_sort(list)}")


#Search methods call:
list = [72, 45, 1, 12, 0, 11, -7]
target = 0

#Linear search
print(f"{target} found at index {linear_search(list, target)} by binary search" if linear_search(list, target) != -1 else f"{target} not found in the list") 

#Binary search (works with sorted lists)
list = [8, 12, 17, 23, 36, 45, 53, 67, 74, 91]
target = 74
print(f"{target} found at index {binary_search(list, target)} by binary search" if binary_search(list, target) != -1 else f"{target} not found in the list") 

