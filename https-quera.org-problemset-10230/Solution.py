def app():
    nums = list(map(int, input().split()))

    if 0 not in nums and sum(nums) == 180:
        print("Yes")
    else:
        print("No")


if __name__ == "__main__":
    app()
