def app():
    nums = tuple(map(int, input().split()))
    x1, y1, x2, y2 = nums[0], nums[1], nums[2], nums[3]

    if x1 == x2:
        print("Vertical")
    elif y1 == y2:
        print("Horizontal")
    else:
        print("Try again")


if __name__ == "__main__":
    app()