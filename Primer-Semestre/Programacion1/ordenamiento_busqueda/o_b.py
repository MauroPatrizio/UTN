#Sort methods:

#Bubble sort method
def bubble_sort(list):
    n = len(list)
    
    for i in range(n):
        swapped = False
        
        for j in range(0, n-i-1):
            if list[j] > list[j+1]:
                list[j], list[j+1] = list[j+1], list[j]
                swapped = True

        if not swapped:
            break
    
    return list


#Selection sort method
def selection_sort(list):
    n = len(list)
    
    for i in range(n):
        min_index = i
        for j in range(i+1, n):
            if list[j] < list[min_index]:
                min_index = j

        list[i], list[min_index] = list[min_index], list[i]

    return list


#Insert sort method
def insert_sort(list):
    
    n = len(list)

    for i in range(1, n):
        key = list[i]
        j = i - 1

        while j >= 0 and key < list[j]:
            list[j + 1] = list[j]
            j -= 1

        list[j + 1] = key

    return list

#Merge sort method
def merge_sort(list):
    if len(list) > 1:
        mid = len(list) // 2
        left = list[:mid]
        right = list[mid:]

        merge_sort(left)
        merge_sort(right)

        left_index = right_index = merged_index = 0 

        while left_index < len(left) and right_index < len(right):
            if left[left_index] < right[right_index]:
                list[merged_index] = left[left_index]
                left_index += 1
            else:
                list[merged_index] = right[right_index]
                right_index += 1
            merged_index += 1

        while left_index < len(left):
            list[merged_index] = left[left_index]
            left_index += 1
            merged_index += 1

        while right_index < len(right):
            list[merged_index] = right[right_index]
            right_index += 1
            merged_index += 1
    
    return list

#Counting sort
def counting_sort(arr):
    if not arr:
        return arr

    max_val = max(arr)

    count = [0] * (max_val + 1)

    for num in arr:
        count[num] += 1

    sorted_arr = []
    for i in range(max_val + 1):
        sorted_arr.extend([i] * count[i])

    return sorted_arr


#Search methods

#Linear search method
def linear_search(list, target):

    for i in range(len(list)):
        if list[i] == target:
            return i 
    return -1 

#Binary search method
def binary_search(list, target):
    left= 0
    right = len(list) - 1
    
    while left <= right:
        mid = (left + right) // 2
        if list[mid] == target:
            return mid
        elif list[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return -1
