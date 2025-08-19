import array
import numpy as np

# -----------------------------
# 1. Using Python's array module
# -----------------------------

print("=== Integer Array (array module) ===")
int_array = array.array('i', [1, 2, 3, 4, 5])
print("Elements:", list(int_array))
print("Length:", len(int_array))

print("\n=== Float Array (array module) ===")
float_array = array.array('f', [1.1, 2.2, 3.3, 4.4, 5.5])
print("Elements:", list(float_array))
print("Length:", len(float_array))

# -----------------------------
# 2. Using Python Lists (for strings and general use)
# -----------------------------

print("\n=== String List ===")
string_list = ['apple', 'banana', 'cherry']
print("Elements:", string_list)
print("Length:", len(string_list))

# Demonstrating list operations
print("\n=== List Operations ===")
array_by_list = [1, 2, 3, 4, 5]
print("Original:", array_by_list)

array_by_list.append(6)
print("After append(6):", array_by_list)

array_by_list.remove(2)
print("After remove(2):", array_by_list)

array_by_list.sort()
print("After sort:", array_by_list)

array_by_list.reverse()
print("After reverse:", array_by_list)

array_by_list.insert(0, 0)
print("After insert(0, 0):", array_by_list)

array_by_list.pop()
print("After pop():", array_by_list)

# -----------------------------
# 3. Using NumPy Arrays
# -----------------------------

print("\n=== NumPy Array ===")
arr = np.array([1, 2, 3, 4, 5])
print("Array:", arr)
print("First element:", arr[0])
print("Add 10 to each element:", arr + 10)
print("Multiply each element by 2:", arr * 2)
print("Shape:", arr.shape)
