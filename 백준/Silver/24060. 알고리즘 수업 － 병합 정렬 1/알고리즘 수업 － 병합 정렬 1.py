def merge_sort(arr, l, r):
    if l < r:
        half = (l + r) // 2
        merge_sort(arr, l, half)
        merge_sort(arr, half + 1, r)
        merge(arr, l, half, r)


def merge(arr, start, m, end):
    global cnt, result
    left = start
    right = m + 1
    temp = []

    while left <= m and right <= end:
        if arr[left] <= arr[right]:
            temp.append(arr[left])
            left += 1
        else:
            temp.append(arr[right])
            right += 1
            
    while left <= m:
        temp.append(arr[left])
        left += 1
        
    while right <= end:
        temp.append(arr[right])
        right += 1
        
    left = start
    idx = 0

    while left <= end:
        arr[left] = temp[idx]
        cnt += 1
        if cnt == K:
            result = arr[left]
            break
        idx += 1
        left += 1


N, K = map(int, input().split())
arr = list(map(int, input().split()))
result = -1
cnt = 0
merge_sort(arr, 0, N - 1)

print(result)
