# # get number of 1's from a binary array
# def get_ones(arr):
#     count = 0
#     for i in arr:
#         if i == 1:
#             count += 1
#     return count


# array = input()
# array = array.split()
# array = [int(i) for i in array]
# print(get_ones(array))


# given a stack of integers, sort it in descending order using anohter temporary stack
# def sort_stack(stack):
#     temp = []
#     while stack:
#         current = stack.pop()
#         while temp and current > temp[-1]:
#             stack.append(temp.pop())
#         temp.append(current)
#     return temp


# stack = input().split()
# print(sort_stack(stack))

# if a string is palindrome, then minimum 0 cuts are needed
# if a string of length n containing all different characters, then minimum n-1 cuts are needed

# def min_cuts(s):
#     n = len(s)
#     cuts = [0] * n
#     for i in range(n):
#         min_cuts = i
#         for j in range(i + 1):
#             if is_palindrome(s[j:i + 1]):
#                 min_cuts = 0 if j == 0 else min(min_cuts, cuts[j - 1] + 1)
#         cuts[i] = min_cuts
#     return cuts[n - 1]


# def is_palindrome(s):
#     return s == s[::-1]


# s = input()
# print(min_cuts(s))


# get repeated elements in an array
# input 7
# 1 2 3 6 3 6 1
# output 1 3 6

def get_repeated(arr):
    repeated = []
    for i in arr:
        if arr.count(i) > 1 and i not in repeated:
            repeated.append(i)
    return repeated


n = int(input())
arr = input().split()
arr = [int(i) for i in arr]
print(get_repeated(arr))
