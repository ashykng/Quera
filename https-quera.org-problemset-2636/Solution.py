def app():
    needed = (1, 1, 2, 2, 2, 8)
    nums = tuple(map(int, input().split()))
    for index, num in enumerate(nums):
        print(needed[index] - num, end=" ")



if __name__ == "__main__":
    app()