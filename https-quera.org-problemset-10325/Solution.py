def app():
    nums = tuple(map(int, input().split()))
    r, c = nums[0], nums[1]

    a = 11 - r

    if c >= 11:
        print("Left", end=" ")
        b = 21 - c

    elif c <= 10:
        print("Right", end=" ")
        b = c

    print(a, b)

if __name__ == "__main__":
    app()